package net.awonline.calendar.polish.nonworkingday;

import java.util.Calendar;

import net.awonline.calendar.nonworkingday.day.AbstractDayOfMonthBasedNonWorkingDay;

public class NationalDayOfThirdMay extends AbstractDayOfMonthBasedNonWorkingDay {

	private static final String NAME = "National Day of 3rd May";

	private static final int MONTH_OF_YEAR = Calendar.MAY;
	private static final int DAY_OF_MONTH = 3;

	public NationalDayOfThirdMay() {
		super(NAME, MONTH_OF_YEAR, DAY_OF_MONTH);
	}
}
