import java.util.Random;

public class CheckCode {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Checkcode: " + getCheckCode(5));
        }
    }

    public static String getCheckCode(int n) {
        Random rand = new Random();
        char[] contents = getContents();
        String checkCode = "";
        for (int i = 0; i < n; i++) {
            checkCode += contents[rand.nextInt(contents.length)];
        }
        return checkCode;
    }

    public static char[] getContents() {
        char[] contents = new char[26 + 26 + 10];

        int index = 0;

        for (char a = 'a'; a <= 'z'; a++) {
            contents[index++] = a;
        }
        for (char a = 'A'; a <= 'Z'; a++) {
            contents[index++] = a;
        }
        for (char a = '0'; a <= '9'; a++) {
            contents[index++] = a;
        }

        return contents;
    }
}
