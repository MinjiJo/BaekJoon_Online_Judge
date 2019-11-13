package selenium_test_1101;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example04_cssselector3 {

	public static void main(String[] args) {
		//ũ�ҵ���̹� ��ġ ���� - �ʼ��ڵ�
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumlib\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		//������ ù �ּ� �ۼ� - get() ����, close() ����
		driver.get("http://www.naver.com");
		
		//������ class�� ���� �� ���� �� �־� List�� �޴´�.
		//���̹� �α��� ��ư - anchor �±��� Ŭ���� �Ӽ�(class=lg_local_btn)
		
		List<WebElement> btns=driver.findElements(By.cssSelector("a[class='lg_local_btn']"));
				
		//�� ���� Ŭ���� �����ڰ� �ִ��� Ȯ��
		System.out.println(btns.size()); //1
		btns.get(0).click();

		//driver.close(); //������ â�� ���� �� ���� ���� �������ʹ� �ּ�ó��
	}

}
