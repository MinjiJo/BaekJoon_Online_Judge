package ex6_1_array;

import java.util.Scanner;

public class ArrayTest4 {
	public static void main(String[] args) {
		/*
		int max, min;
		
		int data[] = new int[5];
		
		System.out.println("���� 5���� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < data.length; i++ ) {
			data[i] = sc.nextInt();
			
			if(i == 0) {
				max = data[i]>data[i+1]?data[i]:data[i+1];
				min = data[i]<data[i+1]?data[i]:data[i+1];
			} else {

					if (max < data[i]) max = data[i];
					if (min > data[i]) min = data[i];
				}
				
			}
		}
	
		���� �߸��Ȱ���....?? �ʹ� �̻���... �̻��ϰ� ����......
		
		System.out.println("�ִ밪 = " + max + "\n�ּҰ� = " + min);
		sc.close();
		*/
		
		int[] su=new int[5];
		
		System.out.println("���� 5���� �Է��ϼ���>");
		Scanner sc = new Scanner(System.in);
		su[0]=sc.nextInt();
		int max=su[0], min=su[0];
		
		for(int i=1;i<su.length;i++) {
			su[i]=sc.nextInt();
			if (max < su[i]) max = su[i];
			if (min > su[i]) min = su[i];
		}
		
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		
		sc.close();
	}
}
