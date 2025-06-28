class A {
    public void show() {
        System.out.println("in A show");
    }
}

class B extends A {
    public void show() {
        System.out.println("in B show");
    }
}

class C extends A {
    public void show() {
        System.out.println("in C show");
    }

}

public class videoHash56 {
    public static void main(String[] args) {
        // // B obj = new B();
        // // obj.show();

        // A obj = new B(); // here we have reference of A but object of B, we can mention type as parent and object can be of child
        // obj.show();

        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
    
    // this is runtime polymorphism, here different objects have different behavior
    // same object obj.show() is behaving differently with different objects => polymorphism
    // when we compile this code, we don't know which show() method will be called, it is decided at runtime , this is called runtime polymorphism or dynamic method dispatch 
}
