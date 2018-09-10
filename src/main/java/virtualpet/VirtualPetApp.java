package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPet simba = new VirtualPet(100, 190, 200);

		int userInput;

		System.out.println("Simba the Lion");
		System.out.println("Hunger : " + simba.getHungerLevel());
		System.out.println("Thirst : " + simba.getThirstLevel());
		System.out.println("Sleep : " + simba.getSleepLevel());

		simba.tick();
		do {
			System.out.println("What do you want to do?");
			System.out.println("1. Feed Simba \n2. Water Simba \n3. Sing a lullaby to make Simba sleep \n4. Do nothing");
			userInput = input.nextInt();
			input.nextLine();

			switch (userInput) {
			case 1:
				simba.FeedSimba();
				break;
			case 2:
				simba.WaterSimba();
				break;
			case 3:
				simba.SleepSimba();
			default:

			}
			System.out.println("Simba the Lion");
			System.out.println("Hunger : " + simba.getHungerLevel());
			System.out.println("Thirst : " + simba.getThirstLevel());
			System.out.println("Sleep : " + simba.getSleepLevel());

			System.out.println("What else do you want to do with Simba");
			System.out.println("Hunger : " + simba.getHungerLevel());
			System.out.println("Thirst : " + simba.getThirstLevel());
			System.out.println("Sleep : " + simba.getSleepLevel());
			simba.tick();
			
		} while (userInput !=4);


		input.close();
	}

}
