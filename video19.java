class mobile {
    String brand;
    int price;
    static String type;

    public void show() { // non-static method
        System.out.println(brand + ":" + price + ":" + type);
    }

    // public static void show1() { // static method

    //     // System.out.println(brand + ":" + price + ":" + type); // this will give error, because non-static variables cannot be accessed in static method and static variables can be accessed in static method
    // }

    public static void show1(mobile obj) { // static method

        System.out.println(obj.brand + ":" + obj.price + ":" + type); // we can access non-static variables using object reference in static method
    }
}

public class video19 {
    public static void main(String[] args) {
        mobile obj1 = new mobile();
        obj1.brand = "Samsung";
        obj1.price = 1000;
        mobile.type = "smartphone"; // type is static variable, shared by all instances
        obj1.show();

        // mobile.show(); // this gives error, because we are trying to call non-static method using class name
        // mobile.show1(); // we can call static method without creating an object
        
        mobile.show1(obj1); // we can call static method without creating an object
    }
}
