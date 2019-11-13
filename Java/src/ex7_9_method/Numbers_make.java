package ex7_9_method;

public class Numbers_make {
	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		Numbers obj = new Numbers(arr);
		print(obj);
		
		Numbers obj2 = new Numbers(
			new int[] {10, 20, 30, 40, 50, 60, 70, 80, 90, 100});
		print(obj2);
		
	}
	
	static void print(Numbers obj) {
		System.out.println("ÇÕ°è : " + obj.getTotal());
		System.out.println("Æò±Õ : " + obj.getAverage());
	}
}
