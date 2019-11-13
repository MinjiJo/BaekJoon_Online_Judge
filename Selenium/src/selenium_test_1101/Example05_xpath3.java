package selenium_test_1101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example05_xpath3 {

	public static void main(String[] args) {
		//ũ�ҵ���̹� ��ġ ���� - �ʼ��ڵ�
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumlib\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		//������ ù �ּ� �ۼ� - get() ����, close() ����
		driver.get("http://iei.or.kr");
				
		WebElement btns=driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/a"));
		btns.click();
		WebElement id=driver.findElement(By.id("id"));
		WebElement ps=driver.findElement(By.id("password"));
		id.sendKeys("moonwc"); 
		ps.sendKeys(""); //���� ��� ������ �� 
		WebElement login=driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[3]/div/div/div[2]/a"));  
		login.click();
		 
		
		//driver.close(); //������ â�� ���� �� ���� ���� �������ʹ� �ּ�ó��
	}

}
