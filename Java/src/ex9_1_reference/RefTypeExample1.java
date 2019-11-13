package ex9_1_reference;
class RefTypeExample1 {
	public static void main(String args[]) {
		Point obj1 = new Point(10, 20);	//객체 생성
		Point obj2 = obj1;	//obj1과 obj2는 같은 객체를 가르키게 된다.
		System.out.printf("obj1 = (%d, %d) %n", obj1.x, obj1.y);
		System.out.printf("obj2 = (%d, %d) %n", obj2.x, obj2.y);
		
		obj2.x = 30;
		System.out.printf("obj1 = (%d, %d) %n", obj1.x, obj1.y);
		System.out.printf("obj2 = (%d, %d) %n", obj2.x, obj2.y);
	}
}
