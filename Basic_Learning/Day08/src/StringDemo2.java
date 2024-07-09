public class StringDemo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            sb.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(sb);
        System.out.println(end - start);
    }

    private static void StringBuilder01() {
        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 100000; i++) {
            s += i;
        }
        System.out.println(s);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
