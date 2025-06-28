class A {
  public A() {
    System.out.println("inside A constructor");
  }

  public A(int n) {
    System.out.println("inside int A");
  }
}

class B extends A {
  public B() {
    // super(); // even if we don't mention it is there, JOHN CENA "you can't see me."
    System.out.println("inside B constructor");
  }

  public B(int n) {
    this();
    System.out.println("inside int B");
  }
}

 
public class videoHash51 {
  public static void main(String[] args) {
    B obj = new B(5);
  }
}
