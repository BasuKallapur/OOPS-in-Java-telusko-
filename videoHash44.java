class Human {
    private int age; // age is instance variable
    private String name;

    // // Constructor
    // public Human() { // default constructor.
    //     age = 18;
    //     name = "basu c kallapur"; // default values are assigned to instance variables
    // }

    // public Human(int a, String n) { // parameterized constructor
    //     age = a;
    //     name = n;
    // }


    public Human() {

    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }


    public void setAge(int age) { // a is local variable
        this.age = age; // this keyword which represents the current object is used to differentiate between the instance variable and the local variable
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class videoHash44 {
    public static void main(String[] args) {
        Human obj = new Human();
        // Human obj1 = new Human(108, "basanna kallapur");
        System.out.println(obj.getAge() + ":" + obj.getName()); // default values are printed before setting them
        // System.out.println(obj1.getAge() + ":" + obj1.getName()); // default values are printed before setting them
        obj.setAge(25);
        obj.setName("basu c kallapur"); 
        System.out.println(obj.getAge() + ":" + obj.getName()); // now the values are printed after setting them
    }
}