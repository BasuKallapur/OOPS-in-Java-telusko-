import java.util.*;

public class VideoHash78 {
    public static void main(String[] args) {
        System.out.println("hello");
        int i = 2;
        int j = 0;
        int nums[] = new int[10];
        String str = null;
        

        try{
            j = 11 / i;
            System.out.println(str.length());
            System.out.println(nums[0]);
        }
        catch (ArithmeticException e) {
            System.out.println("something went wrong");
        }
        // try {
        //     System.out.println(nums[11]);
        // }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Index Out Of Bounds Exception maen");
        }
        catch (Exception e) {
            // Exception class handles every exception 
            System.out.println("something went wrong maen");
        }

        System.out.println(j);
    }
}
