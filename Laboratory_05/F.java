package Laboratory_05;

public class F extends E {

    protected String f;

    public F(String a, String b, String c, String d, String e, String f, X x)
    {
        super(a, b, c, d, e, x);
        this.f = f;
    }

    public void printClass()
    {
        System.out.println("Class F: ");
        System.out.println(f);
        System.out.println(x.getX());
        super.printClass();
    }
}
