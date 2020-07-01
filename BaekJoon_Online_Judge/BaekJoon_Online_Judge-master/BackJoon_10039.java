import java.util.Scanner;

public class BackJoon_10039 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int sum = 0;
		while(i!=5) {
			int a = sc.nextInt();
			if(a<40) {
				sum += 40;
			}else {
				sum += a;
			}
			i++;
		}
		sum = sum/5;
		System.out.println(sum);
		sc.close();
	}
}
