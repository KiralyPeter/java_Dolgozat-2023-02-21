// Készítő: Király Péter, 2023-02-21 (SZOFT-1-2-E)

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;


public class Controller{
    
    
    ArrayList<Emloyee> emloyeesList;

    public Controller(){
        emloyeesList = new ArrayList<>();
        readFile();
        countWorker();
        getCityAverage();
        highestSalary();        
    
    }

         
    

    private void readFile(){
        FileReader sourceFile = null;

        try{
            sourceFile = new FileReader("employee.csv");

        }catch(FileNotFoundException ex){
            System.out.println("Nincs meg a fájl!");

        }

        Scanner scan = new Scanner(sourceFile);
        String row = scan.nextLine();

        while(scan.hasNextLine()){
            row = scan.nextLine();
            String[] rowSP = row.split(":");
            Emloyee employee = new Emloyee();
            
            employee.setName(rowSP[0]);      
            employee.setMothersName(rowSP[1]);      
            employee.setCity(rowSP[2]);
            employee.setAddress(rowSP[3]);
            employee.setSalary(rowSP[4]);
            employee.setBirthDate(rowSP[5]);
            employee.setReward(rowSP[6]);
            
            emloyeesList.add(employee);

        }
    }

    private void countWorker(){

        int counter = 0;

        for(int i = 0; i < emloyeesList.size(); i++){
            counter ++;
        }

        System.out.println("Dolgozók létszáma: " + counter);

    }



    private void getCityAverage(){
        
        int counter = 0;
        int sumSalary = 0;
        int averageSalary = 0;
        String cityToSearch = "Doboz";

        for(int i = 0; i < emloyeesList.size(); i++){
            
            Emloyee employee = emloyeesList.get(i);
            // System.out.println(employee.getCity()); -- ez a kiiratás működik...
            
            if(employee.getCity().equals(cityToSearch)){
                 counter++;
                 sumSalary += Integer.valueOf(employee.getSalary());
                
            }            
        }
        averageSalary = sumSalary / counter;
        System.out.println("Fizetések átlaga " + cityToSearch + ": " + averageSalary + " (darabszám: " + counter + ")");
    }

    private void highestSalary(){

        int currentSalary = 0;
        int maxSalary = 0;
        String maxSalaryName = "";

        for(int i = 0; i < emloyeesList.size(); i++){

            Emloyee employee = emloyeesList.get(i);
            currentSalary = Integer.valueOf(employee.getSalary());
            if (currentSalary > maxSalary){
                maxSalary = currentSalary;
                maxSalaryName = employee.getName();
            }

        }
        System.out.println("Legjobban kereső: " + maxSalaryName + "(" + maxSalary + ")");

    }
}