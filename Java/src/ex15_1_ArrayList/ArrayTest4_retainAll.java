package ex15_1_ArrayList;
import java.util.*;
public class ArrayTest4_retainAll {
	public static void main(String args[]) {
		ArrayList<String> list1 = new ArrayList<String>(10);//��ȣ �� ���� �����ϸ� default �� 10���� ������
		list1.add("��");
		list1.add("����");
		
		ArrayList<String> list2 = new ArrayList<String>(10);
		list2.add("��");
		list2.add("��");
		list2.add("����");
		list2.add("����");
		list2.add("�ܿ�");
		
		//list2���� list1�� ���� �����͸� ���ܶ�
		//list2 n list1(������)
		list2.retainAll(list1);//[��, ��]
		
		System.out.println("list1= " + list1);
		System.out.println("list2= " + list2);
	}
}
