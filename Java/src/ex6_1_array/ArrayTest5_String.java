package ex6_1_array;

import java.util.Scanner;

public class ArrayTest5_String {
	public static void main(String[] args) {
		// String names[] = { "홍길동", "전우치", "홍길동", "세종대왕", "김길동" };
		String[] names = new String[] { "홍길동", "전우치", "홍길동", "세종대왕", "김길동" };

		// 몇 번 방에 들어있는지 확인하는 변수로 초기값 -1은 인덱스와 겹치지 않는 수를 사용합니다.
		int index = -1;

		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 이름을 입력하세요>");
		String inputname = sc.next();
		System.out.println("이름:" + inputname);

		for (int i = 0; i < names.length; i++) {
			if (inputname.equals(names[i])) {
				index = i; // 입력한 이름과 같은 이름을 인덱스 0 부터 찾습니다.
				break; // 입력한 이름과 같은 이름을 찾으면 반복문 벗어납니다.
				// break;를 없애면 끝날 때까지 돌아서 홍길동이 2번방으로 나옴
			}
		}
		
		/*
		  for (int i = names.length-1; i >= 0 ; --i) {
		  	if (inputname.equals(names[i])) {
		  		index = i;	//인덱스 마지막 값의 위치에서부터 입력한 이름과 같은 이름을 찾습니다.
		  		break;		//입력한 이름과 같은 이름을 찾으면 반복문 벗어납니다.
		  	}
		  }
		 */

		// 입력한 이름과 배열의 이름을 찾았을 때
		if (index != -1) {
			System.out.println(inputname + "은 배열의 " + index + "번 방에서 찾았습니다.");
		} else
			System.out.println(inputname + "은 배열방에서 찾지 못했습니다.");

		sc.close();

	}
}
