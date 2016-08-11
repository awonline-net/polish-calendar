package net.awonline.calendar.polish.nonworkingday;

import net.awonline.calendar.nonworkingday.day.AbstractEasterBasedNonWorkingDay;

public class CorpusChristi extends AbstractEasterBasedNonWorkingDay {

	private static final String NAME = "Corpus Christi";

	private static final int DAYS_AFTER_EASTER_SUNDAY = 60;

	public CorpusChristi() {
		super(NAME, DAYS_AFTER_EASTER_SUNDAY);
	}
}
