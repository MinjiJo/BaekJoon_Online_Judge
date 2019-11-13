package selenium_test_1104;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Example03_wait_implicitly {

	public static void main(String[] args) {
		//ũ�� ����̹��� ��ġ�� ��� �� ����̹� ���� ��ġ�� �����ؾ� �Ѵ�. - �ʼ���
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumlib\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//�Ͻ��� ��� - �� ����̹��� ���ܸ� throw�ϱ� ���� �ش� �ð� ���� ��ٸ��ϴ�.
		//�Ʒ� ������ �ּ����� ó���ϸ� �ٷ� ������ ȭ�鿡 ��Ÿ���ϴ�.
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://192.168.40.8:8088/Se_Web/board2/loginInput.html");
		WebElement id=driver.findElement(By.id("id2"));
		WebElement pass=driver.findElement(By.id("password"));
		
		id.sendKeys("Q1234");
		pass.sendKeys("1234");
	}
}
