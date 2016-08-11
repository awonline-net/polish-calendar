package net.awonline.calendar.polish.nonworkingday;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import net.awonline.calendar.Day;
import net.awonline.calendar.polish.AbstractPolishNonWorkingDayTestSuite;

import org.junit.Before;
import org.junit.Test;

public class EpiphanyTest extends AbstractPolishNonWorkingDayTestSuite {

	private static final int SIXT_DAY_OF_MONTH = 6;
	private static final int FIFTH_DAY_OF_MONTH = 5;

	private Epiphany epiphany;

	@Before
	public void setUp() {
		epiphany = new Epiphany();
	}

	@Test
	public void isTheDayPositiveTest() {
		Day day = new Day(YEAR_2012, JANUARY, SIXT_DAY_OF_MONTH);

		boolean result = epiphany.isTheDay(day);

		assertTrue("Epiphany should be on first january", result);
	}

	@Test
	public void isTheDayWrongMonthTest() {
		Day day = new Day(YEAR_2012, FEBRUARY, SIXT_DAY_OF_MONTH);

		boolean result = epiphany.isTheDay(day);

		assertFalse("Epiphany shouldn't be in february", result);
	}

	@Test
	public void isTheDayWrongDayOfMonthTest() {
		Day day = new Day(YEAR_2012, JANUARY, FIFTH_DAY_OF_MONTH);

		boolean result = epiphany.isTheDay(day);

		assertFalse("Epiphany shouldn't be on the fifth day of month", result);
	}
}
