package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPet simba = new VirtualPet(100, 190, 200);

		String userInput;

		System.out.println("Simba the Lion");
		System.out.println("Hunger : " + simba.getHungerLevel());
		System.out.println("Thirst : " + simba.getThirstLevel());
		System.out.println("Sleep : " + simba.getSleepLevel());

		simba.tick();
		do {
			System.out.println("What do you want to do?");
			System.out.println("1. Feed Simba");
			System.out.println("2. Water Simba");
			System.out.println("3. Sing a lullaby to make Simba sleep");
			System.out.println("4. Do nothing");
			userInput = input.nextLine();

			simba.tick();

			switch (userInput) {
			case "1":
				simba.FeedSimba();
				break;
			case "2":
				simba.WaterSimba();
				break;
			case "3":
				simba.SleepSimba();
			default:
				break;

			}
			System.out.println("Simba the Lion");
			System.out.println("Hunger : " + simba.getHungerLevel());
			System.out.println("Thirst : " + simba.getThirstLevel());
			System.out.println("Sleep : " + simba.getSleepLevel());
			simba.tick();
		} while (!userInput.equals("4"));

		System.out.println("Simba the Lion");
		System.out.println("Hunger : " + simba.getHungerLevel());
		System.out.println("Thirst : " + simba.getThirstLevel());
		System.out.println("Sleep : " + simba.getSleepLevel());
		input.close();
	}

}
