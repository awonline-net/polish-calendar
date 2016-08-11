package net.awonline.calendar.polish.nonworkingday;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import net.awonline.calendar.Day;
import net.awonline.calendar.polish.AbstractPolishNonWorkingDayTestSuite;

import org.junit.Before;
import org.junit.Test;

public class SecondDayOfChristmasTest extends AbstractPolishNonWorkingDayTestSuite {

	protected static final int TWENTY_SIXTH_DAY_OF_MONTH = 26;

	private SecondDayOfChristmas secondDayOfChristmas;

	@Before
	public void setUp() {
		secondDayOfChristmas = new SecondDayOfChristmas();
	}

	@Test
	public void isTheDayPositiveTest() {
		Day day = new Day(YEAR_2012, DECEMBER, TWENTY_SIXTH_DAY_OF_MONTH);

		boolean result = secondDayOfChristmas.isTheDay(day);

		assertTrue("Second Day of Christmas should be on twenty sixth december", result);
	}

	@Test
	public void isTheDayWrongMonthTest() {
		Day day = new Day(YEAR_2012, JANUARY, TWENTY_SIXTH_DAY_OF_MONTH);

		boolean result = secondDayOfChristmas.isTheDay(day);

		assertFalse("Second Day of Christmas shouldn't be in januray", result);
	}

	@Test
	public void isTheDayWrongDayOfMonthTest() {
		Day day = new Day(YEAR_2012, DECEMBER, FIRST_DAY_OF_MONTH);

		boolean result = secondDayOfChristmas.isTheDay(day);

		assertFalse("Second Day of Christmas shouldn't be on the first day of month", result);
	}
}
