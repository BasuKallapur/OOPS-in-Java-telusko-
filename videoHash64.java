abstract class A {
    public abstract void show();
    public abstract void config();
}

public class videoHash64 {
    public static void main(String[] args) {
        A obj= new A() {
            public void show() {
                System.out.println("in show");
            }

            public void config() {
                System.out.println("in config");
            }
            
        };
        obj.show();
        obj.config();

        // abstract and anonymous inner class
    }
}
