package ex7_6_constructor_call;

public class SubscriberInfo {
	String name, id, password, phoneNo, address;

	// 매개 변수 없는 생성자 추가
	// 자바 컴파일러는 클래스에 선언된 생성자가 하나라도 있으면
	// 디폴트 생성자(매개변수가 없고 본체 내용이 없는 생성자)를 추가하지 않습니다.
	SubscriberInfo() {

	}

	// this는 참조변수로 인스턴스 자신을 가리킵니다.
	SubscriberInfo(String name, String id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}

	SubscriberInfo(String name, String id, String password, String phoneNo, String address) {
		//this() : 생성자로 같은 클래스의 다른 생성자를 호출할 때 사용합니다.
		//생성자 호출문은 생성자 안에서 첫번째 명령문이어야 합니다.
		this(name, id, password);
		this.phoneNo = phoneNo;
		this.address = address;
	}

	// 반환형이 없는 메서드
	void changePassword(String password) {
		this.password = password;
	}

	void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	void setAddress(String address) {
		this.address = address;
	}
}
