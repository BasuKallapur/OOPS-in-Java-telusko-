public class video16 {
    public static void main(String[] args) {
        // StringBuilder and StringBuffer
        StringBuffer sb = new StringBuffer("Basu");
        System.out.println("capacity is: " + sb.capacity());
        System.out.println("length is: " + sb.length());
        // append
        sb.append("c k");
        System.out.println("after append: " + sb);


        //StringBuilder
        StringBuilder sb2 = new StringBuilder("Basu");
        System.out.println("capacity is: " + sb2.capacity());
        System.out.println("length is: " + sb2.length());
        // append
        sb2.append("c k");
        System.out.println("after append: " + sb2);
        // StringBuilder is faster than StringBuffer
        // StringBuilder is not synchronized, while StringBuffer is synchronized
        // StringBuilder is generally preferred for single-threaded applications
        // StringBuffer is generally preferred for multi-threaded applications
        // StringBuilder is faster than StringBuffer because it is not synchronized
        // StringBuffer is thread-safe, while StringBuilder is not
        // StringBuilder is not synchronized, so it is faster than StringBuffer
        // StringBuffer is synchronized, so it is slower than StringBuilder
        // StringBuilder is not thread-safe, while StringBuffer is thread-safe
        // StringBuilder is generally preferred for single-threaded applications
        // StringBuffer is generally preferred for multi-threaded applications
    }
}
