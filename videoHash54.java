import other.*;

class Z extends X {
    public void abc() {
        System.out.println("marks: " + marks); // accessible because Z is a subclass of X
    }
}

public class videoHash54 {
    public static void main(String[] args) {
        X obj = new X();
        System.out.println("marks: " + obj.marks);
        Y obj1 = new Y();
        System.out.println("marks: " + obj1.marks); 
    }
}
