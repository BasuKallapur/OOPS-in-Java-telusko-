class Human {
    private int age;  // age is instance variable
    private String name;
    
    // Constructor
    public Human() { // constructor will called automatically, we don't need to call it explicitly, everytime an object is created, constructor is called
        age = 18;
        name= "basu c kallapur"; // default values are assigned to instance variables
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

public class videoHash43 {
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj1 = new Human();
        System.out.println(obj.getAge() + ":" + obj.getName()); // default values are printed before setting them
        obj.setAge(25);
        obj.setName("basu c kallapur"); 
        System.out.println(obj.getAge() + ":" + obj.getName()); // now the values are printed after setting them
    }
}