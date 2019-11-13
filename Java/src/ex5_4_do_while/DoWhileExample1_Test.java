package ex5_4_do_while;
import java.util.Scanner;

public class DoWhileExample1_Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String area;
				
		do {
			System.out.print("지역입력(exit=q)>");
			area = sc.next();
			
			switch (area) {
			case "서울":
			case "부산":
			case "대전":
			case "대구":
				System.out.println(area+"입니다.");
				break;
			case "q":	//이 case문이 없는 경우 "q"를 입력하면 "그외 지역입니다." 출력
				break;
			default:
				System.out.println("그외 지역입니다.");
			}
		} while (!area.equals("q"));
		
		System.out.print("끝");
			
			sc.close();
		}
}