package ex6_1_array;

public class Rank {
	public static void main(String[] args) {
		
		int a[][] = {{30, 1}, {20, 1}, {10, 1}, {40, 1}, {50, 1}, {60, 1}};
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				if(i!=j && a[i][0]<a[j][0]) {
					a[i][1]++;//
				}//if
			}//for j
		}//for i
		
		// �������� = ���� ��������
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if ( a[i][0] < a[j][0]) {
					int[] imsi = a[i];
					a[i] = a[j];
					a[j]= imsi;
					}//if
				}//for j
			}//for i
		
		System.out.println("=========================");
		System.out.print("����\t���\n");
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i][0] + "\t" + a[i][1]);
		}
	}
}

