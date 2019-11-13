package ex11_5_Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Today {
	private Calendar c1 = Calendar.getInstance();
	
	public Today() {}
	
	public Today(GregorianCalendar c1) {
		this.c1=c1;
	}

	public String toString(){
		String yo[] = {"�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����"};
		String ampm[] = {"����", "����"};
		
		int y = c1.get(Calendar.YEAR);
		int m = c1.get(Calendar.MONTH)+1;//���� 0���� 11���� �������� 1�� ���ؾ� �Ѵ�.
		int d = c1.get(Calendar.DATE);
		int h1 = c1.get(Calendar.HOUR);//12�ð�
		int mm = c1.get(Calendar.MINUTE);//���� : 0, ���� : 1
		int ap = c1.get(Calendar.AM_PM);
		int s = c1.get(Calendar.SECOND);
		int yoil = c1.get(Calendar.DAY_OF_WEEK);//�Ͽ���:1, ������:2, ȭ����:3, ������:4, �����:5, �ݿ���:6, �����:7
	
		return y + "�� " + m + "�� " + d + "�� " + ampm[ap]+h1 + ":" + mm + ":" + s + " " + yo[yoil-1] + "�Դϴ�.";
	}
}
