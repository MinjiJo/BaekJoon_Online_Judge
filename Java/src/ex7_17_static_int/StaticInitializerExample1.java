//hundredNumbers�� �̿��ϴ� ���α׷�!
package ex7_17_static_int;

public class StaticInitializerExample1 {
	public static void main(String args[]) {
		System.out.println("main �������");
		HundredNumbers h = new HundredNumbers();
		HundredNumbers h2 = new HundredNumbers();
		
		//�迭�� �ִ� �׸�� �� 3���� �׸��� �����ͼ� �� ���� ����մϴ�.
		System.out.println(HundredNumbers.arr[35]);
		System.out.println(HundredNumbers.arr[27]);
		System.out.println(HundredNumbers.arr[63]);
	}
}
