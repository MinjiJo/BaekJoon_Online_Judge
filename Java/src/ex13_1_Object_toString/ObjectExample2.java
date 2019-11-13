//Object 클래스에 정의된 toString()은 인스턴스에 대한 정보를...
package ex13_1_Object_toString;

class ObjectExample2 {
	public static void main(String args[]) {
		Circle obj1 = new Circle(5);
		Circle obj2 = new Circle(5);
		
		System.out.println(obj1.toString());
		//System.out.print()나 System.out.println()메소드에
		//문자열이 아닌 객체를 넘겨주면 그 메소드 안에서 간접적으로
		//toString메소드가 호출됩니다.
		System.out.println(obj1);
		
		System.out.println(obj2.toString());
		System.out.println(obj2);
	}
}
