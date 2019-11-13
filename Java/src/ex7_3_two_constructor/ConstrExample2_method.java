package ex7_3_two_constructor;

public class ConstrExample2_method {
	public static void main(String args[]) {
		SubscriberInfo obj1 = new SubscriberInfo("연홍부", "poorman", "zebi");
		print(obj1);

		SubscriberInfo obj2 = new SubscriberInfo("연놀부", "richman", "money", "02-123-4567", "강남");
		print(obj2);
	}

	public static void print(SubscriberInfo obj) { // static : 객체 생성하지 않아도 . 찍고 사용 가능
		System.out.println("이름:" + obj.name);
		System.out.println("아이디:" + obj.id);
		System.out.println("패스워드:" + obj.password);
		System.out.println("전화번호:" + obj.phoneNo);
		System.out.println("주소:" + obj.address);
		System.out.println();
	}
}
