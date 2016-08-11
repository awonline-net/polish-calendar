package net.awonline.calendar.polish.nonworkingday;

import java.util.Calendar;

import net.awonline.calendar.nonworkingday.day.AbstractDayOfMonthBasedNonWorkingDay;

public class AssumptionOfTheBlessedVirginMary extends AbstractDayOfMonthBasedNonWorkingDay {

	private static final String NAME = "Assumption of the Blessed Virgin Mary";

	private static final int MONTH_OF_YEAR = Calendar.AUGUST;
	private static final int DAY_OF_MONTH = 15;

	public AssumptionOfTheBlessedVirginMary() {
		super(NAME, MONTH_OF_YEAR, DAY_OF_MONTH);
	}
}
