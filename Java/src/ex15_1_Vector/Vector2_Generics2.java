//Generic ���
/*
   Vector Ŭ���� - ArrayList�� ������
   				ArrayList�� ���� ���, �� �߿��� ArrayList�� �� ���� ���
   		1. �������� �ڷ����� Data�� ��� ������ �� �ֽ��ϴ�.
   			ex) int, double, char, boolean, String etc
   		2. �����ִ� ��.��� ó��(index��ȣ ������ �����)
   		3. �ߺ��� Data�� ������ �� �ֽ��ϴ�.
   		4. ����� ��� �پ��մϴ�.(���������� ��� ����)
   		5. ������ ����ȭ�� �ϱ� ������ ���� ������ ó��������
   			ArrayList�� LinkedList���� ������ �������ϴ�.
   		����) ����ȭ�� �����忡�� �����ڿ��� �۾��� ��ġ�� �� ������
   			  �ٸ� �����忡�� �����ڿ��� ���� ���� ���ϰ� ����ϴ� ��
 */
package ex15_1_Vector;
import java.util.*;
public class Vector2_Generics2 {
	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>();// String���� �� �� ����
		vec.add("Apple");
		vec.add("banana");
		vec.add("Orange");
		vLinkedList(vec);
		
		vec.add(2, "Ű��");
		vLinkedList(vec);
		
		vec.set(0, "������");
		vLinkedList(vec);
		
		vec.remove(1);
		vLinkedList(vec);
	}
	
	static void vLinkedList(Vector<String> vec) {
		// Vector�� ����
		// ��� ���2. Enumeration ��� = Iterator�� ������
		System.out.println("=== Enumeration ===");
		Enumeration enu = vec.elements();
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
		
		//��� ��� 3. Iterator ���
		System.out.println("=== Iterator ===");
		Iterator<String> iterator = vec.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
		
	}
}
