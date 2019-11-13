package ex4_4_incre_dec;

public class IncrDecExample4 {
	public static void main(String[] args) {
		char a = 'A';		//'A'의 문자 코드값은 65로 변수 a에 저장된 값입니다.
		System.out.println(++a); //문자 코드의 값이 1증가되어 66이 되고
								 //이 값을 타입에 따라 출력합니다.
		
		a--;
		System.out.println(a);
		
		char b = (char) (a+32);
		System.out.println(a+"=>"+b);
		
		a++;
		char c = (char) (a+32);
		System.out.println(a+"=>"+c);
		
	}
}
