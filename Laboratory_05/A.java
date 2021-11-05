package Laboratory_05;

public class A {
    protected String a;
    protected X x;
    {
        new X("hello");
    }

    public A(String a, X x) {
        this.a = a;
        this.x = x;
    }

    public void printClass() {
        System.out.println("Class A: ");
        System.out.println(a);
        System.out.println(x.getX());
    }
}
