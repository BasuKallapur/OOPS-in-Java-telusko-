class calc { // here we can see, if using final, we cannot extend the calc class anymore, it is a final class, it prevents inheritance    
    public final void show() { // here final stops mthod overriding
        System.out.println("by basu kallapur");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

class advCalc extends calc{ // here we can see, without using final, we can extend the calc class and add more functionality
    public void show() {
        System.out.println("by other person.");
    }
}

public class videoHash57 {
    public static void main(String[] args) {
        // // Final for variables
        // int num = 55;
        // num = 66; // this is allowed, we can change the value of num

        // final int num = 55; // final means we cannot change the value of num, it is a constant
        // num = 66; // this will give an error, we cannot change the value of num as it is final

        // Final for class
        advCalc obj = new advCalc();
        obj.show();
        obj.add(5, 10);


    }    
}
