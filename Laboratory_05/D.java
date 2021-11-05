package Laboratory_05;

public class D extends C {
    protected String d;

    public D(String a, String b, String c, String d, X x)
    {
        super(a, b, c, x);
        this.d = d;
    }

    public void printClass()
    {
        System.out.println("Class D: ");
        System.out.println(d);
        System.out.println(x.getX());
        super.printClass();
    }
}
