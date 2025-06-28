class calc {
    public int sum(int n1, int n2) {
        return n1 + n2;
    }
}

class advCalc extends calc{
    public int sum(int n1, int n2) {
        return n1 + n2 + 5;
    }
}

public class videoHash52_calcEx {
    public static void main(String[] args) {
        advCalc obj = new advCalc();
        int sum = obj.sum(5, 5);
        System.out.println("Sum of 5 and 5 is: " + sum);
    }
    // this is an example of method overriding
    // in this case, the sum method in advCalc overrides the sum method in calc
}
