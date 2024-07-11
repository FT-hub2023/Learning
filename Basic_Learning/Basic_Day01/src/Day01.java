import java.awt.*;

public class Day01 {
    public static void main(String[] args) {
        printRectangle(9);
    }

    public static void printRectangleo(int line) {
        for (int i = line; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " + j * i + "\t");
            }
            System.out.println();
        }
    }

    public static void printRectangle(int line) {
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " + j * i + "\t");
            }
            System.out.println();
        }
    }

    private static void daffodils() {
        int counter = 0;
        for (int i = 100; i <= 999; i++) {
            if (find(i)) {
                System.out.println(i);
                counter++;
            }
        }
        System.out.println("The number of daffodils in this range is " + counter + ".");
    }

    public static boolean find(int num) {
        if (num == (cube(num / 100) + cube(num / 10 % 10) + cube(num % 10))) {
            return true;
        }
        return false;
    }

    public static int cube(int num) {
        return num * num * num;
    }
}
