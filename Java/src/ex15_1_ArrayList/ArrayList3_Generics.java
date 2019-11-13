/* 
*	-	지네릭스(Generics) jdk 1.5에서 처음 도입
		다양한 타입의 객체들을 다루는 메소드나 컬렉션 클래스에 컴파일 시의 타입체크를
		해주는 기능입니다.
*	-	클래스 옆에 꺽쇠(<>)기호를 이용해서 만듭니다.
	-	<> 안에 특정 자료형(Wrapper 클래스, String, 사용자 정의 클래스형)을
		넣어주면 됩니다.
	-	사용 예)
			List<String>		list = new ArrayList<String>();
			ArrayList<String>	list = new ArrayList<String>();
			ArrayList<Integer>	list = new ArrayList<Integer>();
			ArrayList<Double>	list = new ArrayList<Double>();
			ArrayList<MemberInput> list =
				new ArrayList<MemberInput>();
 */
package ex15_1_ArrayList;
import java.util.*;
class ArrayList3_Generics {
	public static void main(String args[]) {
		//업캐스팅(상속해준 메소드만 사용가능합니다.)
		//List<String> list = new ArrayList();
		List list = new ArrayList();
		//ArrayList list = new ArrayList();
		
		//자료 추가
		list.add("하나");
		list.add(2);
		list.add(false);
		list.add(3.42);
		list.add("넷");
		list.add("five");
		list.add('A');
		
		//출력방법 1. 
		System.out.println(list);	//list의 모든 데이터 출력
		System.out.println(list.toString());
		
		//size() : 데이터의 갯수 구하는 메소드
		System.out.println("데이터의 갯수 = " + list.size());
		
		//get(index) : 해당 인덱스의 데이터 가져오는 메소드
		//get(3) : 0부터 시작, index=3인 데이터 출력해라
		System.out.println("list.get(3) = " + list.get(3));
		
		System.out.println("===get()메소드 이용법===");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + "번째 요소 = " + list.get(i));
		}
		
		System.out.println("=======================");	
		for(int i = 0; i < list.size(); i++) {
			Object s = list.get(i);	// get()메소드의 반환형은 Object형
			System.out.println(s);
		}
		
		//출력방법 3. - Iterator  인터페이스 사용 : 반복자
		System.out.println("===Iterator 인터페이스 사용===");
		Iterator elements = list.iterator();
		//hasNext() : 읽어올 요소가 있는지 확인합니다.
		while(elements.hasNext()) {
			System.out.println(elements.next());
				//next() 메소드를 이용해서 차례대로 한개씩 데이터를 가져옵니다.
		}
		
		//출력방법 4. - for문 사용
		System.out.println("===향상된 for문 사용===");
		for(Object a : list) {
			System.out.println(a);
		}
	}
}
