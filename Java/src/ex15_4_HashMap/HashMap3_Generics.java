package ex15_4_HashMap;
import java.util.*;
public class HashMap3_Generics {
	public static void main(String[] args) {
		//HashMap ��ü ���� ��� �� ����
		//Map hm = new HashMap();	//���1. ��ĳ����
		HashMap<String, String> hm
		= new HashMap<String, String>();//���2. ���� Ŭ������ ���� ��ü ����
		
		//Key�� Value ���� ����
		//Map�� put()�� �̿��� (Key, Value) ������ �ڷ� �����մϴ�.
		hm.put("woman", "����ִ�");
		hm.put("man", "�����Ϸ�");
		hm.put("age", new String("10"));
		hm.put("city", "Seoul");
		hm.put("city", "Busan");
		//HashMap�� �ִ� ��ü���� ���
		//��� ��� 1. �ش� ��ü������ ���
		System.out.println(hm);
		//{woman=����ִ�, city=Busan, man=�����Ϸ�, age=10}
		
		//��� ��� 2. Key ���� ���
		System.out.println(hm.keySet());//[woman, city, man, age]
		
		//��� ��� 3. Value ���� ���
		System.out.println(hm.values());//[����ִ�, Busan, �����Ϸ�, 10]
		
		//��� ��� 4.
		//get(Key) : Key�� �ش��ϴ� Value�� ��� - ���� ���� ���
		System.out.println(hm.get("woman"));//����ִ�
		System.out.println(hm.get("man"));//�����Ϸ�
		System.out.println(hm.get("age"));//10
		System.out.println(hm.get("city"));//Busan
		
		//��� ��� 5.
		System.out.println("===============================");
		Set<String> keys = hm.keySet();
		for(String key : keys) {
			System.out.println(key + "=" + hm.get(key));
		}
	}
}
