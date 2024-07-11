public class StaticDemo {
    public static void main(String[] args) {
        Student st = new Student();
        System.out.println(st.name);
        System.out.println(st.age);
    }
}

class Human{
    String name;
    int age;
    String gender = "HelloWorld!";
    public Human(){
        name = "张三";
        age = 18;
        System.out.println("DDD");
    }
}

class Student extends Human{

}
