package ex6_1_array;

public class SelectionSort_desc_process {
	public static void main(String[] args) {
		int a[] = {3, 2, 1, 4, 5};
		
		System.out.printf("%-16s", "���� ������ : ");
		for(int k=0;k<a.length;k++)
			System.out.print(a[k]+" ");
		
		for(int i=0; i<a.length-1; i++) {
			System.out.println("\n" + "a[" + i + "]��° ������ ���� ");
			for(int j=i+1; j < a.length; j++) {
				System.out.print("i = " + i + "\t" + "j = " + j + "\t" + "[ ");
				
				if(a[i]<a[j]) {	//��������
					int imsi = a[i];
						a[i] = a[j];
						a[j] = imsi;
				}//if
				
				/*if(a[i]>a[j]) {	//�������� -> ���⿡ ���� �޶����� ��!
					int imsi = a[i];
						a[i] = a[j];
						a[j] = imsi;
				 */
				
				for(int k=0; k<a.length; k++)
					System.out.print(a[k] + " ");
				
				System.out.println("]");
			}//for j
		}//for i
	}//main
}//class
