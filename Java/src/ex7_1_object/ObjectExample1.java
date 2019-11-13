//StringBuffer객체를 생성하고 사용하는 프로그램
package ex7_1_object;

public class ObjectExample1 {
	public static void main(String args[]) {
		StringBuffer obj;						//변수 선언
		obj = new StringBuffer("Hey, Java");	//객체 생성
		obj.deleteCharAt(1);	// Hy, Java
		System.out.println(obj);
		
		obj.deleteCharAt(1);	// H, Java
		System.out.println(obj);
		
		obj.insert(1, 'i');	//	Hi, Java
		System.out.println(obj);//StringBuffer 객체를 넘겨 줄 수 있습니다.
	}
}
