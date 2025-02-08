package Oops;

class Employee {

    String name;
    int id;

    Employee(String name, int id){

        this.name = name;
        this.id = id;

    }

    void work(){
        System.out.println(name + " with ID : " + id + " is Working. ");
    }

}
// Single Level Inheritance
class Developer extends Employee {

    String programmingLanguage;
    
    Developer(String name, int id, String language){
        super(name,id);
        programmingLanguage = language;
    }

    void develop(){

        System.out.println(name + " is developing programs in " + programmingLanguage);

    }

}

// Multi-Level Inheritance
class SeniorDeveloper extends Developer {

    int experience;

    SeniorDeveloper(String name, int id, String language, int experience){

        super(name, id, language);
        this.experience = experience;

    }

    void getExperience(){

        System.out.println(name + " has " + experience + " years of experience.");

    }


}


// Hierarchical Inheritance
class Manager extends Employee{

    int teamSize;

    Manager(String name, int id, int teamSize){
        super(name, id);
        this.teamSize = teamSize;
    }

    void manageTeam(){
        System.out.println("Manager "+ name + " is managing team with size of " + teamSize);
    }

}

interface PartTime{
    void workPartTime();
}

interface FullTime{
    void workFullTime();
}

class Freelancer implements PartTime,FullTime{

    public void workPartTime(){
        System.out.println("X is working part time");
    }

    public void workFullTime(){
        System.out.println("X is working full time");
    }

}
//Mulitple Inheritance
class Freelancer1 extends Employee implements PartTime,FullTime {

    Freelancer1(String name, int id){
        super(name, id);
    }

    public void workPartTime(){
        System.out.println(name + " is working part time");
    }

    public void workFullTime(){
        System.out.println(name + " is working full time");
    }

}

public class Inheritance {

    public static void main(String[] args) {
        Developer d = new Developer("Alice", 146, "Java");
        d.work();
        d.develop();

        System.out.println();

        SeniorDeveloper s = new SeniorDeveloper("Bob", 128, "Cpp", 4);
        s.work();
        s.develop();
        s.getExperience();

        System.out.println();

        Manager m = new Manager("Charlie", 168, 8);
        m.work();
        m.manageTeam();

        System.out.println();

        Freelancer f = new Freelancer();
        f.workPartTime();
        f.workFullTime();

        System.out.println();

        Freelancer1 f1 = new Freelancer1("David", 186);
        f1.work();
        f1.workPartTime();
        f1.workFullTime();

    }

}