public class Construct {
    public Construct() {
        System.out.println("Construct");
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String[] s = {"Hello", " ", "World", "!"};
        Construct c = new Construct();
        c.main(s);
    }
}
