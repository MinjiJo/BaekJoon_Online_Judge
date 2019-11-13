/* List �������̽� - ArrayList(��� �޴� Ŭ����)
	1. �������� �ڷ����� Data�� ��� ������ �� �ֽ��ϴ�.
		ex) int, double, char, boolean, String etc
	2. �Է��� ������� ��µ˴ϴ�.(index��ȣ ������ �����)
	3. �ߺ��� Data�� ������ �� �ֽ��ϴ�.
	4. �迭�� ������ �迭���� ����� �� ���� ���� ����� �� �ֽ��ϴ�.
	5. ������ ���� ������ �̿��� �� �ֽ��ϴ�.
 */
package ex15_1_ArrayList;
import java.util.*;
class ArrayList1_add {
	public static void main(String args[]) {
		//��ĳ����(������� �޼ҵ常 ��밡���մϴ�.)
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
		for(Object a : list) {
			System.out.println(a);
		}
	}
}
