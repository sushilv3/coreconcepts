package localdate;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTest {
	public static void main(String[] args) {
		
		LocalDate localDate1 = LocalDate.now();
		//default format (yyyy-mm-dd)
		System.out.println(localDate1);
		
		Clock clock = Clock.systemDefaultZone();
		LocalDate localDate2 = LocalDate.now(clock);
		System.out.println(localDate2);
		
		ZoneId zoneid = ZoneId.of("Europe/Paris");
		LocalDate localDate3 = LocalDate.now(zoneid);
		System.out.println(localDate3);
		
		System.out.println("-----------------------------");
		LocalDate localDate4 = LocalDate.of(2019, 06, 2);
		System.out.println(localDate4);
		
		LocalDate localDate5 = LocalDate.parse("2017-06-05");
		System.out.println(localDate5);
		
		LocalDate localDate6 = localDate5.plusDays(2);
		System.out.println(localDate6);
		
		LocalDate localDate7 =  localDate5.minus(2, ChronoUnit.DAYS);
		System.out.println(localDate7);
		
		DayOfWeek dayOfWeek= LocalDate.parse("2019-10-12").getDayOfWeek();
		System.out.println(dayOfWeek);
		
		int dayOfMonth= LocalDate.parse("2019-10-12").getMonthValue();
		System.out.println(dayOfMonth);
		
		int month= LocalDate.parse("2019-10-12").getDayOfMonth();
		System.out.println(month);
		
		LocalDate localDate8 = LocalDate.now();
		System.out.println(localDate8.isLeapYear());
		
		LocalDate preYr = LocalDate.now().minusYears(1);
		System.out.println(preYr);
		
		boolean before = LocalDate.parse("2019-10-12").isBefore(LocalDate.parse("2017-10-10"));
		System.out.println(before);
		
		boolean after = LocalDate.parse("2019-10-12").isAfter(LocalDate.parse("2017-10-10"));
		System.out.println(after);
		
		
		System.out.println("-----------------------------");
		
		
		 LocalDateTime atStartOfDay = LocalDate.parse("2019-10-12").atStartOfDay();
		 System.out.println(atStartOfDay);
		 
		 LocalDate with = LocalDate.parse("2019-10-10").with(TemporalAdjusters.firstDayOfMonth());
		 System.out.println(with);
		
		
		
		
		
	}

}
