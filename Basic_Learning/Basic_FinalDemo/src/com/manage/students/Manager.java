package com.manage.students;

import java.util.Scanner;

public class Manager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ManageService manageService = new ManageService();

        while (true) {
            System.out.println("----------欢迎来到学生信息管理系统----------");
            System.out.println("1)添加学生");
            System.out.println("2)删除学生");
            System.out.println("3)修改学生");
            System.out.println("4)查看学生");
            System.out.println("5)退出系统");
            System.out.println("请输入功能数字编号：");
            switch (sc.nextInt()) {
                case 1:
                    manageService.addStudent();
                    break;
                case 2:
                    manageService.removeStudent();
                    break;
                case 3:
                    manageService.updateStudent();
                    break;
                case 4:
                    manageService.findStudent();
                    break;
                case 5:
                    System.out.println("感谢您的使用，再见！");
                    System.exit(0);
                default:
                    System.out.println("输入的数字编号有误！请重新输入！");
                    break;
            }
        }
    }
}
