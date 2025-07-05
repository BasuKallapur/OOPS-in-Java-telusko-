class A {
    public void show() {
        System.out.println("in A show");
    }
}

// class B extends A {
//     public void show() {
//         System.out.println("in B show");
//     }
// }

public class videoHash63 {
    public static void main(String[] args) {
        A obj = new A(){
            public void show() {
                System.out.println("in NEW show");
            }
        };
        obj.show(); 
        // here we have anonymous inner class
    }
}
