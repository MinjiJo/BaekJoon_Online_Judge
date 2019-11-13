package ex10_9.main;

import ex10_9.geomoetry.shape.Square;

public class AccessControlExample {
	public static void main(String[] args) {

		 Square obj = new Square(100, 200, 15); 
		 
		 for(int i = 0; i < 4 ; i++) {
			 System.out.println("X[" +i + "]=" + obj.getX(i) + ",Y[" + i + "]=" + obj.getY(i));
		 }
		 
		 for(int i = 0; i < 4 ; i++) {
			 System.out.println("(" + obj.getX(i) + ", "+obj.getY(i)+")");
		 }

	}
}
