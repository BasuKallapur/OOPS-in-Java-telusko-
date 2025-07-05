// class computer {
//     public void code() {
//         // here we are doing nothing so lets make it abstract 
//     }
// }

abstract class computer {
    public abstract void code(); // abstract method
}

// interface computer {
//     void code();   // to use this comment out above abstract class and use this , but one change: change extends to implements
// }

class laptop extends computer {
    public void code() {
        System.out.println("code, cmpile, run...");
    }
}

class desktop extends computer {
    public void code() {
        System.out.println("code, compile, run... FASTER");
    }
}

class developer {
    public void devApp(computer lap) {
        lap.code();
    }
}

public class videoHash66 {
    public static void main(String[] args) {
        computer lap = new laptop();
        computer desk = new desktop();
        developer bck = new developer();

        bck.devApp(lap);

    }
}
