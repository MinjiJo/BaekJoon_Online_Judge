package ex13_3_Object_toString_override;

public class GoodsStock {
	String GoodsCode;		// ��ǰ�ڵ�
	int stockNum;			// ������
	GoodsStock(String goodsCode, int stockNum){
		this.GoodsCode = goodsCode;
		this.stockNum = stockNum;
	}
	
	public String toString() {
		String str = "��ǰ�ڵ�:" + GoodsCode + " ������:" + stockNum;
		return str;
	}
}