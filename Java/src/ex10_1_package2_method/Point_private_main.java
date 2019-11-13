//같은 패키지의 클래스를 사용하는 프로그램
package ex10_1_package2_method;			// 패키지 선언문

class Point_private_main {
	public static void main(String args[]) {
		Point_private obj = new Point_private(3, 5);
		System.out.println("x 좌표 = " + obj.x);
		System.out.println("y 좌표 = " + obj.y);
		//System.out.println("x 좌표 = " + obj.getX());	//The method getX() from the type Point_private is not visible
		//System.out.println("y 좌표 = " + obj.getY());	//The method getY() from the type Point_private is not visible
	}
}
