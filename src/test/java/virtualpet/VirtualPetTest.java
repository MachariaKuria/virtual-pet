package virtualpet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualPetTest {

	VirtualPet underTest = new VirtualPet();

	@Test
	public void hungerShouldGoDownBy5WhenFedBy5() {

		underTest.reduceHunger();
		int check = underTest.getHungerLevel();
		assertEquals(check, 5);
	}

	@Test
	public void thirstShouldGoDownBy5WhenDrinkBy5() {

		underTest.reduceThirst();
		int check = underTest.getThirstLevel();
		assertEquals(check, 5);
	}

	@Test
	public void sleepinessShouldGoDownBy5() {

		underTest.reduceSleep();
		int check = underTest.getSleepLevel();
		assertEquals(check, 5);
	}

	@Test
	public void hungerShouldGoUpBy5WhenNotFedBy5() {

		underTest.increaseHunger(5);
		int check = underTest.getHungerLevel();
		assertEquals(check, 15);
	}

	@Test
	public void thirstShouldGoUpBy5WhenNoDrinkBy5() {

		underTest.increaseThirst(5);
		int check = underTest.getThirstLevel();
		assertEquals(check, 15);
	}

	@Test
	public void sleepinessShouldGoUpBy5() {

		underTest.increaseSleep(5);
		int check = underTest.getSleepLevel();
		assertEquals(check, 15);
	}

	@Test
	public void HungerShouldGoUpWith1Tick() {

		underTest.tick();
		int check = underTest.getHungerLevel();
		assertEquals(check, 15);

	}

	@Test
	public void HungerShouldGoUpWith2Ticks() {

		underTest.tick();
		underTest.tick();
		int check = underTest.getHungerLevel();
		assertEquals(check, 20);

	}

	@Test
	public void ThirstShouldGoUpWith1Tick() {

		underTest.tick();
		int check = underTest.getThirstLevel();
		assertEquals(check, 15);

	}

	@Test
	public void ThirstShouldGoUpWith2Ticks() {

		underTest.tick();
		underTest.tick();
		int check = underTest.getThirstLevel();
		assertEquals(check, 15);

	}

	@Test
	public void SleepShouldGoUpWith1Tick() {

		underTest.tick();
		int check = underTest.getSleepLevel();
		assertEquals(check, 11);

	}

	@Test
	public void SleepShouldGoUpWith2Ticks() {

		underTest.tick();
		underTest.tick();
		int check = underTest.getSleepLevel();
		assertEquals(check, 12);

	}
}
