package ex7_5_default_constructor;

public class SubscriberInfo {
String name, id, password, phoneNo, address;
  	// 매개 변수 없는 생성자 추가
	// 자바 컴파일러는 클래스에 선언된 생성자가 하나라도 있으면
	// 디폴트 생성자(매개변수가 없고 본체 내용이 없는 생성자)를 추가하지 않습니다.
	SubscriberInfo(){
		
	}

	//3개의 String타입 파라미터를 갖는 생성자 선언
	SubscriberInfo(String name, String id, String password){
		this.name = name; //this는 참조변수로 인스턴스 타입 자기 자신을 가리킴
		this.id = id;
		this.password = password;
	}
	
	//5개의 String타입 파라미터를 갖는 생성자 선언
	SubscriberInfo(String name, String id, String password, String phoneNo, String address){
		this.name = name;
		this.id = id;
		this.password = password;
		this.phoneNo = phoneNo;
		this.address = address;
	}
	
	//반환형이 없는 메서드
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
