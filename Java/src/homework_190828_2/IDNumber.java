//�Է¹��� �ֹι�ȣ ó��
package homework_190828_2;

public class IDNumber {

	static boolean check_length(String zumin) {
		return zumin.length() == 14 ? true : false;
	}

	static String pandan_gender(String zumin) {
		if ((char) zumin.charAt(7) == '1' || zumin.charAt(7) == '3') {
			return "����";
		} else if ((char) zumin.charAt(7) == '2' || zumin.charAt(7) == '4') {
			return "����";
		} else
			return "�ܱ���";
	}

	public static void main(String args[]) {
		String zumin = "123456-589012";

		boolean check = check_length(zumin);

		if (check) {
			System.out.println(pandan_gender(zumin) + "�Դϴ�.");
		} else {
			System.out.println("�ֹε�Ϲ�ȣ�� 14�ڸ� �Դϴ�. ");
		}
	}//main

}
