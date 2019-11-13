/* List 인터페이스 - ArrayList(상속 받는 클래스)
	1. 여러가지 자료형의 Data를 모두 저장할 수 있습니다.
		ex) int, double, char, boolean, String etc
	2. 입력한 순서대로 출력됩니다.(index번호 순으로 저장됨)
	3. 중복된 Data를 저장할 수 있습니다.
	4. 배열의 장점과 배열에서 사용할 수 없는 것을 사용할 수 있습니다.
	5. 동적인 저장 구조를 이용할 수 있습니다.
 */
package ex15_1_ArrayList;
import java.util.*;
class ArrayList1_add {
	public static void main(String args[]) {
		//업캐스팅(상속해준 메소드만 사용가능합니다.)
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
		for(Object a : list) {
			System.out.println(a);
		}
	}
}
