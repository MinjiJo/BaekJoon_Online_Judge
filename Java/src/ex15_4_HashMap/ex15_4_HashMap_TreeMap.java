//Hashtable�� Generic ��뿹
package ex15_4_HashMap;
import java.util.*;
public class ex15_4_HashMap_TreeMap {
	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("���", "Apple");
		ht.put("����", "StrawBerry");
		ht.put("����", "Grapes");
		
		//�ؽ� ���̺��� ���� Ű�� �̿��Ͽ� ��´�.
		String Val = ht.get("����");
		if(Val != null) {
			System.out.println("����-> " + Val);
		}
	}
}
