package com.movie.get;

import java.util.Scanner;

public class Operate {
    public static void main(String[] args) {
        Movie movie1 = new Movie(1, "东八区的先生们", "2022", 2.1, "中国大陆", "剧情 喜剧", "夏睿", "张翰 王晓晨");
        Movie movie2 = new Movie(2, "上海堡垒", "2019", 2.9, "中国大陆", "爱情 战争 科幻", "滕华涛", "鹿晗 舒淇");
        Movie movie3 = new Movie(3, "纯洁心灵·逐梦演艺圈", "2015", 2.2, "中国大陆", "剧情 喜剧", "毕志飞", "朱一文 李彦漫");
        Movie[] movies = {movie1, movie2, movie3};
        Scanner sc = new Scanner(System.in);
        lo:
        while (true) {
            System.out.println("----------电影信息系统----------");
            System.out.println("请输入您的选择:");
            System.out.println("1. 查询全部电影信息");
            System.out.println("2. 根据id查询电影信息");
            System.out.println("3. 退出");
            switch (sc.nextInt()) {
                case 1:
                    see(movies);
                    break;
                case 2:
                    System.out.println("请输入要查找的电影ID：");
                    find(sc.nextInt(), movies);
                    break;
                case 3:
                    break lo;
                default:
                    System.out.println("输入错误！");
                    break;
            }
        }
    }

    public static void see(Movie[] movies) {
        for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i]);
        }
    }

    public static void find(int id, Movie[] movies) {
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getId() == id) {
                System.out.println(movies[i]);
                return;
            }
        }
        System.out.println("对不起，暂未收录！");
    }
}
