//입력받은 주민번호 처리
package homework_190828_2;

public class IDNumber {

	static boolean check_length(String zumin) {
		return zumin.length() == 14 ? true : false;
	}

	static String pandan_gender(String zumin) {
		if ((char) zumin.charAt(7) == '1' || zumin.charAt(7) == '3') {
			return "남자";
		} else if ((char) zumin.charAt(7) == '2' || zumin.charAt(7) == '4') {
			return "여자";
		} else
			return "외국인";
	}

	public static void main(String args[]) {
		String zumin = "123456-589012";

		boolean check = check_length(zumin);

		if (check) {
			System.out.println(pandan_gender(zumin) + "입니다.");
		} else {
			System.out.println("주민등록번호는 14자리 입니다. ");
		}
	}//main

}
