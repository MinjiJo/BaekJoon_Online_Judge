package ex7_1_object;

public class GoodsStock_make {
	public static void main(String[] args) {
		GoodsStock obj;				//���� ����
		obj = new GoodsStock();		//��ü ����
		//GoodsStock obj = new GoodsStock();
		
		obj.goodsCode = 52135;		//�ʵ忡 ���� ����
		obj.stockNum = 200;			//�ʵ忡 ���� ����
		
		System.out.print("��ǰ�ڵ�:" + obj.goodsCode + "\n" + "������:" + obj.stockNum + "\n");
		
		obj.addStock(1000);			//�޼ҵ� ȣ��
		System.out.println("======obj.addStock(1000) ��=====");
		System.out.print("��ǰ�ڵ�:" + obj.goodsCode + "\n" + "������:" + obj.stockNum + "\n");
		
		obj.subtractStock(500);		//�޼ҵ� ȣ��
		System.out.println("======obj.subtractStock(500) ��=====");
		System.out.print("��ǰ�ڵ�:" + obj.goodsCode + "\n" + "������:" + obj.stockNum + "\n");
	}
}
