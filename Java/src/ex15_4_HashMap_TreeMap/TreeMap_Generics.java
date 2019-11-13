/*
 * TreeMap
 *  ���� �˻� Ʈ���� ���·� Ű�� ���� ������ �̷���� �����͸� Ű�� �����ؼ� �����մϴ�.
 *  �˻��� ���Ŀ� ������ �÷��� Ŭ�����Դϴ�.
 */
package ex15_4_HashMap_TreeMap;
import java.util.*;
public class TreeMap_Generics {
	public static void main(String[] args) {
		Map<String, String> tm = new TreeMap<String, String>();
		
		//���2. ���� Ŭ������ ���� ��ü ����
		/*
		TreeMap<String, String> tm
		= new TreeMap<String, String>();
		 */
		//Key�� Value ���� ����
		//Map�� �޼ҵ�� put�� �̿��� (Key, Value) ������ �ڷ� �����մϴ�.
		tm.put("woman", "����ִ�");
		tm.put("man", "�����Ϸ�");
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
