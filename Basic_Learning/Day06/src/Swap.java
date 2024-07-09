public class Swap {
    public static void main(String[] args) {
        swap2();
        System.out.println("-------------------------------------------");
        int[] arr1 = {11, 22, 33, 44, 55};
        int[] arr2 = {66, 77, 88, 99, 100};
        swap(arr1, arr2);
        System.out.println("Arr1=");
        printArray(arr1);
        System.out.println("Arr2=");
        printArray(arr2);
    }

    public static void swap2() {
        int a = 8;
        int b = 3;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void swap(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return;
        }
        for (int i = 0; i < arr1.length; i++) {
            int temp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = temp;
        }
    }
}
