//����� �����ڸ� �̿��Ͽ� ��ü�� �����ϴ� ���α׷�
package ex7_2_constructor;

import ex7_1_object.GoodsStock2;

public class ConstrExample1 {
	public static void main(String args[]) {
		GoodsStock2 obj;
		obj = new GoodsStock2("52135", 200); //����� �����ڸ� �̿��ؼ�
		System.out.println("��ǰ�ڵ�:" + obj.goodsCode);
		System.out.println("������:" + obj.stockNum);
		
		obj.addStock(1000);			//�޼ҵ� ȣ��
		System.out.println("======obj.addStock(1000) ��=====");
		System.out.print("��ǰ�ڵ�:" + obj.goodsCode + "\n" + "������:" + obj.stockNum + "\n");
		
		obj.subtractStock(500);		//�޼ҵ� ȣ��
		System.out.println("======obj.subtractStock(500) ��=====");
		System.out.print("��ǰ�ڵ�:" + obj.goodsCode + "\n" + "������:" + obj.stockNum + "\n");
	}
}
