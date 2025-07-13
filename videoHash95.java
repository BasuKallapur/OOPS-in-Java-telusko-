import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class students {
    int age;
    String name;

    public students(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public String toString() {
        return "students [age=" + age + ", name=" + name + "]";
    }
}

public class videoHash95 {
    public static void main(String[] args) {
        Comparator<students> com= new Comparator<students>() {
            public int compare(students i, students j) {
                if(i.age > j.age) return 1; // 1 means swap 
                else return -1; // don't swap
            }
        };    

        List<students> studs = new ArrayList<>();
        studs.add(new students(7, "geeta"));
        studs.add(new students(6, "naveen"));
        studs.add(new students(5, "basu"));
        studs.add(new students(9, "praveen"));
        studs.add(new students(8, "nihal"));
        Collections.sort(studs, com);

        for (students s : studs)
            System.out.println(s);
        
    }
}
