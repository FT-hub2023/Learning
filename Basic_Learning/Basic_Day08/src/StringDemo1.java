public class StringDemo1 {
    public static void main(String[] args) {
        String s = "15934334930";
        String s1 = s.substring(0, 3) + "****" + s.substring(7, 11);
        System.out.println(s1);
        System.out.println("------------------------------------");
        char[] charArray = s.toCharArray();
        for (int i = 3; i < charArray.length-4; i++) {
            charArray[i] = '*';
        }
        System.out.println(charArray);
    }
}
