package ex7_17_static_int;

public class HundredNumbers2 {
	static int arr[];
	String a;
	
	HundredNumbers2(){
		//System.out.println("여기는 생성자 입니다.")
	}
	
	HundredNumbers2(String a){
		//System.out.println("여기는 생성자 입니다.")
		this.a = a;
	}
	
	//인스턴스 초기화 블럭 : 23, 27라인의 중복 코드를 여기에 넣어 두면 코드의 중복을 줄일 수 있습니다.
	{
		System.out.println("여기는 생성자 입니다.");
	}
}
