package selenium_test_1101;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example06_iframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumlib\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://192.168.40.8:8088/Se_Web/ex1/Test5.html");
		
		//오류 해결 - parentFrame을 iframe으로 변경한다.
		//아래 문장을 주석으로 처리하면
		//Element info: {Using=id, value=memId} 오류 발생
		//<iframe name="subIframe" src="loginInput.html" width="500" height="550" cd_frame_id_="91d3ba40f56c29ecb596f35d27023bb4"></iframe>
		
		driver.switchTo().frame("subIframe");
		
		WebElement id=driver.findElement(By.id("id"));
		WebElement ps=driver.findElement(By.id("password"));
		id.sendKeys("test2");
		ps.sendKeys("test");
		
		//로그인 버튼 실행하는 방법
		//1. 자바스크립트 함수 fnLogin() 실행
		JavascriptExecutor exe=(JavascriptExecutor)driver;
		exe.executeScript("fnLogin()");
		
		//2. 로그인 버튼 클릭
		//WebElement button=driver.findElement(By.cssSelector("button"));
		//button.click();
	}

}
