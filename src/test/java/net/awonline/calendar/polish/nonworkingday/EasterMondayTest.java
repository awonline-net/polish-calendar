package net.awonline.calendar.polish.nonworkingday;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;

import net.awonline.calendar.Day;
import net.awonline.calendar.polish.AbstractPolishNonWorkingDayTestSuite;

import org.junit.Before;
import org.junit.Test;

public class EasterMondayTest extends AbstractPolishNonWorkingDayTestSuite {

	private EasterMonday easterMonday;

	@Before
	public void setUp() {
		easterMonday = new EasterMonday();
	}

	@Test
	public void isTheDayPositiveTest() {
		Day day = new Day(YEAR_2012, Calendar.APRIL, 9);

		boolean result = easterMonday.isTheDay(day);

		assertTrue("Easter Monday in year " + YEAR_2012 + " should be on ninth april", result);
	}

	@Test
	public void isTheDayNegativeTest() {
		Day day = new Day(YEAR_2012, Calendar.APRIL, 10);

		boolean result = easterMonday.isTheDay(day);

		assertFalse("Easter Monday in year " + YEAR_2012 + " shouldn't be on tenth april", result);
	}
}
