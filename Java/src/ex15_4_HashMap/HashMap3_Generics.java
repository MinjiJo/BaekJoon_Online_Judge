package ex15_4_HashMap;
import java.util.*;
public class HashMap3_Generics {
	public static void main(String[] args) {
		//HashMap 객체 생성 방법 두 가지
		//Map hm = new HashMap();	//방법1. 업캐스팅
		HashMap<String, String> hm
		= new HashMap<String, String>();//방법2. 구현 클래스를 통한 객체 생성
		
		//Key와 Value 쌍을 삽입
		//Map의 put()을 이용해 (Key, Value) 쌍으로 자료 저장합니다.
		hm.put("woman", "재미있니");
		hm.put("man", "좋은하루");
		hm.put("age", new String("10"));
		hm.put("city", "Seoul");
		hm.put("city", "Busan");
		//HashMap에 있는 객체들을 출력
		//출력 방법 1. 해당 개체명으로 출력
		System.out.println(hm);
		//{woman=재미있니, city=Busan, man=좋은하루, age=10}
		
		//출력 방법 2. Key 값만 출력
		System.out.println(hm.keySet());//[woman, city, man, age]
		
		//출력 방법 3. Value 값만 출력
		System.out.println(hm.values());//[재미있니, Busan, 좋은하루, 10]
		
		//출력 방법 4.
		//get(Key) : Key에 해당하는 Value를 출력 - 가장 많이 사용
		System.out.println(hm.get("woman"));//재미있니
		System.out.println(hm.get("man"));//좋은하루
		System.out.println(hm.get("age"));//10
		System.out.println(hm.get("city"));//Busan
		
		//출력 방법 5.
		System.out.println("===============================");
		Set<String> keys = hm.keySet();
		for(String key : keys) {
			System.out.println(key + "=" + hm.get(key));
		}
	}
}
