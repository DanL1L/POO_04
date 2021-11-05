package Laboratory_05;

public class E extends D
{
    public String e;

    public E(String a, String b, String c, String d, String e, X x)
    {
        super(a, b, c, d, x);
        this.e = e;
    }

    public void printClass()
    {
        System.out.println("Class E: ");
        System.out.println(e);
        System.out.println(x.getX());
        super.printClass();
    }
}
