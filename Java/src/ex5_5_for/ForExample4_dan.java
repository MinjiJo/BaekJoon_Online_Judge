package ex5_5_for;

public class ForExample4_dan {
	public static void main(String[] args) {
		int i, dan;
		
		for(dan = 2; dan <= 9; dan++) {
			System.out.println("[" + dan + "´Ü]");
			for(i=1; i<10; i++)
				System.out.println(dan+"*"+i+"="+(dan*i));
		}
	}
}
