package ex11_1_String;

public class StringExample6_1 {
	public static void main(String args[]) {
		String n = "123456-4123456";

		if ((char)n.charAt(7) == '1' || n.charAt(7) == '3') {
			System.out.println("남자");
		}else if((char)n.charAt(7) == '2' || n.charAt(7) == '4') {
			System.out.println("여자");
		}else
			System.out.println("외국인");

	}
}