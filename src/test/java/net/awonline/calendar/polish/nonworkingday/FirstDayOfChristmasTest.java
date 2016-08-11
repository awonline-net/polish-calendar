package net.awonline.calendar.polish.nonworkingday;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import net.awonline.calendar.Day;
import net.awonline.calendar.polish.AbstractPolishNonWorkingDayTestSuite;

import org.junit.Before;
import org.junit.Test;

public class FirstDayOfChristmasTest extends AbstractPolishNonWorkingDayTestSuite {

	protected static final int TWENTY_FIFTH_DAY_OF_MONTH = 25;

	private FirstDayOfChristmas firstDayOfChristmas;

	@Before
	public void setUp() {
		firstDayOfChristmas = new FirstDayOfChristmas();
	}

	@Test
	public void isTheDayPositiveTest() {
		Day day = new Day(YEAR_2012, DECEMBER, TWENTY_FIFTH_DAY_OF_MONTH);

		boolean result = firstDayOfChristmas.isTheDay(day);

		assertTrue("First Day of Christmas should be on twenty fifth december", result);
	}

	@Test
	public void isTheDayWrongMonthTest() {
		Day day = new Day(YEAR_2012, JANUARY, TWENTY_FIFTH_DAY_OF_MONTH);

		boolean result = firstDayOfChristmas.isTheDay(day);

		assertFalse("First Day of Christmas shouldn't be in januray", result);
	}

	@Test
	public void isTheDayWrongDayOfMonthTest() {
		Day day = new Day(YEAR_2012, DECEMBER, FIRST_DAY_OF_MONTH);

		boolean result = firstDayOfChristmas.isTheDay(day);

		assertFalse("First Day of Christmas shouldn't be on the first day of month", result);
	}
}
