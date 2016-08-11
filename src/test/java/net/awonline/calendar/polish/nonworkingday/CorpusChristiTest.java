package net.awonline.calendar.polish.nonworkingday;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import net.awonline.calendar.Day;
import net.awonline.calendar.polish.AbstractPolishNonWorkingDayTestSuite;

import org.junit.Before;
import org.junit.Test;

public class CorpusChristiTest extends AbstractPolishNonWorkingDayTestSuite {

	private CorpusChristi corpusChristi;

	@Before
	public void setUp() {
		corpusChristi = new CorpusChristi();
	}

	@Test
	public void isTheDayPositiveTest() {
		Day day = new Day(YEAR_2012, JUNE, 7);

		boolean result = corpusChristi.isTheDay(day);

		assertTrue("Corpus Cristi in year " + YEAR_2012 + " should be on seventh june", result);
	}

	@Test
	public void isTheDayNegativeTest() {
		Day day = new Day(YEAR_2012, JUNE, 8);

		boolean result = corpusChristi.isTheDay(day);

		assertFalse("Corpus Cristi in year " + YEAR_2012 + " shouldn't be on eighth june", result);
	}
}
