package com.teacherandstudent.pep;

public class Teacher extends Person {

    public void teach() {
        System.out.println(super.getName() + "，" + super.getAge() + "岁");
    }

    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }
}
