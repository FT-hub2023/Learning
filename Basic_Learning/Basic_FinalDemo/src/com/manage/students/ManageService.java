package com.manage.students;

import com.manage.students.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageService {

    //用于测试
    public ManageService() {
        addStudent(new Student("zhansan", "张三", 23, "1999-01-10"));
        addStudent(new Student("lisi", "李四", 24, "2000-02-10"));
        addStudent(new Student("wangwu", "王五", 25, "2001-03-10"));
    }

    private ArrayList<Student> students = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addStudent() {
        lo:
        while (true) {
            System.out.print("请输入学生ID： ");
            String Id = sc.next();
            if (getStudentIndexById(Id) != -1) {
                System.out.println("学生ID已存在，请重新编号或检查输入！");
            } else {
                System.out.print("请输入学生姓名： ");
                String name = sc.next();
                System.out.print("请输入学生年龄： ");
                int age = sc.nextInt();
                System.out.print("请输入学生生日日期： ");
                String birthday = sc.next();

                boolean result = addStudent(new Student(Id, name, age, birthday));
                if (result) {
                    System.out.println("添加成功！");
                    System.out.println("学生信息：" + students.get(students.size() - 1));
                }
            }

            lo2:
            while (true) {
                System.out.println("请输入功能编号代码：");
                System.out.println("1)继续添加");
                System.out.println("2)返回上一级菜单");

                switch (sc.nextInt()) {
                    case 1:
                        break lo2;
                    case 2:
                        break lo;
                    default:
                        System.out.println("功能编号代码异常，请检查输入！");
                        break;
                }
            }
        }
    }

    public void removeStudent() {
        lo:
        while (true) {
            System.out.println("---------------请选择---------------");
            System.out.println("1)通过ID删除学生");
            System.out.println("2)通过学生姓名删除学生");
            System.out.println("3)上一级菜单");
            boolean result;
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("请输入学生ID：");
                    result = removeStudentById(sc.next());
                    if (result) {
                        System.out.println("删除成功！");
                    } else {
                        System.out.println("查无此人！请检查是否输入错误。");
                    }
                    break;
                case 2:
                    System.out.println("请输入学生姓名：");
                    result = removeStudentByName(sc.next());
                    if (result) {
                        System.out.println("删除成功！");
                    } else {
                        System.out.println("查无此人！请检查是否输入错误。");
                    }
                    break;
                case 3:
                    break lo;
                default:
                    System.out.println("输入的数据有误，请重新输入！");
                    break;
            }

            lo2:
            while (true) {
                System.out.println("请输入功能编号代码：");
                System.out.println("1)继续删除");
                System.out.println("2)返回上一级菜单");

                switch (sc.nextInt()) {
                    case 1:
                        break lo2;
                    case 2:
                        break lo;
                    default:
                        System.out.println("功能编号代码异常，请检查输入！");
                        break;
                }
            }
        }
    }

    public void updateStudent() {
        lo:
        while (true) {
            System.out.println("请输入要修改的学生ID：");
            String Id = sc.next();
            int index = getStudentIndexById(Id);
            if (index == -1) {
                System.out.println("查无此人！请检查输入。");
            } else {
                System.out.print("请输入学生姓名： ");
                String name = sc.next();
                System.out.print("请输入学生年龄： ");
                int age = sc.nextInt();
                System.out.print("请输入学生生日日期： ");
                String birthday = sc.next();
                students.set(index, new Student(Id, name, age, birthday));
                System.out.println("修改成功！");
                System.out.println("修改后的信息：" + students.get(index));
            }

            lo2:
            while (true) {
                System.out.println("请输入功能编号代码：");
                System.out.println("1)继续修改");
                System.out.println("2)返回上一级菜单");

                switch (sc.nextInt()) {
                    case 1:
                        break lo2;
                    case 2:
                        break lo;
                    default:
                        System.out.println("功能编号代码异常，请检查输入！");
                        break;
                }
            }
        }
    }

    public void findStudent() {
        if (students.size() == 0) {
            System.out.println("查无信息，请先添加学生信息后重试！");
        } else {
            System.out.println("---------------学生信息数据库---------------");
            for (int i = 0; i < students.size(); i++) {
                System.out.println(students.get(i));
            }
        }
    }


    private boolean addStudent(Student student) {

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(student.getId())) {
                return false;
            }
        }

        students.add(student);
        return true;

        /*if (students.contains(student)) {
            return false;
        }else {
            students.add(student);
            return true;
        }*/
    }

    private boolean removeStudentById(String Id) {
        for (int i = 0; i < students.size(); i++) {
            if (Id.equals(students.get(i).getId())) {
                students.remove(i);
                return true;
            }
        }
        return false;
    }

    private boolean removeStudentByName(String Name) {
        boolean flag = false;
        for (int i = 0; i < students.size(); i++) {
            if (Name.equals(students.get(i).getName())) {
                students.remove(i);
                i--;
                flag = true;
            }
        }
        return flag;
    }

    private int getStudentIndexById(String Id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(Id)) {
                return i;
            }
        }
        return -1;
    }

    private Student getStudentById(String Id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(Id)) {
                return students.get(i);
            }
        }
        return null;
    }

    private ArrayList<Student> getStudentByname(String name) {

        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < this.students.size(); i++) {
            if (this.students.get(i).getName().equals(name)) {
                students.add(this.students.get(i));
            }
        }
        return students;
    }
}
