package ex11_5_Calendar;

import java.text.SimpleDateFormat;
import java.util.*;

public class DateFormatExample1 {
	public static void main(String[] args) {

		// 현재 시스템 날짜와 시간 구하는 방법
		// 1. 클래스 Date 이용하는 방법 - 현재 시스템 날짜와 시간 구합니다.
		Date d = new Date();
		System.out.println("Date 사용 : " + d);
		// System.out.println(new Date());//위 두 문장과 같은 의미

		SimpleDateFormat sd1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sd2 = new SimpleDateFormat("yyyy년MM월dd일");
		System.out.println(sd1.format(d));// yyyy-MM-dd 형태로 출력
		System.out.println(sd2.format(d));// yyyy년MM월dd일 형태로 출력

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a h시 m분 s초 E요일");
		System.out.println(sdf.format(d));
	}
}
