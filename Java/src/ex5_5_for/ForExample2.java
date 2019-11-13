package ex5_5_for;

public class ForExample2 {
	public static void main(String[] args) {
		int a, sum;
		System.out.println("======1~10까지 홀수 출력하기=======");
		for(a=1; a<=10; a += 2)
			System.out.println(a);
		
		System.out.println("======1~10까지 짝수 출력하기=======");
		for(a=2; a<=10; a += 2)
			System.out.println(a);
		
		System.out.println("======1~10까지의 합 구하기=======");
		for(a=1, sum=0; a<=10; a++) {
			sum+=a;
		} System.out.println(sum);
			
		System.out.println("======1~10까지 홀수의 합 구하기=======");
		for(a=1, sum=0; a<=10; a += 2) {
			sum+=a;	
		} System.out.println(sum);
		
		System.out.println("======1~10까지 짝수의 합 구하기=======");
		for(a=0, sum=0; a<=10; a += 2) {
			sum+=a;
		} System.out.println(sum);
			
	}
}
