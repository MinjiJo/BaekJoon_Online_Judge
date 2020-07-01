import java.util.Scanner;

public class BackJoon_2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		int newH = H;
		int newM = M-45;
		if(newM < 0) {
			newM += 60;
			newH--;
			if(newH < 0)
				newH += 24;
		}
		System.out.println(newH + " " + newM);
		sc.close();
	}
}
