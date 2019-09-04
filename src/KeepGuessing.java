import java.util.Scanner;

public class KeepGuessing {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int secretNumber = 132, guess = 0;
        System.out.println("I'm thinking of a number between 1 and 1000");
        System.out.println("Enter the number");
        guess = input.nextInt();

        while (guess != secretNumber){
            System.out.println("\n You are wrong. Try again.");
            System.out.println("Enter the number: ");
            guess = input.nextInt();
            if (guess == 5){
                break;
            }
        }

        System.out.println("You are coreect. You win a prize");
        input.close();

    }
}
