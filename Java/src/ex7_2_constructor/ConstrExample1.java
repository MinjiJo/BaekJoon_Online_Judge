//선언된 생성자를 이용하여 객체를 생성하는 프로그램
package ex7_2_constructor;

import ex7_1_object.GoodsStock2;

public class ConstrExample1 {
	public static void main(String args[]) {
		GoodsStock2 obj;
		obj = new GoodsStock2("52135", 200); //선언된 생성자를 이용해서
		System.out.println("상품코드:" + obj.goodsCode);
		System.out.println("재고수량:" + obj.stockNum);
		
		obj.addStock(1000);			//메소드 호출
		System.out.println("======obj.addStock(1000) 후=====");
		System.out.print("상품코드:" + obj.goodsCode + "\n" + "재고수량:" + obj.stockNum + "\n");
		
		obj.subtractStock(500);		//메소드 호출
		System.out.println("======obj.subtractStock(500) 후=====");
		System.out.print("상품코드:" + obj.goodsCode + "\n" + "재고수량:" + obj.stockNum + "\n");
	}
}
