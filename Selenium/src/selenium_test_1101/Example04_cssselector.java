package selenium_test_1101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example04_cssselector {

	public static void main(String[] args) {
		//ũ�ҵ���̹� ��ġ ���� - �ʼ��ڵ�
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumlib\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		//������ ù �ּ� �ۼ� - get() ����, close() ����
		driver.get("http://google.com");
		
		String se=".gLFyf.gsfi"; //Ŭ������ ���� ���� ��� �̿� ���� ǥ��
								 //cssSelector(se) �̿���
				
		//se="#tsf > div:nth-child(2) > div > div.RNNXgb > div> 
		WebElement btns=driver.findElement(By.cssSelector(se));
		btns.sendKeys("���ο�"); 
		btns.submit();
		
		//driver.close(); //������ â�� ���� �� ���� ���� �������ʹ� �ּ�ó��
	}

}
