

public class videoHash48 {
    public static void main(String[] args) {
        // calc obj = new calc();
        // int r1 = obj.add(1, 4);
        // int r2 = obj.sub(5, 3);
        // System.out.println(r1 + " " + r2);

        veryAdvCalc obj = new veryAdvCalc();
        int r1 = obj.add(1, 4);
        int r2 = obj.sub(5, 3);
        int r3 = obj.multi(2, 3);
        int r4 = obj.div(6, 2);
        double r5 = obj.power(2, 3);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
    }
}
