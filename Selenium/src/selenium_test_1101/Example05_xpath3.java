package selenium_test_1101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example05_xpath3 {

	public static void main(String[] args) {
		//크롬드라이버 위치 지정 - 필수코드
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumlib\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		//브라우저 첫 주소 작성 - get() 시작, close() 닫음
		driver.get("http://iei.or.kr");
				
		WebElement btns=driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/a"));
		btns.click();
		WebElement id=driver.findElement(By.id("id"));
		WebElement ps=driver.findElement(By.id("password"));
		id.sendKeys("moonwc"); 
		ps.sendKeys(""); //여기 비번 넣으면 됨 
		WebElement login=driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[3]/div/div/div[2]/a"));  
		login.click();
		 
		
		//driver.close(); //브라우저 창이 열린 뒤 닫혀 다음 예제부터는 주석처리
	}

}
