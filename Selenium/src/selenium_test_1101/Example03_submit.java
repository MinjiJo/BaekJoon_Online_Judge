package selenium_test_1101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example03_submit {

	public static void main(String[] args) {
		//ũ�ҵ���̹� ��ġ ���� - �ʼ��ڵ�
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumlib\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		//������ ù �ּ� �ۼ� - get() ����, close() ����
		driver.get("http://google.com");
		
		//�α����� anchor �±� Ŭ���� �Ӽ��� ã�ƺ��ϴ�.
		WebElement btns=driver.findElement(By.className("gLFyf"));
		btns.sendKeys("KH����������");
		
		//submit() : form�� �˾Ƽ� ã�� �� submit�� �մϴ�.
		btns.submit();
		
		//driver.close(); //������ â�� ���� �� ���� ���� �������ʹ� �ּ�ó��
	}

}
