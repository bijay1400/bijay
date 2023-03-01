import java.util.Scanner;
import java.util.Random;
public class Game {
    public static void main(String[] args) {
        Random rand = new Random();
        int random = rand.nextInt(100);
        guess play = new guess(random);
        boolean check = false;
        while(check != true){
            play.takeUserInput();
            play.setNumberGuesses();
           check = play.isCorrectNum();
        }
        System.out.printf("You guessed it right in %d attempts.",play.getNumberGuesses());
    }
}
    class guess {
        int num;
        int input_number;
        int noguess = 0;

        guess(int num) {
            this.num = num;
        }

        void takeUserInput() {
            Scanner it = new Scanner(System.in);
            System.out.print("Predict the number: ");
            int input = it.nextInt();
            this.input_number = input;
        }

        void setNumberGuesses() {
            this.noguess = noguess + 1;
        }

        int getNumberGuesses() {
            return noguess;
        }

        boolean isCorrectNum() {
            if (input_number > num) {
                System.out.println("Your guessed very high.");
                return false;
            } else if (input_number < num) {
                System.out.println("You guessed very low.");
                return false;
            }
            return true;
        }

    }
