package homework_190829;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Calendar_190829_answer {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		// 년도, 달 출력 받기
		System.out.print("출력할 년도를 입력하세요>");
		int year = sc.nextInt();
		System.out.print("출력할 달을 입력하세요>");
		int month = sc.nextInt();
		sc.close();

		Calendar c = new GregorianCalendar(year, month - 1, 1);
		int lastday = c.getActualMaximum(Calendar.DATE);
		int s = c.get(Calendar.DAY_OF_WEEK);

		String yoil[] = { "일", "월 ", "화 ", "수 ", "목", "금", "토" };
		System.out.print("\t\t\t" + c.get(Calendar.YEAR) + "년  ");
		System.out.print((c.get(Calendar.MONTH) + 1) + "월" + "\n ");
		for (int i = 0; i < yoil.length; i++) {
			System.out.print(yoil[i] + "\t");
		}
		System.out.println();
		// 시작이 일요일인 경우 s=1 공백 없음 i= 1 2 3 4 5 6 7
		// 시작이 월요일인 경우 s=2 공백 한개 i= 0 1 2 3 4 5 6
		// 시작이 화요일인 경우 s=3 공백 두개 i=-1 0 1 2 3 4 5
		// 시작이 수요일인 경우 s=4 공백 세개 i=-2 -1 0 1 2 3 4
		// 시작이 목요일인 경우 s=5 공백 네개 i=-3 -2 -1 0 1 2 3
		// 시작이 금요일인 경우 s=6 공백 다섯개 i=-4 -3 -2 -1 0 1 2
		// 시작이 토요일인 경우 s=7 공백 여섯개 i=-5 -4 -3 -2 -1 0 1

		/*
		 int ii = 0;
		for (int i = 2 - s; i <= lastday; i++) { // s+i=2 => i=2-s
			if (i <= 0) {
				System.out.print("\t");
			} else {
				System.out.print(i + "\t");
			}
			ii++;
			if (ii % 7 == 0) {
				System.out.println("\n");
			}
		*/
		
		
		for (int i = 2 - s; i <= lastday; i++) { // s+i=2 => i=2-s
			if (i <= 0) {
				System.out.print("\t");
			} else {
				System.out.print(i + "\t");
			}
			
			// 시작이 일요일인 경우 s=1	출력 1 2 3 4 5 6 7
			// 시작이 월요일인 경우 s=2	출력     1 2 3 4 5 6
			// 시작이 월요일인 경우 s=3	출력		1 2 3 4 5
			
			if ((i+s) % 7 == 1) {
				System.out.println("\n");
			}
		}
	}
}
