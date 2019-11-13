package selenium_test_1101;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example05_xpath2 {

	public static void main(String[] args) {
		//ũ�ҵ���̹� ��ġ ���� - �ʼ��ڵ�
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumlib\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		//������ ù �ּ� �ۼ� - get() ����, close() ����
		driver.get("http://www.naver.com");
				
		List<WebElement> btns=driver.findElements(By.xpath("//*[@id='account']/div/a/i"));
		btns.get(0).click();
		WebElement id=driver.findElement(By.id("id"));
		WebElement ps=driver.findElement(By.id("pw"));
		List<WebElement> login=driver.findElements(By.cssSelector(".btn_global"));
	
		//�� ���� Ŭ���� �����ڰ� �ִ��� Ȯ��
		System.out.println(btns.size()); //1
		//�����ڰ� �Ѱ��� 0��° Ŭ��
		
		  id.sendKeys(""); 
		  ps.sendKeys(""); 
		  login.get(0).click();
		 
		
		//driver.close(); //������ â�� ���� �� ���� ���� �������ʹ� �ּ�ó��
	}

}
