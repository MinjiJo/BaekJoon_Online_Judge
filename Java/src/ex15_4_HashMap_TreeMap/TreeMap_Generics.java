/*
 * TreeMap
 *  이진 검색 트리의 형태로 키와 값의 쌍으로 이루어진 데이터를 키로 정렬해서 저장합니다.
 *  검색과 정렬에 적합한 컬렉션 클래스입니다.
 */
package ex15_4_HashMap_TreeMap;
import java.util.*;
public class TreeMap_Generics {
	public static void main(String[] args) {
		Map<String, String> tm = new TreeMap<String, String>();
		
		//방법2. 구현 클래스를 통한 객체 생성
		/*
		TreeMap<String, String> tm
		= new TreeMap<String, String>();
		 */
		//Key와 Value 쌍을 삽입
		//Map의 메소드는 put을 이용해 (Key, Value) 쌍으로 자료 지정합니다.
		tm.put("woman", "재미있니");
		tm.put("man", "좋은하루");
		tm.put("age", new String("10"));
		tm.put("city", "seoul"); 
		
		System.out.println(tm);
		
		System.out.println("==========================================");
		System.out.println(tm.keySet());
		System.out.println(tm.values());
		
		System.out.println("==========================================");
		System.out.println(tm.get("woman"));
		System.out.println(tm.get("man"));
		System.out.println(tm.get("age"));
		System.out.println(tm.get("city"));
		
		System.out.println("==========================================");
		Set<String> keys = tm.keySet();
		for(String key : keys) {
			System.out.println(key + " = " + tm.get(key));
		}
	}
}
