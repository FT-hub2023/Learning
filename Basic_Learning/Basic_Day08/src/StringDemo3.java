public class StringDemo3 {
    public static void main(String[] args) {

    }

    private static void StringDemo03() {
        StringBuilder sb = new StringBuilder("[");
        int[] arr = {1, 2, 3, 45, 43, 345, 3, 5354245, 3435, 345424, 332423, 42342};
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(", ");
        }
        String result = sb.toString().substring(0, sb.length() - 2) + "]";
        System.out.println(result);
    }

    private static void StringDemo02() {
        String s = "123321";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse().toString().equals(s));
    }

    private static void StringDemo() {
        StringBuilder sb = new StringBuilder();
        sb.append("HelloWorld");
        System.out.println(sb);
        sb.append("HelloWorld");
        System.out.println(sb);

        String s = "HelloWorld";
        System.out.println(s.substring(2).substring(1));
    }
}
