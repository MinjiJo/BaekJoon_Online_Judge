/*
  Calendar는 추상 클래스로 이렇게 사용할 수 없습니다.
  1. Calendar c = new Calendar();
  
  2. Calendar 사용법 두가지
  	하나) 정적 메소드를 이용해서 사용하는 방법
  		Calendar c1 = Calendar.getInstance();
  		getInstance() : Calendar 클래스를 구현한 클래스의 인스턴스를 반환
  		
  	둘) 업캐스팅 방법(자식의 주소를 부모에게 줌)
  		Calendar c2 = new GregorianCalendar();
 */
package ex11_5_Calendar;

import java.util.*;

public class Calendar2 {
	public static void main(String[] args) {
		// 기본적으로 현재날짜와 시간으로 설정된다.
		Calendar today = Calendar.getInstance();
		
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1;
		int day = today.get(Calendar.DATE);
		int hour = today.get(Calendar.HOUR);
		int minute = today.get(Calendar.MINUTE);
		int second = today.get(Calendar.SECOND);

		System.out.print(year + "년 " + month + "월 " + day + "일 ");

		if (today.get(Calendar.AM_PM) == 0) {
			System.out.print("오전");
		} else
			System.out.print("오후");

		System.out.print(hour + ":" + minute + ":" + second + " ");

		String dayofweek = null;
		switch (today.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			dayofweek = "일요일";
			break;
		case 2:
			dayofweek = "월요일";
			break;
		case 3:
			dayofweek = "화요일";
			break;
		case 4:
			dayofweek = "수요일";
			break;
		case 5:
			dayofweek = "목요일";
			break;
		case 6:
			dayofweek = "금요일";
			break;
		case 7:
			dayofweek = "토요일";
			break;
		}
		
		System.out.print(dayofweek + "입니다.");
	}
}
