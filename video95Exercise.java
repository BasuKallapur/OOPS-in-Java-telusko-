import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class video95Exercise {
    public static void main(String[] args) {
        // comparator
        Comparator<String> cmp= new Comparator<String>() {
            public int compare(String i, String j) {
                if(i.length() > j.length()) return 1;
                else
                    return -1;
            }
        };
        List<String> list = new ArrayList<>();
        list.add("dasu kallapur ece bmsce");
        list.add("basu bmsceee");
        list.add("aasuck");
        list.add("casu bmsce ece");

        Collections.sort(list, cmp);
        System.out.println(list);
    }
}
