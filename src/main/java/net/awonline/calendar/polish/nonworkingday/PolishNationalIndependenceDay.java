package net.awonline.calendar.polish.nonworkingday;

import java.util.Calendar;

import net.awonline.calendar.nonworkingday.day.AbstractDayOfMonthBasedNonWorkingDay;

public class PolishNationalIndependenceDay extends AbstractDayOfMonthBasedNonWorkingDay {

	private static final String NAME = "Polish National Independence Day";

	private static final int MONTH_OF_YEAR = Calendar.NOVEMBER;
	private static final int DAY_OF_MONTH = 11;

	public PolishNationalIndependenceDay() {
		super(NAME, MONTH_OF_YEAR, DAY_OF_MONTH);
	}
}
