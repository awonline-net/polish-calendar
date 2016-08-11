package net.awonline.calendar.polish.nonworkingday;

import java.util.Calendar;

import net.awonline.calendar.nonworkingday.day.AbstractDayOfMonthBasedNonWorkingDay;

public class Epiphany extends AbstractDayOfMonthBasedNonWorkingDay {

	private static final String NAME = "Epiphany";

	private static final int MONTH_OF_YEAR = Calendar.JANUARY;
	private static final int DAY_OF_MONTH = 6;

	public Epiphany() {
		super(NAME, MONTH_OF_YEAR, DAY_OF_MONTH);
	}
}
