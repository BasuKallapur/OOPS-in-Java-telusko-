class A {
    public void show1() {
        System.out.println("in A show1");
    }
}

class B extends A {
    public void show2() {
        System.out.println("in B show1");
    }
}

public class videoHash59 {
    public static void main(String[] args) {
        // A obj = new A(); // here obj is of type/reference A, and also object is of type A
        // obj.show1();
        
        // here we are going up, so this is called upcasting 
        A obj = (A) new B(); // here obj is of type/reference A, but object is of type B, here (A) is optional 
        obj.show1();
        
        // here we are going down, so this is called downcasting
        B obj1 = (B) obj;
        obj1.show2(); 

    }
}
