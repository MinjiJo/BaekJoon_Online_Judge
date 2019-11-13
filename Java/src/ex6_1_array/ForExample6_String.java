package ex6_1_array;

public class ForExample6_String {
	public static void main(String[] args) {
		String[] name = {"홍길동","이순신","세종대왕"};
		
		//확장 for문 (jdk 1.5이상)
		for(String na : name) { //name의 첫 번째 방 값부터 차례대로 na 변수에 저장합니다.
			System.out.println(na);
		}
		
		//기존for문
		for(int i=0;i<name.length;i++)
			System.out.println(name[i]);
	}
}
