class Human {
    private int age;  // age is instance variable
    private String name; 

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

public class videoHash42 {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(25);
        obj.setName("basu c kallapur"); 

        System.out.println(obj.getAge() + ":" + obj.getName());

    }
}