class mobile {
    String brand;
    int price;
    static String type;

    public void show() {
        System.out.println(brand + ":" + price + ":" + type);
    }
}

public class video17 {
    public static void main(String[] args) {
        mobile obj1 = new mobile();
        obj1.brand = "Samsung";
        obj1.price = 1000;
        mobile.type = "smartphone"; // type is static variable, shared by all instances
        obj1.show();

        mobile obj2 = new mobile();
        obj2.brand = "Apple";
        obj2.price = 1200;
        mobile.type = "smartphone";
        obj2.show();
    }
}
