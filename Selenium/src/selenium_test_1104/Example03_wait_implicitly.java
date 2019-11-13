package selenium_test_1104;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Example03_wait_implicitly {

	public static void main(String[] args) {
		//크롬 드라이버가 위치한 경로 및 드라이버 파일 위치를 지정해야 한다. - 필수임
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumlib\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//암시적 대기 - 웹 드라이버는 예외를 throw하기 전에 해당 시간 동안 기다립니다.
		//아래 문장을 주석으로 처리하면 바로 오류가 화면에 나타납니다.
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://192.168.40.8:8088/Se_Web/board2/loginInput.html");
		WebElement id=driver.findElement(By.id("id2"));
		WebElement pass=driver.findElement(By.id("password"));
		
		id.sendKeys("Q1234");
		pass.sendKeys("1234");
	}
}
