package ex7_3_two_constructor;

public class SubscriberInfo {
String name, id, password, phoneNo, address;
	
	//3���� StringŸ�� �Ķ���͸� ���� ������ ����
	SubscriberInfo(String name, String id, String password){
		this.name = name; //this�� ���������� �ν��Ͻ� Ÿ�� �ڱ� �ڽ��� ����Ŵ
		this.id = id;
		this.password = password;
	}
	
	//5���� StringŸ�� �Ķ���͸� ���� ������ ����
	SubscriberInfo(String name, String id, String password, String phoneNo, String address){
		this.name = name;
		this.id = id;
		this.password = password;
		this.phoneNo = phoneNo;
		this.address = address;
	}
	
	//��ȯ���� ���� �޼���
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
