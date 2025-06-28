package other;

class launch {
    public void abc() {
        X obj = new X();
        System.out.println("marks: " + obj.marks); // although marks is protected, it is accessible here because launch is in the same package as X
    }
}

public class X {
    protected int marks = 108;
}
