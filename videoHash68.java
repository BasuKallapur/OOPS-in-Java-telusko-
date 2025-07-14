enum Status {
    Running, Failed, Pending, Success;
}

public class videoHash68 {
    public static void main(String[] args) {
        // Status s = Status.Running;
        // System.out.println(s);

        // Status ss[] = Status.values();
        // System.out.println(ss[0]);

        // for loop to print all
        for (Status s : Status.values()) {
            System.out.println(s + ":" + s.ordinal());
        }
    }
}
