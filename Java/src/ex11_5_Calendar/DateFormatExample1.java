package ex11_5_Calendar;

import java.text.SimpleDateFormat;
import java.util.*;

public class DateFormatExample1 {
	public static void main(String[] args) {

		// ���� �ý��� ��¥�� �ð� ���ϴ� ���
		// 1. Ŭ���� Date �̿��ϴ� ��� - ���� �ý��� ��¥�� �ð� ���մϴ�.
		Date d = new Date();
		System.out.println("Date ��� : " + d);
		// System.out.println(new Date());//�� �� ����� ���� �ǹ�

		SimpleDateFormat sd1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sd2 = new SimpleDateFormat("yyyy��MM��dd��");
		System.out.println(sd1.format(d));// yyyy-MM-dd ���·� ���
		System.out.println(sd2.format(d));// yyyy��MM��dd�� ���·� ���

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� a h�� m�� s�� E����");
		System.out.println(sdf.format(d));
	}
}
