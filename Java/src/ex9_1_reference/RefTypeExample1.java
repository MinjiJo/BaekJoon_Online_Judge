package ex9_1_reference;
class RefTypeExample1 {
	public static void main(String args[]) {
		Point obj1 = new Point(10, 20);	//��ü ����
		Point obj2 = obj1;	//obj1�� obj2�� ���� ��ü�� ����Ű�� �ȴ�.
		System.out.printf("obj1 = (%d, %d) %n", obj1.x, obj1.y);
		System.out.printf("obj2 = (%d, %d) %n", obj2.x, obj2.y);
		
		obj2.x = 30;
		System.out.printf("obj1 = (%d, %d) %n", obj1.x, obj1.y);
		System.out.printf("obj2 = (%d, %d) %n", obj2.x, obj2.y);
	}
}
