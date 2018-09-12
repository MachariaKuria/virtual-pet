
package virtualpet;

public class VirtualPet {

	private int hungerLevel;
	private int thirstLevel;
	private int sleepLevel;

	public int getHungerLevel() {
		return hungerLevel;
	}

	public int getThirstLevel() {

		return thirstLevel;
	}

	public int getSleepLevel() {

		return sleepLevel;
	}

	public void reduceHunger() {
		hungerLevel -= 5;
	}

	public void reduceThirst() {
		thirstLevel -= 5;

	}

	public void reduceSleep() {

		sleepLevel -= 5;

	}

	public void increaseHunger(int food) {

		hungerLevel += food;

	}

	public void increaseThirst(int drink) {

		thirstLevel += drink;

	}

	public void increaseSleep(int sleep) {

		sleepLevel += sleep;

	}

	public void FeedSimba() {
		hungerLevel -= 20;
	}

	public void WaterSimba() {
		thirstLevel -= 25;
	}

	public void SleepSimba() {
		sleepLevel -= 30;
	}

	public void showSimbaStatus() {
		System.out.println("Simba the Lion");
		System.out.println("");
		System.out.println("Hunger : " + getHungerLevel() + "\nThirst : " + getThirstLevel() + "\nSleep : " + getSleepLevel());
		System.out.println("");
	}
	public void menuOptions() {
		
		System.out.println("What do you want to do with Simba? \n1. Feed Simba \n2. Water Simba \n3. Sing a lullaby to make Simba sleep \n4. Do nothing");
	}
	public void tick() {

		hungerLevel += 5;
		if ((int) (Math.random() * 10) + 1 > 5) {
			simbaReaction();
		} else {
			thirstLevel += 5;
			sleepLevel += 1;
			simbaReaction();
		}

	}


	public void simbaHappy() {
		System.out.println("Simba is getting thirsty now....");
		System.out.println("^...^");
		System.out.println(" (@@)");
		System.out.println("( >o< )");
		System.out.println("(((0)))");
		System.out.println(">>>x<<<");
		
	}

	public void simbaSad() {
		System.out.println("Simba is crunky....");
		System.out.println("^...^");
		System.out.println(" (!!)");
		System.out.println("( >o< )");
		System.out.println("(((-)))");
		System.out.println(">>>x<<<");
		
	}

	public void simbaPlayfull() {
		System.out.println("^...^");
		System.out.println("(@ @)");
		System.out.println("(>o<)");
		System.out.println("(=0=)");
		System.out.println(">>>x<<<");
		System.out.println("Look! Simba is happy now....");
	}

	public void simbaReaction() {
		if (getHungerLevel() <=10) {
			simbaHappy();
		} else if (getThirstLevel() <=10) {
			simbaPlayfull();
		} else if (getSleepLevel() <=10) {
			simbaSad();	
		}else  {
			simbaPlayfull();
		}
	}

	public VirtualPet(int hungerLevel, int thirstLevel, int sleepLevel) {

		this.hungerLevel = hungerLevel;
		this.thirstLevel = thirstLevel;
		this.sleepLevel = sleepLevel;
	}

	public VirtualPet() {
		this.hungerLevel = 10;
		this.thirstLevel = 10;
		this.sleepLevel = 10;
	}


}
