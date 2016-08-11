package net.awonline.calendar.polish.suite;

import net.awonline.calendar.nonworkingday.NonWorkingDaysSuite;
import net.awonline.calendar.nonworkingday.day.impl.InternationalWorkersDay;
import net.awonline.calendar.nonworkingday.day.impl.NewYearsDay;
import net.awonline.calendar.polish.nonworkingday.AllSaintsDay;
import net.awonline.calendar.polish.nonworkingday.AssumptionOfTheBlessedVirginMary;
import net.awonline.calendar.polish.nonworkingday.CorpusChristi;
import net.awonline.calendar.polish.nonworkingday.EasterMonday;
import net.awonline.calendar.polish.nonworkingday.Epiphany;
import net.awonline.calendar.polish.nonworkingday.FirstDayOfChristmas;
import net.awonline.calendar.polish.nonworkingday.NationalDayOfThirdMay;
import net.awonline.calendar.polish.nonworkingday.PolishNationalIndependenceDay;
import net.awonline.calendar.polish.nonworkingday.SecondDayOfChristmas;

public class PolishNonWorkingDaySuite extends NonWorkingDaysSuite {

	public PolishNonWorkingDaySuite() {
		addNonWorkingDay(new NewYearsDay());
		addNonWorkingDay(new Epiphany());
		addNonWorkingDay(new EasterMonday());
		addNonWorkingDay(new InternationalWorkersDay());
		addNonWorkingDay(new NationalDayOfThirdMay());
		addNonWorkingDay(new CorpusChristi());
		addNonWorkingDay(new AssumptionOfTheBlessedVirginMary());
		addNonWorkingDay(new AllSaintsDay());
		addNonWorkingDay(new PolishNationalIndependenceDay());
		addNonWorkingDay(new FirstDayOfChristmas());
		addNonWorkingDay(new SecondDayOfChristmas());
	}
}
