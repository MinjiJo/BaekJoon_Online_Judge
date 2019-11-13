package selenium_test_1101;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example08 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumlib\\chromedriver.exe");
		
		for(int i=0; i<3; i++) {
		WebDriver driver= new ChromeDriver();	
		driver.get("http://192.168.40.8:8088/Se_Web/ex3/NewFile5.html");

		JavascriptExecutor jsexe=(JavascriptExecutor)driver;
		
		WebElement id=driver.findElement(By.id("id"));
		id.sendKeys("Q1234"+i);
		jsexe.executeScript("idcheck()");
		WebElement idbutton=driver.findElement(By.xpath("html/body/div/form/div/fieldset/input[2]"));
		idbutton.click();
		//driver.switchTo().parentFrame();
		
		//getWindowHandle() : 현재 페이지의 고유 식별자를 가져옵니다.
		// getWindowHandle()은 webDriver가 현재 제어하고 있는 페이지의 핸들을 가져옵니다. 이 핸들은 웹 페이지의 고유 식별자입니다.
		// 동일한 URL인 경우에도 페이지를 열 때마다 다릅니다.
		
		//getWindowHandles()는 웹 드라이버가 이해하는 모든 페이지에 대한 모든 핸들을 제공합니다.
		//이들을 목록에 넣으면 열린 순서대로 나열됩니다.
		
		String main=driver.getWindowHandle();
		for(String web:driver.getWindowHandles()) {
			if(!web.equals(main)) { 
				//팝업창으로 전환합니다.
				driver.switchTo().window(web).close();
			}
				
		}
		//메인창으로 전환합니다.
		driver.switchTo().window(main);	
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("1234");
		
		WebElement jumin1=driver.findElement(By.id("jumin1"));
		jumin1.sendKeys("600101");
		
		WebElement jumin2=driver.findElement(By.id("jumin2"));
		jumin2.sendKeys("1345824");
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("Q1234");
		
		Select sel=new Select(driver.findElement(By.id("sel")));
		sel.selectByIndex(1);
		//Select domain=new Select(driver.findElement(By.id("domain")));
		//domain.sendKeys("naver.com");
		
		List<WebElement> gender=driver.findElements(By.cssSelector("input[type='radio']"));
		gender.get(0).click();
		
		List<WebElement> hobby=driver.findElements(By.cssSelector("input[type='checkbox']"));
		hobby.get(0).click();
		hobby.get(1).click();
		
		WebElement post1=driver.findElement(By.id("post1"));
		post1.sendKeys("1234");
		
		WebElement address=driver.findElement(By.id("address"));
		address.sendKeys("서울시 종로구");
		
		WebElement intro=driver.findElement(By.id("intro"));
		intro.sendKeys("잘 부탁 드립니다.");
		
		//함수 check()만 실행해서 submit 되지 않아요.
		jsexe.executeScript("check()");
		
		//submit 버튼을 클릭하면 action 페이지로 이동합니다.
		WebElement sign=driver.findElement(By.cssSelector("button[class='signupbtn']"));
		//WebElement sign=driver.findElement(By.className("signupbtn"));
		sign.click();
		
		driver.close();
		}
	}

}
