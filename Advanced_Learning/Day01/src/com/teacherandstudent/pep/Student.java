package com.teacherandstudent.pep;

public class Student extends Person {
    private double score;

    public void study() {
        System.out.println(super.getName() + "，" + super.getAge() + "岁，成绩为" + score);
    }

    public Student() {
    }

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
