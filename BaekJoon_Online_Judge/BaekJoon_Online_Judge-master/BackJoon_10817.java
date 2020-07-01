import java.util.*;

public class BackJoon_10817 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
    
    sc.close();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int imsi = arr[i];
					arr[i] = arr[j];
					arr[j] = imsi;
				}
			}

		}

		System.out.println(arr[1]);
	}
}