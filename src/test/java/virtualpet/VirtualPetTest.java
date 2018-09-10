package virtualpet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualPetTest {

	VirtualPet underTest = new VirtualPet(0, 0, 0);

	@Test
	public void hungerShouldGoDownBy5WhenFedBy5() {

		underTest.reduceHunger(5);
		int check = underTest.getHungerLevel();
		assertEquals(check, 95);
	}

	@Test
	public void thirstShouldGoDownBy5WhenDrinkBy5() {

		underTest.reduceThirst(5);
		int check = underTest.getThirstLevel();
		assertEquals(check, 95);
	}

	@Test
	public void sleepinessShouldGoDownBy5() {

		underTest.reduceSleep(5);
		int check = underTest.getSleepLevel();
		assertEquals(check, 95);
	}

	@Test
	public void hungerShouldGoUpBy5WhenNotFedBy5() {

		underTest.increaseHunger(5);
		int check = underTest.getHungerLevel();
		assertEquals(check, 105);
	}

	@Test
	public void thirstShouldGoUpBy5WhenNoDrinkBy5() {

		underTest.increaseThirst(5);
		int check = underTest.getThirstLevel();
		assertEquals(check, 105);
	}

	@Test
	public void sleepinessShouldGoUpBy5() {

		underTest.increaseSleep(5);
		int check = underTest.getSleepLevel();
		assertEquals(check, 105);
	}

	@Test
	public void HungerShouldGoUpWith1Tick() {

		underTest.tick();
		int check = underTest.getHungerLevel();
		assertEquals(check, 120);

	}

	@Test
	public void HungerShouldGoUpWith2Ticks() {

		underTest.tick();
		underTest.tick();
		int check = underTest.getHungerLevel();
		assertEquals(check, 140);

	}

	@Test
	public void ThirstShouldGoUpWith1Tick() {

		underTest.tick();
		int check = underTest.getThirstLevel();
		assertEquals(check, 115);

	}

	@Test
	public void ThirstShouldGoUpWith2Ticks() {

		underTest.tick();
		underTest.tick();
		int check = underTest.getThirstLevel();
		assertEquals(check, 130);

	}

	@Test
	public void SleepShouldGoUpWith1Tick() {

		underTest.tick();
		int check = underTest.getSleepLevel();
		assertEquals(check, 110);

	}

	@Test
	public void SleepShouldGoUpWith2Ticks() {

		underTest.tick();
		underTest.tick();
		int check = underTest.getSleepLevel();
		assertEquals(check, 120);

	}
}
