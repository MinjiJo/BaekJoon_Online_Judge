package test_191004;

public class ShopMember_main {
	public static void main(String[] args) {
		ShopMember_search dao = new ShopMember_search();
		ShopMember sm = dao.searchUser("hihi");
		System.out.println(sm);
	}
}
