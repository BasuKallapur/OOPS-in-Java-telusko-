interface A {
    void show();

    void config();
}

interface X {
    void run();
}

interface Y extends X { // inheritance 

}

class B implements A, Y {
    public void show() {
        System.out.println("in B show");
    }

    public void config() {
        System.out.println("in B config");
    }

    public void run() {
        System.out.println("run");
    }
}

public class videoHash67 {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();

        X obj1 = new B();
        obj1.run();         
    }

}
