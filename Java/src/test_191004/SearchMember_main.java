package test_191004;

public class SearchMember_main {
	public static void main(String[] args) {
		SearchMember dao = new SearchMember();
		ShopMember sm = dao.searchMember("hihi");
		System.out.println(sm);
	}
}
