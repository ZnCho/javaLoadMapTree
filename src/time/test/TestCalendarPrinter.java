package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestCalendarPrinter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("년도를 입력하세요: ");
		int year = scanner.nextInt();

		System.out.print("월을 입력하세요: ");
		int month = scanner.nextInt();

		printCalender(year,month);

//		LocalDate firstDate = LocalDate.of(year, month, 1);
//		LocalDate lastDate = firstDate.with(TemporalAdjusters.lastDayOfMonth());
//		int lastDayOfMonth = lastDate.getDayOfMonth();
//
//		DayOfWeek[] values = DayOfWeek.values();
//		System.out.println(" Su Mo Tu We Th Fr Sa");
//		if(firstDate.getDayOfWeek() != DayOfWeek.SUNDAY){
//			for (DayOfWeek value : values) {
//				System.out.print("   ");
//				if (value == firstDate.getDayOfWeek()) {
//					break;
//				}
//			}
//		}
//		for (int i = 1; i <= lastDayOfMonth; i++) {
//			LocalDate now = firstDate.withDayOfMonth(i);
//			if(i < 10){
//				System.out.print(" ");
//			}
//			System.out.print(" " + i);
//			if(now.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
//				System.out.println();
//			}
//		}
	}

	private static void printCalender(int year, int month) {
		LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
		LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);

		//월요일 = 1 ... 일요일 = 7 > 월요일(1%7) = 1 ... 일요일(7%7) = 0
		int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;

		System.out.println("Su Mo Tu We Th Fr Sa ");
		for (int i = 0; i <offsetWeekDays; i++) {
			System.out.print("   ");
		}
		LocalDate dayIterator = firstDayOfMonth;
		while (dayIterator.isBefore(firstDayOfNextMonth)) {
			System.out.printf("%2d ", dayIterator.getDayOfMonth());
			if(dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
				System.out.println();
			}
			dayIterator = dayIterator.plusDays(1);
		}
	}
}
