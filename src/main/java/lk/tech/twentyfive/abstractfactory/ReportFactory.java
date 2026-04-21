package lk.tech.twentyfive.abstractfactory;

import lk.tech.twentyfive.abstractfactory.report.DayReport;
import lk.tech.twentyfive.abstractfactory.report.MonthReport;
import lk.tech.twentyfive.abstractfactory.report.WeekReport;

public interface ReportFactory {

    DayReport createEveryDayReport();

    WeekReport createEveryWeekReport();

    MonthReport createEveryMonthReport();
}
