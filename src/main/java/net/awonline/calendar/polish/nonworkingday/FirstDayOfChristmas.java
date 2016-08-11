package net.awonline.calendar.polish.nonworkingday;

import java.util.Calendar;

import net.awonline.calendar.nonworkingday.day.AbstractDayOfMonthBasedNonWorkingDay;

public class FirstDayOfChristmas extends AbstractDayOfMonthBasedNonWorkingDay {

	private static final String NAME = "First day of Christmas";

	private static final int MONTH_OF_YEAR = Calendar.DECEMBER;
	private static final int DAY_OF_MONTH = 25;

	public FirstDayOfChristmas() {
		super(NAME, MONTH_OF_YEAR, DAY_OF_MONTH);
	}
}
