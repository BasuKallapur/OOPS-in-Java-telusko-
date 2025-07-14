class A {
    public void showTheDataWhichBelongsTOThisClass()
    {
        System.out.println("in A show");
    }
}

class B extends A {
    @Override
    public void showTheDataWhichBelongsTOThisClass()
    {
        System.out.println("in B show");
    }

}

public class videoHash71 {
    public static void main(String[] args) {
        // method method overriding
        // A obj1 = new A();
        // B obj2 = new B();
        // obj1.show();
        // obj2.show();

        // // method over-riding
        // A obj3 = new B();
        // obj3.show();

        A obj4 = new B();
        obj4.showTheDataWhichBelongsTOThisClass(); // output: in A show     but output should be: in B show
        // this is Bug  
        // this occured because we missed 's', here we use annotations: ex: @override 
        // wathch ***video***


    }
}
