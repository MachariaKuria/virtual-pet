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

	public void reduceHunger(int food) {
		hungerLevel -= food;
	}

	public void reduceThirst(int drink) {
		thirstLevel -= drink;

	}

	public void reduceSleep(int sleep) {

		sleepLevel -= sleep;

	}

	public void tick() {

		hungerLevel += 20;
		thirstLevel += 15;
		sleepLevel += 10;

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
		hungerLevel -= 10;
	}

	public void WaterSimba() {
		thirstLevel -= 15;
	}
	
	public void SleepSimba() {
		sleepLevel -= 20;
	}
	
	public VirtualPet(int hungerLevel, int thirstLevel, int sleep) {

		this.hungerLevel = hungerLevel;
		this.thirstLevel = thirstLevel;
		this.sleepLevel = sleep;
	}

	

}
