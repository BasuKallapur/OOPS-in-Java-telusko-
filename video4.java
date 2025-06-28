class calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, int b, int c, int d) {
        return a + b + c + d;
    }
}

public class video4 {  // actually video5
    public static void main(String[] args) {
        calculator obj = new calculator();
        int ans = obj.add(1, 2);
        System.out.println(ans); 
    }
}
