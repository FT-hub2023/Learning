import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int[] array = {654, 348, 382, 473, 932};
        printArray(array);
        System.out.println("---------------------------------");
        System.out.println(findMax(array));
        System.out.println("---------------------------------");
        int[] array2 = new int[100];
        getArray(0, 100, array2);
        printArray(array2);
        System.out.println("---------------------------------");
        System.out.println(findMax(array2));
    }

    public static void getArray(int min, int max, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomNumber(min, max);
        }
    }

    public static int getRandomNumber(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = array[i] < max ? max : array[i];
        }
        return max;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
