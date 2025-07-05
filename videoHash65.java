// abstract class A {
//     public abstract void show();

//     public abstract void config();
// }

// alternatively use below using interface 
interface A {
    int num = 108;
    String name = "basu kallapur";
    void show();
    void config();
}

class B implements A {
    public void show() {
        System.out.println("in B show");
    }

    public void config() {
        System.out.println("in B config");
    }
}

public class videoHash65 {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();

        System.out.println("name is :" + A.name + "number is : " + A.num);
        
        // A.name = "bck";
        // A.num = 55;  // this can't be done because, we used final keyword
    }

}
