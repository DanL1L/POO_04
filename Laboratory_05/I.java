package Laboratory_05;

public class I extends H {

    protected String i;

    public I(String a, String b, String c, String d, String e, String f, String g, String h, String i, X x)
    {
        super(a, b, c, d, e, f, g, h, x);
        this.i = i;
    }

    public void printClass()
    {
        System.out.println("Class I: ");
        System.out.println(i);
        System.out.println(x.getX());
        super.printClass();
    }
}
