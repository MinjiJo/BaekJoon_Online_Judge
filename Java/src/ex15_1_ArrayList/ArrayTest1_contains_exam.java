package ex15_1_ArrayList;
import java.util.*;
public class ArrayTest1_contains_exam {
	public static void main(String args[]) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("��");
		list1.add("����");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("��");
		list2.add("��");
		list2.add("����");
		list2.add("����");
		list2.add("�ܿ�");
		
		if (list1.contains("��")) {
			System.out.println("���� �����մϴ�.");
		}  else {
			System.out.println("���� �������� �ʽ��ϴ�.");
		}
		
		/*���� ������ ���ϴ� ��� ����
		for(int i = 0; i < list2.size(); i++) {
			// ������ ��ü(list2.get(i))�� list1�� ���ԵǾ� �ִ��� Ȯ��
			if (list1.contains(list2.get(i)))//i = 0 "��"
				list2.remove(i);
				System.out.println("list2= " + list2);
		}
		*/
		
		/* ���� ���� ������
		for(int i = 0; i < list2.size(); i++) {
			for(int j = 0; j < list1.size(); j++) {
				if(list2.contains(list1.get(j))) {
					list2.remove(list1.get(j));
				}	
			}
		}
		*/
		
		//list2���� list1�� ����Ǵ� ��ҵ��� ã�� ����
		for(int i = list2.size()-1; i >= 0; i--) {
			// ������ ��ü(list2.get(i))�� list1�� ���ԵǾ� �ִ��� Ȯ��
			if(list1.contains(list2.get(i)))
				list2.remove(i);
				System.out.println("list2= " + list2);
		}
		
		System.out.println("===============================");
		System.out.println("list1= " + list1);
		System.out.println("list2= " + list2);
	}
}
