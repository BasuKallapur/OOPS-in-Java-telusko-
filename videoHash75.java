// lambda expressions

interface A {
    int add(int i, int j);
}

// class B implements A {
//     public void show() {
//         System.out.println("in show");
//     }
// }

public class videoHash75 {
    public static void main(String[] args) {
        // A obj1= (i, j) ->  i + j;
        
        A obj2= new A() {
            public int add(int i, int j) {
                return i + j;
            }
        };
        
        int res = obj2.add(5, 5);
        System.out.println(res);
    }
}

