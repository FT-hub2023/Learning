import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        guess();
    }

    public static void guess() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int guess = (rand.nextInt(100) + 1);
        System.out.println("You should guess: " + guess);
        for(;;){
            System.out.println("Guess a number between 1 and 100");
            int guessNum = sc.nextInt();
            if(guessNum == guess){
                System.out.println("Congratulations! You win!");
                break;
            }else if(guessNum > guess){
                System.out.println("Sorry! You lose!Try again!A smaller one!");
            } else if (guessNum < guess) {
                System.out.println("Sorry! You lose!Try again!A bigger one!");
            }
        }
    }
}
