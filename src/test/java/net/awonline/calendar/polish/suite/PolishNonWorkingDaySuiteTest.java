package net.awonline.calendar.polish.suite;

import static org.junit.Assert.assertTrue;
import junit.framework.TestSuite;

import org.junit.Before;
import org.junit.Test;

public class PolishNonWorkingDaySuiteTest extends TestSuite {

	private PolishNonWorkingDaySuite suite;

	@Before
	public void setUp() {
		suite = new PolishNonWorkingDaySuite();
	}

	@Test
	public void nonWorkingDaysSizeTest() {
		int expectedSuiteSize = 11;

		int size = suite.getSuiteSize();

		assertTrue("Polish non working days suite should have 11 non working days", expectedSuiteSize == size);
	}
}
