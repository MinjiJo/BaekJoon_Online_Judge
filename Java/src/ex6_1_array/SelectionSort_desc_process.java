package ex6_1_array;

public class SelectionSort_desc_process {
	public static void main(String[] args) {
		int a[] = {3, 2, 1, 4, 5};
		
		System.out.printf("%-16s", "원본 데이터 : ");
		for(int k=0;k<a.length;k++)
			System.out.print(a[k]+" ");
		
		for(int i=0; i<a.length-1; i++) {
			System.out.println("\n" + "a[" + i + "]번째 데이터 선택 ");
			for(int j=i+1; j < a.length; j++) {
				System.out.print("i = " + i + "\t" + "j = " + j + "\t" + "[ ");
				
				if(a[i]<a[j]) {	//내림차순
					int imsi = a[i];
						a[i] = a[j];
						a[j] = imsi;
				}//if
				
				/*if(a[i]>a[j]) {	//오름차순 -> 방향에 따라 달라지는 것!
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
