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

public class Calendar3_1 {
	public static void main(String[] args) {
		// 기본적으로 현재날짜와 시간으로 설정된다.
		String yo[] = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		String ampm[] = {"오전", "오후"};
		Calendar today = Calendar.getInstance();
		
		int y = today.get(Calendar.YEAR);
		int m = today.get(Calendar.MONTH)+1;
		int d = today.get(Calendar.DATE);
		int h1 = today.get(Calendar.HOUR);
		int mm = today.get(Calendar.MINUTE);
		int ap = today.get(Calendar.AM_PM);
		int s = today.get(Calendar.SECOND);
		int yoil = today.get(Calendar.DAY_OF_WEEK);
		
		System.out.print(y + "년 " + m + "월 " + d + "일 " + ampm[ap]+h1 + ":" + mm + ":" + s + " " + yo[yoil-1] + "입니다.");
	}
}
