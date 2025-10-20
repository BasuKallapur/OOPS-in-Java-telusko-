public class videoHash80 {
    public static void main(String[] args) {
        int i = 21;
        int j = 0;
        
        try {
            j = 20 / i;
            if (j == 0)
                throw new ArithmeticException("I don't want to print zero bhai");
        }
        catch (ArithmeticException e) {
            j = 20 / 1;
            System.out.println("this is default ouptut" + e);
        }
        System.out.println(j);
        System.out.println("END OF PROGRAM");
    }
}
