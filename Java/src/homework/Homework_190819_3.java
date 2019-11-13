package homework;

public class Homework_190819_3 {
	public static void main(String[] args) {
		
		int i, j;
		
		for(i=1; i<=5; i++){
			for(j=0; j<i; j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("=============");
		
		for(i=1; i<=5; i++) {
			for(j=6; j>i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("=============");
		
		for(i=0; i<5; i++) {
			for(j=0; j<(4-i); j++) {
				System.out.print(" ");
			}
			for(j=0; j<(2*i+1); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
