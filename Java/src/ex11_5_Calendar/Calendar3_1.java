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

public class Calendar3_1 {
	public static void main(String[] args) {
		// �⺻������ ���糯¥�� �ð����� �����ȴ�.
		String yo[] = {"�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����"};
		String ampm[] = {"����", "����"};
		Calendar today = Calendar.getInstance();
		
		int y = today.get(Calendar.YEAR);
		int m = today.get(Calendar.MONTH)+1;
		int d = today.get(Calendar.DATE);
		int h1 = today.get(Calendar.HOUR);
		int mm = today.get(Calendar.MINUTE);
		int ap = today.get(Calendar.AM_PM);
		int s = today.get(Calendar.SECOND);
		int yoil = today.get(Calendar.DAY_OF_WEEK);
		
		System.out.print(y + "�� " + m + "�� " + d + "�� " + ampm[ap]+h1 + ":" + mm + ":" + s + " " + yo[yoil-1] + "�Դϴ�.");
	}
}
