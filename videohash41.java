class Human {
    private int age; 
    private String name; 

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}

public class videohash41 {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(25);
        obj.setName("basu c kallapur"); 

        System.out.println(obj.getAge() + ":" + obj.getName());

    }
}
// in most of IDE we don't need to type for getters and setters, what we can do is, right click -> source action.. -> generate getters and setters -> select the variables we want to generate getters and setters for -> click ok