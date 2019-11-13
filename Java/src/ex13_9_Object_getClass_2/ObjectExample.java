package ex13_9_Object_getClass_2;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/*
 * Class 객체를 이용하면 클래스의 생성자, 필드, 메서드 정보를 알 수 있습니다.
 * 이것을 Reflection이라고 합니다.
 * 즉, 객체를 통해 클래스의 정보를 분석해 내는 프로그램 기법을 의미합니다.
 */
class ObjectExample {
	public static void main(String args[]) {
		Rectangle obj = new Rectangle(10, 20);
		//getClass() : 객체가 속하는 클래스의 정보를 알아내는 메소드
		//getClass 메소드는 객체가 속하는 클래스의 정보를
		//Class 타입의 객체로 만들어서 리턴
		Class cls = obj.getClass();
		
		//getName() : 클래스의 이름을 리턴하는 메소드
		String name = cls.getName();
		System.out.println("패키지 포함한 클래스 이름 : " + name);
		System.out.println("패키지 제외한 클래스 이름 : " + cls.getSimpleName());
		
		//슈퍼 클래스의 정보를 리턴하는 메소드
		Class superCls = cls.getSuperclass();
		
		//슈퍼 클래스의 이름을 리턴하는 메소드
		String superName = superCls.getName();
		System.out.println("슈퍼클래스 이름 : " + superName);
		
		//클래스에 선언되어 있는 필드 정보를 가져오는 메소드
		Field field[] = cls.getDeclaredFields();
		System.out.println("필드: ");
		for (int cnt = 0; cnt < field.length; cnt++)
			System.out.println("	" + field[cnt]);
		
		//클래스에 선언되어 있는 메소드 정보를 가져오는 메소드
		Method method[] = cls.getDeclaredMethods();
		System.out.println("메서드: ");
		for (int cnt = 0; cnt < method.length; cnt++)
			System.out.println("	" + method[cnt]);
	}
}
