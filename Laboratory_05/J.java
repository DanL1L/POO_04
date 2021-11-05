package Laboratory_05;

public class J extends I {

    protected String j;

    public J(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j, X x)
    {
        super(a, b, c, d, e, f, g, h, i, x);
        this.j = j;
    }

    public void printClass()
    {
        System.out.println("Class J: ");
        System.out.println(j);
        System.out.println(x.getX());
        super.printClass();
    }
}
