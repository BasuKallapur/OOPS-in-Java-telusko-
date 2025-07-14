// lambda expressions

interface A {
    void show(int i);
}

// class B implements A {
//     public void show() {
//         System.out.println("in show");
//     }
// }

public class videoHash74 {
    public static void main(String[] args) {
        // A obj1 = new B();
        // obj1.show();

        // or using anonymous interface
        A obj2= i -> System.out.println("in show" + " : " + i);
        obj2.show(2);
    }    
}

