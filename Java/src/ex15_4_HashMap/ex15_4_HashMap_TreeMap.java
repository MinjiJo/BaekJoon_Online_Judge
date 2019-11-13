//Hashtable에 Generic 사용예
package ex15_4_HashMap;
import java.util.*;
public class ex15_4_HashMap_TreeMap {
	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("사과", "Apple");
		ht.put("딸기", "StrawBerry");
		ht.put("포도", "Grapes");
		
		//해쉬 테이블의 값을 키를 이용하여 얻는다.
		String Val = ht.get("포도");
		if(Val != null) {
			System.out.println("포도-> " + Val);
		}
	}
}
