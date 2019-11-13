package ex6_1_array;

public class ArrayExample3 {
	public static void main(String[] args) {
		// 规过1.
		System.out.println("===== 规过1 =====");

		int arr[]; // 硅凯 急攫
		arr = new int[5]; // 硅凯 积己
		// 硅凯 荤侩
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		// 硅凯 免仿
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// 规过2.
		System.out.println("===== 规过2 =====");
		int arr2[] = new int[5];
		arr2[0] = 10;
		arr2[1] = 20;
		arr2[2] = 30;
		arr2[3] = 40;
		arr2[4] = 50;

		for (int i = 0; i < arr2.length; i++)
			System.out.println("arr2[" + i + "]" + "=" + arr2[i]);

		// 规过3.
		System.out.println("===== 规过3 =====");
		int arr3[] = { 10, 20, 30, 40, 50 };
		for (int i = 0; i < arr3.length; i++)
			System.out.println("arr3[" + i + "]" + "=" + arr3[i]);
	}
}
