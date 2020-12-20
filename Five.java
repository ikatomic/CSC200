package Unit2;

import java.util.Scanner;

public class Five {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter a 5 digit integer");
		int number = keyboard.nextInt();
		if ((number < 10000) || (number > 99999)) {
			System.out.println("That number isn't 5 digits");
			System.exit(0);
		}
		int digit1 = number / 10000;
		int digit2 = (number / 1000) % 10;
		int digit3 = (number / 100) % 10;
		int digit4 = (number % 100) / 10; // I didn't wanna just follow the same pattern so I found a different way
		int digit5 = number % 10;

		System.out.println("Each Digit:   " + digit1 + "   " + digit2 + "   " + digit3 + "   " + digit4 + "   " + digit5);
		keyboard.close();
	}
}
