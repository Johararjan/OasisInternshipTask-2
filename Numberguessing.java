
import java.util.Scanner;

public class Numberguessing{
    public static void main(String arg[])
	{
        
		Scanner sc = new Scanner(System.in);

	
		int number = 1 + (int)(100*Math.random());
		int n= 5;

		int i,g;

		System.out.println("A number is chosen between 1 to 100. Guess the number within 5 trials.");
		for (i = 0; i < n; i++) {

			System.out.println("Guess the number:");
			g = sc.nextInt();

			if (number == g) {
				System.out.println("Congratulations! You guessed the number You Won.");
				break;
			}
			else if (number > g && i != n - 1) 
            {
				System.out.println("The number is greater than your choice " + g);
			}
			else if (number < g && i != n - 1) 
            {
				System.out.println("The number is less than your choice " + g);
			}
		}

		if (i == n) {
			System.out.println("Sorry You Lose You have exhausted 5 trials.");
			System.out.println("The number was " + number);
            System.out.println("Better Luck Next Time please try again");
		}
    }
	}

