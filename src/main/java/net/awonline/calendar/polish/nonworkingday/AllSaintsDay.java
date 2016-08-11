package net.awonline.calendar.polish.nonworkingday;

import java.util.Calendar;

import net.awonline.calendar.nonworkingday.day.AbstractDayOfMonthBasedNonWorkingDay;

public class AllSaintsDay extends AbstractDayOfMonthBasedNonWorkingDay {

	private static final String NAME = "All Saints' Day";

	private static final int MONTH_OF_YEAR = Calendar.NOVEMBER;
	private static final int DAY_OF_MONTH = 1;

	public AllSaintsDay() {
		super(NAME, MONTH_OF_YEAR, DAY_OF_MONTH);
	}
}
