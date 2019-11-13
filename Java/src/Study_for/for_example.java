//https://hoy.kr/o7DQ3
package Study_for;

public class for_example {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i ++) {
			String star = "*****      ";
			if(i < 5) {
				System.out.println(star.substring(0, 1+i) + star.substring(5+i, 10));
			}else {
				System.out.println(star.substring(5, 1+i) + star.substring(i-5, 5));
			}
		}
	}
}