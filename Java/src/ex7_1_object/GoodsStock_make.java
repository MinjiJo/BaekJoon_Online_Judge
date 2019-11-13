package ex7_1_object;

public class GoodsStock_make {
	public static void main(String[] args) {
		GoodsStock obj;				//변수 선언
		obj = new GoodsStock();		//객체 생성
		//GoodsStock obj = new GoodsStock();
		
		obj.goodsCode = 52135;		//필드에 값을 대입
		obj.stockNum = 200;			//필드에 값을 대입
		
		System.out.print("상품코드:" + obj.goodsCode + "\n" + "재고수량:" + obj.stockNum + "\n");
		
		obj.addStock(1000);			//메소드 호출
		System.out.println("======obj.addStock(1000) 후=====");
		System.out.print("상품코드:" + obj.goodsCode + "\n" + "재고수량:" + obj.stockNum + "\n");
		
		obj.subtractStock(500);		//메소드 호출
		System.out.println("======obj.subtractStock(500) 후=====");
		System.out.print("상품코드:" + obj.goodsCode + "\n" + "재고수량:" + obj.stockNum + "\n");
	}
}
