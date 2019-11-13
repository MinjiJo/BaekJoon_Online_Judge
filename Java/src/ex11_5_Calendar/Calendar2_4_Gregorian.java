package ex11_5_Calendar;

import java.util.*;

public class Calendar2_4_Gregorian {
		
	public static void main(String[] args) {
		String yo[] = {"�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����"};
		String ampm[] = {"����", "����"};

		Calendar c1 = new GregorianCalendar(2019,7,1);
		
		int y = c1.get(Calendar.YEAR);
		int m = c1.get(Calendar.MONTH)+1;
		int d = c1.get(Calendar.DATE);
		int h1 = c1.get(Calendar.HOUR);
		int mm = c1.get(Calendar.MINUTE);
		int ap = c1.get(Calendar.AM_PM);
		int s = c1.get(Calendar.SECOND);
		int yoil = c1.get(Calendar.DAY_OF_WEEK);
		
		System.out.print(y + "�� " + m + "�� " + d + "�� " + ampm[ap]+h1 + ":" + mm + ":" + s + " " + yo[yoil-1] + "�Դϴ�.");
	}
}
