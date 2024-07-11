public class Pass {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (isPass(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPass(int num) {
        if (num == 7 || num % 10 == 7 || num / 10 % 10 == 7 || num % 7 == 0) {
            return false;
        }
        return true;
    }
}
