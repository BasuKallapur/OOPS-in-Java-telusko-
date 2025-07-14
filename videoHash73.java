interface A {
    void show();
}

class B implements A {
    public void show() {
        System.out.println("in show");
    }
}

public class videoHash73 {
    public static void main(String[] args) {
        // A obj1 = new B();
        // obj1.show();

        // or using anonymous interface
        A obj2= new A() {
            public void show() {
                System.out.println("in show");
            }
        };
        obj2.show();
    }    
}
