class Human {
    private int age; 
    private String name; 

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

public class videoHash40 {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(25);
        obj.setName("basu c kallapur"); 

        System.out.println(obj.getAge() + ":" + obj.getName());

    }
}
// In this code, we have a class Human with private variables age and name.
// We cannot access these variables directly from outside the class, so we use getter methods to retrieve their values and setter methods to modify them.
// This is an example of encapsulation, where we restrict direct access to the class variables and provide controlled access through methods.
// Encapsulation is a fundamental principle of object-oriented programming that helps in data hiding and abstraction.
