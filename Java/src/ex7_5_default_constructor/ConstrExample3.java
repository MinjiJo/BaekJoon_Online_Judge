//에러 발생
//생성자에 파라미터를 넘겨주지 않고 객체를 생성하는 프로그램
//이유:The constructor SubscriberInfo()
//해결 : SubscriberInfo()를 정의해 주어야 합니다.

package ex7_5_default_constructor;

public class ConstrExample3 {
	public static void main(String args[]) {
		SubscriberInfo obj;
		obj = new SubscriberInfo();
		obj.address = "서울시 강남구";
		printSubscriberInfo(obj);
		
		obj.setAddress("서울시 강남구");
		printSubscriberInfo(obj);
	}
	
	static void printSubscriberInfo(SubscriberInfo obj) { //static : 객체 생성하지 않아도 . 찍고 사용 가능
		System.out.println("이름:" + obj.name);
		System.out.println("아이디:" + obj.id);
		System.out.println("패스워드:" + obj.password);
		System.out.println("전화번호:" + obj.phoneNo);
		System.out.println("주소:" + obj.address);
		System.out.println();
	}
	
}
