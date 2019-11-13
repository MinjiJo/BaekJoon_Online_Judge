/*특수 문자를 표현하는 문자 리터널
 * tab				- \t
 * new line			- \n
 * 역슬래쉬			- \\
 * 큰따옴표			- \" 
 */
package ex3_1_literal;

public class First2 {
	public static void main(String args[]) {
		System.out.println("호호하하");
		System.out.println("\"호호하하\"");
		System.out.println("호호하하\n");
		System.out.println("호호\t하하");
		System.out.println("호호\\하하");
	}
}
