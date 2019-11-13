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
		
		//getWindowHandle() : ���� �������� ���� �ĺ��ڸ� �����ɴϴ�.
		// getWindowHandle()�� webDriver�� ���� �����ϰ� �ִ� �������� �ڵ��� �����ɴϴ�. �� �ڵ��� �� �������� ���� �ĺ����Դϴ�.
		// ������ URL�� ��쿡�� �������� �� ������ �ٸ��ϴ�.
		
		//getWindowHandles()�� �� ����̹��� �����ϴ� ��� �������� ���� ��� �ڵ��� �����մϴ�.
		//�̵��� ��Ͽ� ������ ���� ������� �����˴ϴ�.
		
		String main=driver.getWindowHandle();
		for(String web:driver.getWindowHandles()) {
			if(!web.equals(main)) { 
				//�˾�â���� ��ȯ�մϴ�.
				driver.switchTo().window(web).close();
			}
				
		}
		//����â���� ��ȯ�մϴ�.
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
		address.sendKeys("����� ���α�");
		
		WebElement intro=driver.findElement(By.id("intro"));
		intro.sendKeys("�� ��Ź �帳�ϴ�.");
		
		//�Լ� check()�� �����ؼ� submit ���� �ʾƿ�.
		jsexe.executeScript("check()");
		
		//submit ��ư�� Ŭ���ϸ� action �������� �̵��մϴ�.
		WebElement sign=driver.findElement(By.cssSelector("button[class='signupbtn']"));
		//WebElement sign=driver.findElement(By.className("signupbtn"));
		sign.click();
		
		driver.close();
		}
	}

}
