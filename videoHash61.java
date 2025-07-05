abstract class car {
    public abstract void drive();
    public abstract void fly();
    public void playMusic() {
        System.out.println("playing music...");
    }
}

abstract class GWagon extends car {
    public void drive() {
        System.out.println("driving...");
    }
}

class updGwagon extends GWagon { // this class is called: concrete class
    public void fly() {
        System.out.println("flying...");
    }
}

public class videoHash61 {
    public static void main(String[] args) {
        car obj = new updGwagon();
        obj.drive();
        obj.fly();
        obj.playMusic();

    }
}

