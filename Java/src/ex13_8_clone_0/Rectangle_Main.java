package ex13_8_clone_0;

public class Rectangle_Main {
	public static void main(String[] args) {
		//��ü �����մϴ�.
		Rectangle obj1 = new Rectangle(10, 20);
		
		//clone �޼���� ��ü�� �����մϴ�.
		//Rectangle obj2 = (Rectangle) obj1.clone();
		
		//���� ��ü�� ���� ��ü�� ���� ����մϴ�.
		System.out.println("obj1 = " + obj1.width + "x" + obj1.height);
		//System.out.println("obj2 = " + obj2.width + "x" + obj2.height);
	}
}
