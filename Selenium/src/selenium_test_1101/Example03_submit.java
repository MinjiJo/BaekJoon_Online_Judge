package selenium_test_1101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example03_submit {

	public static void main(String[] args) {
		//크롬드라이버 위치 지정 - 필수코드
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumlib\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		//브라우저 첫 주소 작성 - get() 시작, close() 닫음
		driver.get("http://google.com");
		
		//로그인의 anchor 태그 클래스 속성을 찾아봅니다.
		WebElement btns=driver.findElement(By.className("gLFyf"));
		btns.sendKeys("KH정보교육원");
		
		//submit() : form을 알아서 찾은 뒤 submit을 합니다.
		btns.submit();
		
		//driver.close(); //브라우저 창이 열린 뒤 닫혀 다음 예제부터는 주석처리
	}

}
