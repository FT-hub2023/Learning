package com.teacherandstudent.pep;

public class PersonTest {
    public static void main(String[] args) {
        Student st = new Student("张三", 23, 100.0);
        st.study();
        Teacher teacher = new Teacher("李四", 24);
        teacher.teach();
    }
}
