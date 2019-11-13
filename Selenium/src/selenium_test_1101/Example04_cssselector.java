package selenium_test_1101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example04_cssselector {

	public static void main(String[] args) {
		//크롬드라이버 위치 지정 - 필수코드
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumlib\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		//브라우저 첫 주소 작성 - get() 시작, close() 닫음
		driver.get("http://google.com");
		
		String se=".gLFyf.gsfi"; //클래스가 여러 개인 경우 이와 같이 표현
								 //cssSelector(se) 이용함
				
		//se="#tsf > div:nth-child(2) > div > div.RNNXgb > div> 
		WebElement btns=driver.findElement(By.cssSelector(se));
		btns.sendKeys("공민왕"); 
		btns.submit();
		
		//driver.close(); //브라우저 창이 열린 뒤 닫혀 다음 예제부터는 주석처리
	}

}
