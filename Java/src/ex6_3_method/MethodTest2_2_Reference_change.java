package ex6_3_method;

public class MethodTest2_2_Reference_change {
	public static void change(int[] d) {
		int imsi = d[0];
		d[0] = d[1];
		d[1] = imsi;
	}
	
	public static void main(String a[]) {
		int[] data = {10, 20};
		System.out.println("change ȣ�� �� �Դϴ�.");
		System.out.println("data[0] = " + data[0]);
		System.out.println("data[1] = " + data[1]);
		
		change(data);
		System.out.println("change ȣ�� �� �Դϴ�.");
		System.out.println("data[0] = " + data[0]);
		System.out.println("data[1] = " + data[1]);
		
	}
}
