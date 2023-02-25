// Készítő: Király Péter, 2023-02-21 (SZOFT-1-2-E)

public class Emloyee {

    // Név:Anyja neve:Település:Lakcím:Fizetés:Születés:Jutalom

    private String name;
    private String mothersName;
    private String city;
    private String address;
    private String salary;
    private String birthDate;
    private String reward;

    public Emloyee(){

        name = "";
        mothersName = "";
        city = "";
        address = "";
        salary = "";
        birthDate = "";
        reward = "";
    }

    // Get
    public String getName(){
        return name;
    }

    public String getmothersName(){
        return mothersName;
    }
    
    public String getCity(){
        return city;
    }

    public String getAddress(){
        return address;
    }

    public String getSalary(){
        return salary;
    }

    public String getBirthDate(){
        return birthDate;
    }

    public String getReward(){
        return reward;
    }
    
    // Set
    public void setName(String name){
        this.name = name;       
    }

    public void setMothersName(String mothersName){
        this.mothersName = mothersName;
    }

    public void setCity(String city){
        this.city = city;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setSalary(String salary){
        this.salary = salary;
    }

    public void setBirthDate(String birthDate){
        this.birthDate = birthDate;
    }

    public void setReward(String reward){
        this.reward = reward;
    }

    
}
