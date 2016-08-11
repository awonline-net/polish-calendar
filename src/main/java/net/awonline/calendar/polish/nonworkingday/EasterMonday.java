package net.awonline.calendar.polish.nonworkingday;

import net.awonline.calendar.nonworkingday.day.AbstractEasterBasedNonWorkingDay;

public class EasterMonday extends AbstractEasterBasedNonWorkingDay {

	private static final String NAME = "Easter Monday";
	private static final int DAYS_AFTER_EASTER_SUNDAY = 1;

	public EasterMonday() {
		super(NAME, DAYS_AFTER_EASTER_SUNDAY);
	}
}
