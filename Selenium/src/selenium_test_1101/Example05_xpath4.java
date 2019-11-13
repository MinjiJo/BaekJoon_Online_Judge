package selenium_test_1101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example05_xpath4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumlib\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://interpark.com");
				
		WebElement btns=driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/ul/li/a"));
		btns.click();
		
		//frame 변경합니다.
		driver.switchTo().frame("subIframe");
		
		WebElement id=driver.findElement(By.id("userId"));
		WebElement ps=driver.findElement(By.id("userPwd"));
	//	WebElement login=driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[3]/a"));
	
		  id.sendKeys("interpark"); 
		  ps.sendKeys("interpark1234"); 
	//	  login.click();
		 
		
		//driver.close(); //브라우저 창이 열린 뒤 닫혀 다음 예제부터는 주석처리
	}

}
