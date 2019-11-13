/*
  Calendar�� �߻� Ŭ������ �̷��� ����� �� �����ϴ�.
  1. Calendar c = new Calendar();
  
  2. Calendar ���� �ΰ���
  	�ϳ�) ���� �޼ҵ带 �̿��ؼ� ����ϴ� ���
  		Calendar c1 = Calendar.getInstance();
  		getInstance() : Calendar Ŭ������ ������ Ŭ������ �ν��Ͻ��� ��ȯ
  		
  	��) ��ĳ���� ���(�ڽ��� �ּҸ� �θ𿡰� ��)
  		Calendar c2 = new GregorianCalendar();
 */
package ex11_5_Calendar;

import java.util.*;

public class Calendar2 {
	public static void main(String[] args) {
		// �⺻������ ���糯¥�� �ð����� �����ȴ�.
		Calendar today = Calendar.getInstance();
		
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1;
		int day = today.get(Calendar.DATE);
		int hour = today.get(Calendar.HOUR);
		int minute = today.get(Calendar.MINUTE);
		int second = today.get(Calendar.SECOND);

		System.out.print(year + "�� " + month + "�� " + day + "�� ");

		if (today.get(Calendar.AM_PM) == 0) {
			System.out.print("����");
		} else
			System.out.print("����");

		System.out.print(hour + ":" + minute + ":" + second + " ");

		String dayofweek = null;
		switch (today.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			dayofweek = "�Ͽ���";
			break;
		case 2:
			dayofweek = "������";
			break;
		case 3:
			dayofweek = "ȭ����";
			break;
		case 4:
			dayofweek = "������";
			break;
		case 5:
			dayofweek = "�����";
			break;
		case 6:
			dayofweek = "�ݿ���";
			break;
		case 7:
			dayofweek = "�����";
			break;
		}
		
		System.out.print(dayofweek + "�Դϴ�.");
	}
}
