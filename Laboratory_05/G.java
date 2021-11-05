package Laboratory_05;

public class G extends F {

    public String g;

    public G(String a, String b, String c, String d, String e, String f, String g, X x)
    {
        super(a, b, c, d, e ,f, x);
        this.g = g;
    }

    public void printClass()
    {
        System.out.println("Class G: ");
        System.out.println(g);
        System.out.println(x.getX());
        super.printClass();
    }
}
