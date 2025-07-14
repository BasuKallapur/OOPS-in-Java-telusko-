enum Status {
    Running, Pending, Failed, Success;
}

public class videoHash69 {
    public static void main(String[] args) {
        Status s = Status.Success;
        
        // using switch
        switch (s) {
            case Running:
                System.out.println("All good");
                // break;
                case Failed:
                System.out.println("oops failed! try again");
                // break;
                case Pending:
                System.out.println("wait a sec");
                // break;
                case Success:
                System.out.println("Done");
                // break;
        }

        // // using if-else
        // if (s == Status.Running) System.out.println("All good");
        // else if(s == Status.Failed) System.out.println("oops failed! try again");
        // else if (s == Status.Pending) System.out.println("wait a sec");
        // else System.out.println("Done");

    }
}
