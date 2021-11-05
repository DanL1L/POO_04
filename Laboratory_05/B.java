package Laboratory_05;

public class B extends A {
    protected String b;

    public B(String a, String b, X x) {
        super(a, x);
        this.b = b;
    }

    public void printClass() {
        System.out.println("Class B: ");
        System.out.println(b);
        System.out.println(x.getX());
        super.printClass();
    }
}
