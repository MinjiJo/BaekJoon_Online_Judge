package homework;

import java.util.Scanner;

public class Homework_190820_1 {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("임의의 두 수를 입력하세요>");
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
		    	
		    	System.out.println(min + " ~ " + max + "의 합 = " + sum);
		    	sc.close();
		 }

}

/*
 n1과 n2 바꾸기
 
 예) n1=10, n2=1인 경우
 1단계)
 		n2 = n1;	==> n2의 원래값이 사라집니다.
 		10	 10
 2단계) 1단계전에 n2의 값을 다른 곳에 보관해 둡니다.
 		imsi = n2;
 		n2 	 = n1;
 		
 3단계) n1의 값을 n2의 원래값으로 설정합니다.
 		n1 = imsi;
 
 결국)
 		imsi = n2;
 		n2 	 = n1;
 		n1   = imsi;
*/
