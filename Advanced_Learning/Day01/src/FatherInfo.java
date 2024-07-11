public class FatherInfo {
    public static void main(String[] args) {
        C c = new C();
        c.method();
    }
}

class A{
    public void method(){
        System.out.println("A");
    }
}

class B extends A{
    public void method(){
        System.out.println("B");
    }
}

class C extends B{
    public void method(){
        super.method();
        System.out.println("C");
    }
}
