package Laboratory_05;

public class C extends B {
    protected String c;

    public C(String a, String b, String c, X x) {
        super(a, b, x);
        this.c = c;
    }

    public void printClass() {
        System.out.println("Class C: ");
        System.out.println(c);
        System.out.println(x.getX());
        super.printClass();
    }
}
