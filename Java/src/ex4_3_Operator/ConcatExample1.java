package ex4_3_Operator;

public class ConcatExample1 {
	public static void main(String[] args) {
		String str1 = "num=" + 3 + 4;
		System.out.println(str1);
		
		String str2 = 3 + 4 + "=num";
		System.out.println(str2);
		
		String str3 = "num=" + (3 + 4);
		System.out.println(str3);
		
		str1 = "" + 3 + 4;
		System.out.println(str1);
	}
}
