package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPet simba = new VirtualPet();

		int userInput;

		simba.showSimbaStatus();
		do {
			simba.menuOptions();
			userInput = input.nextInt();
			input.nextLine();
			simba.tick();
			switch (userInput) {
			case 1:
				simba.FeedSimba();
				break;
			case 2:
				simba.reduceThirst();
				break;
			case 3:
				simba.reduceSleep();
				break;
			default:
			}
			System.out.println("What else do you want to do with Simba the lion?");
			userInput = input.nextInt();

		} while (userInput != 4);
		simba.showSimbaStatus();
		System.out.println("Goodbye!");
		input.close();
	}

}
