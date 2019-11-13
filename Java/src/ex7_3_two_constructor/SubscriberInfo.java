package ex7_3_two_constructor;

public class SubscriberInfo {
String name, id, password, phoneNo, address;
	
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
