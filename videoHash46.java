class A {
    public A() {
        System.out.println("inside A constructor");
    }

    public void show() {
        System.out.println("inside A show method");
    }
}

public class videoHash46 {
    public static void main(String[] args) { 
        new A(); // this is anonymous object, it doesn't have name, this cannot be reused
        new A().show(); // this is also anonymous object, it doesn't have name, this cannot be reused
        new A().show(); 
    }
}
