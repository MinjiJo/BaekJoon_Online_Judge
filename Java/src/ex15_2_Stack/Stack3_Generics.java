/*
 스택(Stack) 클래스 :
  		1. LIFO(Last Input First Output) 구조
  			마지막으로 입력된 자료가 가장 먼저 출력되는 구조
  		2. 여러가지 자료형의 Data를 모두 저장할 수 있다.
 */
package ex15_2_Stack;
import java.util.Stack;
public class Stack3_Generics {
	public static void main(String[] args) {
		
		// Stack 객체 생성
		Stack<String> s = new Stack<String>();
		System.out.println("비었나요? " + s.empty());//true:비었는지 판단
		
		// Stack 값을 넣음
		s.push("좋아요");
		s.push("박보검");
		
		System.out.println("비었나요? " + s.empty());//false:비었는지 판단
		
		// 마지막 데이터 가져오는 메소드
		System.out.println("맨 마지막 데이터 : " + s.peek());
		
		// Stack의 값을 출력
		while(!s.empty()) {
			System.out.println("데이터 출력 : " + s.pop());
			System.out.println("남은 데이터 갯수 : " + s.size());
		}
		
		System.out.println("비었나요? " + s.empty());//true-비었는지 판단
	}
}
