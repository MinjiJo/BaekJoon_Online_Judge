package homework_190829;

import java.util.*;

public class Calendar_190829 {

	public static void main(String[] args) {
		int year, month;
		int day = 1;

		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 년도를 입력하세요>");
		year = sc.nextInt();
		System.out.print("출력할 달을 입력하세요>");
		month = sc.nextInt(); 

		Calendar c1 = new GregorianCalendar(year, month - 1, day);

		System.out.printf("%17d년%5d월\n\n", year, month);
		System.out.printf("%7s%7s%7s%7s%7s%7s%7s\n", "일", "월", "화", "수", "목", "금", "토");

		int j = c1.get(Calendar.DAY_OF_WEEK) - 1;
		for (int i = -j + 1; i <= c1.getActualMaximum(Calendar.DATE); i++) {
			if (i >= 1) {
				System.out.printf("%5d", i);
				{
					if (j > 0) {
						if (i % 7 == 7 - j) {
							System.out.println();
						}
					}
					if (j == 0)
						if (i % 7 == 0) {
							System.out.println();
						}
				}
			} else {
				System.out.printf("%5s", "");
			}
		}

		sc.close();
	}
}
