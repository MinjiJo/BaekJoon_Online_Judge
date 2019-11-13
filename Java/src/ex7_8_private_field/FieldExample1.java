//Circle 클래스 안에 선언된 필드를 사용하는 프로그램
//정보의 은닉 : 객체의 구성요소를 외부로부터 감추는 기술
package ex7_8_private_field;

import java.util.Scanner;

public class FieldExample1 {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름을 입력하세요>");
		double input = sc.nextInt();
		
		Circle obj = new Circle(input);
		double area = obj.getArea();
		System.out.println("원의 반지름 = " + obj.getRadius());
		System.out.println("원의 넓이 = " + area);
		sc.close();
	}
}
