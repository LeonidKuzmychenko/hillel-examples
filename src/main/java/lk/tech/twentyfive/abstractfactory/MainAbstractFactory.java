package lk.tech.twentyfive.abstractfactory;

import lk.tech.twentyfive.abstractfactory.report.DayReport;
import lk.tech.twentyfive.abstractfactory.report.MonthReport;
import lk.tech.twentyfive.abstractfactory.report.WeekReport;

public class MainAbstractFactory {
    private static final ReportFactory FACTORY = new WinterFactory();

    public static void main(String[] args) {
        DayReport everyDayReport = FACTORY.createEveryDayReport();
        WeekReport everyWeekReport = FACTORY.createEveryWeekReport();
        MonthReport everyMonthReport = FACTORY.createEveryMonthReport();

        System.out.println(everyDayReport);
        System.out.println(everyWeekReport);
        System.out.println(everyMonthReport);

        FACTORY.createEveryDayReport();
    }
}
