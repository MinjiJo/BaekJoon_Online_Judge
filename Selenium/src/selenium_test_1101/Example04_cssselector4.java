package selenium_test_1101;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example04_cssselector4 {

	public static void main(String[] args) {
		//크롬드라이버 위치 지정 - 필수코드
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumlib\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		//브라우저 첫 주소 작성 - get() 시작, close() 닫음
		driver.get("http://www.naver.com");
		
		//선택자 class는 여러 개 있을 수 있어 List로 받는다.
		//네이버 로그인 버튼 - anchor 태그의 클래스 속성(class=lg_local_btn)
		
		//F12-> Elements탭-> inspector -> 로그인 클릭
		// -> anchor 태그에서 마우스 오른쪽 버튼 클릭
		// -> Copy -> Copy Selector -> 붙여넣기
		List<WebElement> btns=driver.findElements(By.cssSelector("#account > div > a"));
		
		//몇 개의 클래스 선택자가 있는지 확인
		System.out.println(btns.size()); //1
		//선택자가 한개라서 0번째 클릭
		btns.get(0).click();

		//driver.close(); //브라우저 창이 열린 뒤 닫혀 다음 예제부터는 주석처리
	}

}
