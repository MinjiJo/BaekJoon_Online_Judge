package selenium_test_1101;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example05_xpath2 {

	public static void main(String[] args) {
		//크롬드라이버 위치 지정 - 필수코드
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumlib\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		//브라우저 첫 주소 작성 - get() 시작, close() 닫음
		driver.get("http://www.naver.com");
				
		List<WebElement> btns=driver.findElements(By.xpath("//*[@id='account']/div/a/i"));
		btns.get(0).click();
		WebElement id=driver.findElement(By.id("id"));
		WebElement ps=driver.findElement(By.id("pw"));
		List<WebElement> login=driver.findElements(By.cssSelector(".btn_global"));
	
		//몇 개의 클래스 선택자가 있는지 확인
		System.out.println(btns.size()); //1
		//선택자가 한개라서 0번째 클릭
		
		  id.sendKeys(""); 
		  ps.sendKeys(""); 
		  login.get(0).click();
		 
		
		//driver.close(); //브라우저 창이 열린 뒤 닫혀 다음 예제부터는 주석처리
	}

}
