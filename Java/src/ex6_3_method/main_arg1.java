/*
   실행방법
   1. 이클립스에서 실행 순서
   	1) 해당 소스에서 Ctrl + F11
   	2) Package Explorer에서 소스를 선택 후 오른쪽 마우스 버튼 클릭
   	   -> Run as -> Run Configurations
   	   -> 오른쪽 화면의 Arguments탭 선택 후
   	   -> Program arguments 상자에서 값을 입력합니다.
   	   -> 두 개 이상 사용시에는 blank 또는 엔터로 구분합니다.
   	   
   2. cmd환경
   C:\workspace_java\Java_ex\bin 밑에 
   	패키지 ex6_3_method 안에 main_arg1.class가 있는 경우 실행방법
   	
   	첫째: 컴파일한 바이트코드가 있는 bin에서 실행하는 경우
   		형식) java 패키지명, 클래스명 인자값1, 인자값2...
   		3.C:\workspace_java\JAVA_ex\bin\java ex6_3_method.main_arg1
   		*/

package ex6_3_method;

public class main_arg1 {
	/*public static void main(String[] args) {
		
		for(int i = 0; i<args.length; i++)
			System.out.println(args[i]);
		
	}*/
	
	public static void main(String v[]) {
		
		for(String a : v) {
			System.out.println(a);
		}
		
	}
}
