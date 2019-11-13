package ex13_3_Object_toString_override;

public class GoodsStock {
	String GoodsCode;		// 상품코드
	int stockNum;			// 재고수량
	GoodsStock(String goodsCode, int stockNum){
		this.GoodsCode = goodsCode;
		this.stockNum = stockNum;
	}
	
	public String toString() {
		String str = "상품코드:" + GoodsCode + " 재고수량:" + stockNum;
		return str;
	}
}