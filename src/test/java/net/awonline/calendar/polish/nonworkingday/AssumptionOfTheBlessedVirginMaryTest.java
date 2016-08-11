package net.awonline.calendar.polish.nonworkingday;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import net.awonline.calendar.Day;
import net.awonline.calendar.polish.AbstractPolishNonWorkingDayTestSuite;

import org.junit.Before;
import org.junit.Test;

public class AssumptionOfTheBlessedVirginMaryTest extends AbstractPolishNonWorkingDayTestSuite {

	private static final int FIFTEENTH_DAY_OF_MONTH = 15;

	private AssumptionOfTheBlessedVirginMary assumptionOfTheBlessedVirginMary;

	@Before
	public void setUp() {
		assumptionOfTheBlessedVirginMary = new AssumptionOfTheBlessedVirginMary();
	}

	@Test
	public void isTheDayPositiveTest() {
		Day day = new Day(YEAR_2012, AUGUST, FIFTEENTH_DAY_OF_MONTH);

		boolean result = assumptionOfTheBlessedVirginMary.isTheDay(day);

		assertTrue("Assumption of the Blessed Virgin Mary should be on fifteenth august", result);
	}

	@Test
	public void isTheDayWrongMonthTest() {
		Day day = new Day(YEAR_2012, DECEMBER, FIFTEENTH_DAY_OF_MONTH);

		boolean result = assumptionOfTheBlessedVirginMary.isTheDay(day);

		assertFalse("Assumption of the Blessed Virgin Mary shouldn't be in december", result);
	}

	@Test
	public void isTheDayWrongDayOfMonthTest() {
		Day day = new Day(YEAR_2012, AUGUST, FIRST_DAY_OF_MONTH);

		boolean result = assumptionOfTheBlessedVirginMary.isTheDay(day);

		assertFalse("Assumption of the Blessed Virgin Mary shouldn't be on the first day of month", result);
	}
}
