package net.awonline.calendar.polish.nonworkingday;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import net.awonline.calendar.Day;
import net.awonline.calendar.polish.AbstractPolishNonWorkingDayTestSuite;

import org.junit.Before;
import org.junit.Test;

public class NationalDayOfThirdMayTest extends AbstractPolishNonWorkingDayTestSuite {

	private NationalDayOfThirdMay nationalDayOfThirdMay;

	@Before
	public void setUp() {
		nationalDayOfThirdMay = new NationalDayOfThirdMay();
	}

	@Test
	public void isTheDayPositiveTest() {
		Day day = new Day(YEAR_2012, MAY, THIRD_DAY_OF_MONTH);

		boolean result = nationalDayOfThirdMay.isTheDay(day);

		assertTrue("National Day of 3rd May should be on third may", result);
	}

	@Test
	public void isTheDayWrongMonthTest() {
		Day day = new Day(YEAR_2012, APRIL, THIRD_DAY_OF_MONTH);

		boolean result = nationalDayOfThirdMay.isTheDay(day);

		assertFalse("National Day of 3rd May should be in may", result);
	}

	@Test
	public void isTheDayWrongDayOfMonthTest() {
		Day day = new Day(YEAR_2012, MAY, SECOND_DAY_OF_MONTH);

		boolean result = nationalDayOfThirdMay.isTheDay(day);

		assertFalse("National Day of 3rd May should be on the third day of month", result);
	}

}
