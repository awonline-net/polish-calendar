package net.awonline.calendar.polish.nonworkingday;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import net.awonline.calendar.Day;
import net.awonline.calendar.polish.AbstractPolishNonWorkingDayTestSuite;

import org.junit.Before;
import org.junit.Test;

public class AllSaintsDayTest extends AbstractPolishNonWorkingDayTestSuite {

	private AllSaintsDay allSaintsDay;

	@Before
	public void setUp() {
		allSaintsDay = new AllSaintsDay();
	}

	@Test
	public void isTheDayPositiveTest() {
		Day day = new Day(YEAR_2012, NOVEMBER, FIRST_DAY_OF_MONTH);

		boolean result = allSaintsDay.isTheDay(day);

		assertTrue("All Saints' Day should be on first november", result);
	}

	@Test
	public void isTheDayWrongMonthTest() {
		Day day = new Day(YEAR_2012, DECEMBER, FIRST_DAY_OF_MONTH);

		boolean result = allSaintsDay.isTheDay(day);

		assertFalse("All Saints' Day shouldn't be in december", result);
	}

	@Test
	public void isTheDayWrongDayOfMonthTest() {
		Day day = new Day(YEAR_2012, NOVEMBER, SECOND_DAY_OF_MONTH);

		boolean result = allSaintsDay.isTheDay(day);

		assertFalse("All Saints' Day shouldn't be on the second day of month", result);
	}
}
