package homework;

public class Homework_190819_2 {
	public static void main(String[] args) {

		int i, sum;
		
		System.out.println("=========1~10까지 홀수 출력하기=========");
		i = 1;
		do {
			System.out.println(i);
			i += 2;
		} while(i<=10);
		
		System.out.println("=========1~10까지 짝수 출력하기=========");
		i = 2;
		do {
			System.out.println(i);
			i += 2;
		} while(i<=10);

		System.out.println("=========1~10까지 합 구하기=========");
		i = 1;
		sum = 0;
		do {
			sum += i++;
		} while(i<=10);
		System.out.println(sum);
		
		System.out.println("=========1~10까지 홀수 합 구하기=========");
		i = 1;
		sum = 0;
		do {
			sum = sum + i;
			i += 2;
		} while(i<=10);
		System.out.println(sum);
		
		System.out.println("=========1~10까지 짝수 합 구하기=========");
		i = 2;
		sum = 0;
		do {
			sum = sum + i;
			i += 2;
		} while(i<=10);
		System.out.println(sum);
	}
}
