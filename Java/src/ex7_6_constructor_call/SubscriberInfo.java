package ex7_6_constructor_call;

public class SubscriberInfo {
	String name, id, password, phoneNo, address;

	// �Ű� ���� ���� ������ �߰�
	// �ڹ� �����Ϸ��� Ŭ������ ����� �����ڰ� �ϳ��� ������
	// ����Ʈ ������(�Ű������� ���� ��ü ������ ���� ������)�� �߰����� �ʽ��ϴ�.
	SubscriberInfo() {

	}

	// this�� ���������� �ν��Ͻ� �ڽ��� ����ŵ�ϴ�.
	SubscriberInfo(String name, String id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}

	SubscriberInfo(String name, String id, String password, String phoneNo, String address) {
		//this() : �����ڷ� ���� Ŭ������ �ٸ� �����ڸ� ȣ���� �� ����մϴ�.
		//������ ȣ�⹮�� ������ �ȿ��� ù��° ��ɹ��̾�� �մϴ�.
		this(name, id, password);
		this.phoneNo = phoneNo;
		this.address = address;
	}

	// ��ȯ���� ���� �޼���
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
