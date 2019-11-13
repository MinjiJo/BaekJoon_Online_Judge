// double -> int 형 변환 에러
package ex3_4_casting;

public class CastingEx1 {
	public static void main(String[] args) {
		//정수형 변수 i1에 10을 대입합니다.
		int i1=10;
		
		double d1=i1;//실수형 변수에 정수형 값을 저장할 수 있습니다.
		System.out.println("d1 데이터는 " + d1 + "입니다.");
		
		//	에러 발생 -> 디버그
		double d2=10.12345;
		//int i2 = d2;//정수형 변수에 실수형 값을 지정할 수 없습니다.
		int i2= (int) d2; //int로 자른다는 것
		System.out.println("i2 데이터는 " + i2 + "입니다.");
	}
}
