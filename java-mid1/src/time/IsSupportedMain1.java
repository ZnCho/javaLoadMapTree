package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain1 {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		int minute = now.get(ChronoField.SECOND_OF_MINUTE); //시간 정보가 없어서 예외 터짐
		System.out.println("minute = " + minute);
	}
}
