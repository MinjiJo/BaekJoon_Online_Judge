//같은 패키지의 클래스를 사용하는 프로그램
package ex10_1_package2_filed;			// 패키지 선언문

class Point_private_main {
	public static void main(String args[]) {
		Point_private obj = new Point_private(3, 5);
		//System.out.println("x 좌표 = " + obj.x);	//The field Point_private.x is not visible
		//System.out.println("y 좌표 = " + obj.y);	//The field Point_private.y is not visible
	}
}
