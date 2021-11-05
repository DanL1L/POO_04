package Laboratory_05;

public class H extends G {

    protected String h;

    public H(String a, String b, String c, String d, String e, String f, String g, String h, X x)
    {
        super(a, b, c, d, e, f, g, x);
        this.h = h;
    }

    public void printClass()
    {
        System.out.println("Class H: ");
        System.out.println(h);
        System.out.println(x.getX());
        super.printClass();
    }
}
