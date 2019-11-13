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

public class Calendar1 {
	public static void main(String[] args) {
		// �⺻������ ���糯¥�� �ð����� �����ȴ�.
		Calendar today = Calendar.getInstance();

		System.out.println("�� ���� �⵵ : " + today.get(Calendar.YEAR));

		System.out.println("��(0~11, 0:1��) : " + today.get(Calendar.MONTH));

		System.out.println("��(0~11, 0:1��) : " + (today.get(Calendar.MONTH) + 1));

		System.out.println("�� ���� �� ° �� : " + today.get(Calendar.WEEK_OF_YEAR));

		// DATE�� DAY_OF_MONTH�� ����.
		System.out.println("�� ���� ��ĥ: " + today.get(Calendar.DATE));

		System.out.println("�� ���� ��ĥ: " + today.get(Calendar.DAY_OF_MONTH));

		System.out.println("�� ���� ��ĥ: " + today.get(Calendar.DAY_OF_YEAR));

		// 1:�Ͽ���, 2:������, ... 7:�����
		System.out.println("����(1~7, 1:�Ͽ���): " + today.get(Calendar.DAY_OF_WEEK));

		System.out.println("�� ���� ��� ° ����: " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));

		System.out.println("����_����(0:����, 1:����): " + today.get(Calendar.AM_PM));

		System.out.println("�ð�(0~11): " + today.get(Calendar.HOUR));

		System.out.println("�ð�(0~23): " + today.get(Calendar.HOUR_OF_DAY));

		System.out.println("��(0~59): " + today.get(Calendar.MINUTE));

		System.out.println("��(0~59): " + today.get(Calendar.SECOND));

		// �� ���� ������ ���� ã�´�.
		System.out.println("�� ���� ������ ��: " + today.getActualMaximum(Calendar.DATE));

		System.out.println("1000���� 1��(0~999): " + today.get(Calendar.MILLISECOND));

		System.out.println("======================================");
		
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
