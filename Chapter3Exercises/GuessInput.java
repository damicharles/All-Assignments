import java.util.Scanner;
public class GuessInput {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        int mysteryNumber = 9;
        System.out.println("Enter a number: ");
        int guessNumber = input.nextInt();

        if (guessNumber == mysteryNumber) {
            System.out.print("Correct");
            if (guessNumber > mysteryNumber) {
                System.out.println("Too high");
                if (guessNumber < mysteryNumber) {
                    System.out.println("Too low");
                }
            }
        }
    }
}