public class videoHash60 {
    public static void main(String[] args) {
        int num= 5;
        // Integer num1 = new Integer(11); // boxing: converting int to Integer, but it's deprecated
        Integer num1 = 11; // auto-boxing: converting int to Integer automatically
        System.out.println(num1);

        // int num2 = num1.intValue(); // unboxing: converting Integer to int ,it's done manually
        int num2 = num1.intValue(); // auto-unboxing: converting Integer to int, because its done automatically
        System.out.println(num2);

        String str = "5";
        int num3= Integer.parseInt(str); // converting String to int
        System.out.println(num3*3);
    }
}
