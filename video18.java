class mobile {
    String brand;
    int price;
    static String type;

    
    public mobile() {
        // Constructor can be used to initialize default values if needed
        brand = "";
        price = 108;
        System.out.println("this is a constructor");
    }

    static
    {
        type = "smartphone";
        System.out.println("this is a static block");
    }
    // here static block is called first, irrespective of the order of declaration

    public void show() {
        System.out.println(brand + ":" + price + ":" + type);
    }
}

public class video18 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("mobile"); // this will load the class mobile, even if we don't create an object

        
        // mobile obj1 = new mobile();
        // // obj1.brand = "Samsung";
        // // obj1.price = 1000;
        // // mobile.type = "smartphone"; // type is static variable, shared by all instances
        // // obj1.show();

        // mobile obj2 = new mobile();


        // if we don't create object , it won't load class as well, 
        // what if we I want to do that even without creating an object?
        // here we use Class "Class"
        
        
        // try {
        //     Class.forName("mobile");
        // } 
        // catch (ClassNotFoundException e) {
        //     e.printStackTrace();
        // }

       
    }
}
