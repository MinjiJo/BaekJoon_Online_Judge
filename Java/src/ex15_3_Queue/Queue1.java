/*
 	ť(Queue) �������̽�
 	- LinkedList (Queue �������̽��� ������ Ŭ����) ���
 	- FIFO(First Input First Output) ����
 	    ���� �Էµ� �ڷᰡ ���� ��µǴ� ����
 */
package ex15_3_Queue;
import java.util.*;
class Queue1 {
	public static void main(String args[]) {
		//ť�� ����� LinkedList ��ü�� �����մϴ�.
		//LinkedList<String> queue = new LinkedList<String>();
		Queue<String> queue = new LinkedList<String>();
		System.out.println("�������? " + queue.isEmpty());//true
		
		//offer() �޼ҵ� : ť�� 3���� �����͸� �߰�
		queue.offer("�䳢");
		queue.offer("�罿");
		queue.offer("ȣ����");
		
		//peek() �޼ҵ� : ó�� �����͸� �״�� �� ���·� �����ɴϴ�.
		System.out.println(queue.peek());
		System.out.println("�������? " + queue.isEmpty());//false
		System.out.println("���� = " + queue.size());
		
		System.out.println("poll() ���");
		while(!queue.isEmpty()) {
			//poll() �޼ҵ�� ť�� �ִ� �����͸� �����ϸ鼭 �����ɴϴ�.
			String str = queue.poll();
			System.out.println(str);
		}
		
		System.out.println("�������? " + queue.isEmpty());//false
		System.out.println("���� = " + queue.size());
	}
}
