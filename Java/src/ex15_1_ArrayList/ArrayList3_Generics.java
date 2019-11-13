/* 
*	-	���׸���(Generics) jdk 1.5���� ó�� ����
		�پ��� Ÿ���� ��ü���� �ٷ�� �޼ҵ峪 �÷��� Ŭ������ ������ ���� Ÿ��üũ��
		���ִ� ����Դϴ�.
*	-	Ŭ���� ���� ����(<>)��ȣ�� �̿��ؼ� ����ϴ�.
	-	<> �ȿ� Ư�� �ڷ���(Wrapper Ŭ����, String, ����� ���� Ŭ������)��
		�־��ָ� �˴ϴ�.
	-	��� ��)
			List<String>		list = new ArrayList<String>();
			ArrayList<String>	list = new ArrayList<String>();
			ArrayList<Integer>	list = new ArrayList<Integer>();
			ArrayList<Double>	list = new ArrayList<Double>();
			ArrayList<MemberInput> list =
				new ArrayList<MemberInput>();
 */
package ex15_1_ArrayList;
import java.util.*;
class ArrayList3_Generics {
	public static void main(String args[]) {
		//��ĳ����(������� �޼ҵ常 ��밡���մϴ�.)
		//List<String> list = new ArrayList();
		List list = new ArrayList();
		//ArrayList list = new ArrayList();
		
		//�ڷ� �߰�
		list.add("�ϳ�");
		list.add(2);
		list.add(false);
		list.add(3.42);
		list.add("��");
		list.add("five");
		list.add('A');
		
		//��¹�� 1. 
		System.out.println(list);	//list�� ��� ������ ���
		System.out.println(list.toString());
		
		//size() : �������� ���� ���ϴ� �޼ҵ�
		System.out.println("�������� ���� = " + list.size());
		
		//get(index) : �ش� �ε����� ������ �������� �޼ҵ�
		//get(3) : 0���� ����, index=3�� ������ ����ض�
		System.out.println("list.get(3) = " + list.get(3));
		
		System.out.println("===get()�޼ҵ� �̿��===");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + "��° ��� = " + list.get(i));
		}
		
		System.out.println("=======================");	
		for(int i = 0; i < list.size(); i++) {
			Object s = list.get(i);	// get()�޼ҵ��� ��ȯ���� Object��
			System.out.println(s);
		}
		
		//��¹�� 3. - Iterator  �������̽� ��� : �ݺ���
		System.out.println("===Iterator �������̽� ���===");
		Iterator elements = list.iterator();
		//hasNext() : �о�� ��Ұ� �ִ��� Ȯ���մϴ�.
		while(elements.hasNext()) {
			System.out.println(elements.next());
				//next() �޼ҵ带 �̿��ؼ� ���ʴ�� �Ѱ��� �����͸� �����ɴϴ�.
		}
		
		//��¹�� 4. - for�� ���
		System.out.println("===���� for�� ���===");
		for(Object a : list) {
			System.out.println(a);
		}
	}
}
