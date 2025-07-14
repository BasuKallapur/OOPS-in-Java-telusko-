enum laptop {
    Dell(1500), HP(1800), Asus, Mac(2500);
    
    private int price;

    public int getPrice() {
        return price;
    }

    private laptop() {
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private laptop(int price) {
        this.price = price;
    }
    
}

public class videoHash70 {
    public static void main(String[] args) {
        // laptop lap = laptop.Asus;
        // System.out.println(lap);

        // // to print both laptop name and price using getPrice() 
        // System.out.println(lap + ":" + lap.getPrice());

        // get all laptops

        // // 1. method
        // laptop arr[] = laptop.values();
        // System.out.println(arr[0] + ":" + arr[0].getPrice());

        // // 2. method
        // for (laptop s : laptop.values()) {
        //     System.out.println(s + ":" + s.getPrice());
        // }

    
        // use setPrice()
        laptop lap1 = laptop.Asus;
        lap1.setPrice(15000);
        System.out.println(lap1 + ":" + lap1.getPrice());
    
    }
}
