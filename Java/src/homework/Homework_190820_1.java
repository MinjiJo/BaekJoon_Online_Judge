package homework;

import java.util.Scanner;

public class Homework_190820_1 {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("������ �� ���� �Է��ϼ���>");
		  int num1 = sc.nextInt();
		  int num2 = sc.nextInt();  
		  int sum=0;
		  
		  int max=0, min=0;
		  
		  if(num1>=num2) {
			  max = num1;
			  min = num2;
		  } else {
			  max = num2;
			  min = num1;
		  }
		  
		    	for(int i=min; i<=max; i++) {
		    	 sum += i;
		    	}
		    	
		    	System.out.println(min + " ~ " + max + "�� �� = " + sum);
		    	sc.close();
		 }

}

/*
 n1�� n2 �ٲٱ�
 
 ��) n1=10, n2=1�� ���
 1�ܰ�)
 		n2 = n1;	==> n2�� �������� ������ϴ�.
 		10	 10
 2�ܰ�) 1�ܰ����� n2�� ���� �ٸ� ���� ������ �Ӵϴ�.
 		imsi = n2;
 		n2 	 = n1;
 		
 3�ܰ�) n1�� ���� n2�� ���������� �����մϴ�.
 		n1 = imsi;
 
 �ᱹ)
 		imsi = n2;
 		n2 	 = n1;
 		n1   = imsi;
*/
