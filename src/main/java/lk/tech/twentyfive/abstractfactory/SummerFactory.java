package lk.tech.twentyfive.abstractfactory;

import lk.tech.twentyfive.abstractfactory.report.DayReport;
import lk.tech.twentyfive.abstractfactory.report.MonthReport;
import lk.tech.twentyfive.abstractfactory.report.WeekReport;

public class SummerFactory implements ReportFactory {
    @Override
    public DayReport createEveryDayReport() {
        return null;
    }

    @Override
    public WeekReport createEveryWeekReport() {
        return null;
    }

    @Override
    public MonthReport createEveryMonthReport() {
        return null;
    }
}
