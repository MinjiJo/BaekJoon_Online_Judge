package ex6_1_array;

import java.util.Scanner;

public class ArrayTest5_String {
	public static void main(String[] args) {
		// String names[] = { "ȫ�浿", "����ġ", "ȫ�浿", "�������", "��浿" };
		String[] names = new String[] { "ȫ�浿", "����ġ", "ȫ�浿", "�������", "��浿" };

		// �� �� �濡 ����ִ��� Ȯ���ϴ� ������ �ʱⰪ -1�� �ε����� ��ġ�� �ʴ� ���� ����մϴ�.
		int index = -1;

		Scanner sc = new Scanner(System.in);
		System.out.println("�˻��� �̸��� �Է��ϼ���>");
		String inputname = sc.next();
		System.out.println("�̸�:" + inputname);

		for (int i = 0; i < names.length; i++) {
			if (inputname.equals(names[i])) {
				index = i; // �Է��� �̸��� ���� �̸��� �ε��� 0 ���� ã���ϴ�.
				break; // �Է��� �̸��� ���� �̸��� ã���� �ݺ��� ����ϴ�.
				// break;�� ���ָ� ���� ������ ���Ƽ� ȫ�浿�� 2�������� ����
			}
		}
		
		/*
		  for (int i = names.length-1; i >= 0 ; --i) {
		  	if (inputname.equals(names[i])) {
		  		index = i;	//�ε��� ������ ���� ��ġ�������� �Է��� �̸��� ���� �̸��� ã���ϴ�.
		  		break;		//�Է��� �̸��� ���� �̸��� ã���� �ݺ��� ����ϴ�.
		  	}
		  }
		 */

		// �Է��� �̸��� �迭�� �̸��� ã���� ��
		if (index != -1) {
			System.out.println(inputname + "�� �迭�� " + index + "�� �濡�� ã�ҽ��ϴ�.");
		} else
			System.out.println(inputname + "�� �迭�濡�� ã�� ���߽��ϴ�.");

		sc.close();

	}
}
