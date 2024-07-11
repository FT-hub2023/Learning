public class FindPosition {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        System.out.println(findPosition(arr, 19));
    }

    public static int findPosition(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
