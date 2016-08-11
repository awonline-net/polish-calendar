package net.awonline.calendar.polish.nonworkingday;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import net.awonline.calendar.Day;
import net.awonline.calendar.polish.AbstractPolishNonWorkingDayTestSuite;

import org.junit.Before;
import org.junit.Test;

public class PolishNationalIndependenceDayTest extends AbstractPolishNonWorkingDayTestSuite {

	private static final int ELEVENTH_DAY_OF_MONTH = 11;

	private PolishNationalIndependenceDay polishNationalIndependenceDay;

	@Before
	public void setUp() {
		polishNationalIndependenceDay = new PolishNationalIndependenceDay();
	}

	@Test
	public void isTheDayPositiveTest() {
		Day day = new Day(YEAR_2012, NOVEMBER, ELEVENTH_DAY_OF_MONTH);

		boolean result = polishNationalIndependenceDay.isTheDay(day);

		assertTrue("Polish National Independence Day should be on fifteenth august", result);
	}

	@Test
	public void isTheDayWrongMonthTest() {
		Day day = new Day(YEAR_2012, DECEMBER, ELEVENTH_DAY_OF_MONTH);

		boolean result = polishNationalIndependenceDay.isTheDay(day);

		assertFalse("Polish National Independence Day shouldn't be in december", result);
	}

	@Test
	public void isTheDayWrongDayOfMonthTest() {
		Day day = new Day(YEAR_2012, NOVEMBER, FIRST_DAY_OF_MONTH);

		boolean result = polishNationalIndependenceDay.isTheDay(day);

		assertFalse("Polish National Independence Day shouldn't be on the first day of month", result);
	}
}
