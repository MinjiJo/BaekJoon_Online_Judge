package test_191004;

public class JoinMember_main {
	public static void main(String[] args) {
		JoinMember jm = new JoinMember();
		User user = new User();
		int result = jm.joinMember(user);
		System.out.println(result);
	}
}
