class laptop {
    String model;
    int price;

    public String toString() { // overriding toString() method of Object class, if we don't mention this method, then by default toString() method of Object class will be called, which gives class name and hashcode of the object
        return model + ":" + price;
    }

    public boolean equals(laptop that) {
        return this.model.equals(that.model) && this.price == that.price;
    }
    // here, we get true because we are comparing the values of model and price of both objects.
}

public class videoHash58 {
    public static void main(String[] args) {
        laptop obj1 = new laptop();
        obj1.model = "Dell Inspiron";
        obj1.price = 50000;

        laptop obj2 = new laptop();
        obj2.model = "Dell Inspiron";
        obj2.price = 50000;

        System.out.println(obj1.equals(obj2)); // here it compares the values of obj1 and obj2, they are different , hence false

        // System.out.println(obj); // by default toString() method is called, which gives class name and hashcode of the object , i.e, it is same as System.out.println(obj.toString());
    }    
}
