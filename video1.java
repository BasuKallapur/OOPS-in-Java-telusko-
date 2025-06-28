class computer {
    public void playmusic() 
    {
        System.out.println("music playing!");
    }

    public String money (int val) 
    {
        return "money";
    }
}

public class video1 {
    public static void main(String[] args) {
        System.out.println("hello world");
        computer obj = new computer();
        obj.playmusic();
        String result = obj.money(100);
        System.out.println(result);
    }
}
