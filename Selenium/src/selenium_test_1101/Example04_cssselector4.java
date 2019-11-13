package selenium_test_1101;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example04_cssselector4 {

	public static void main(String[] args) {
		//ũ�ҵ���̹� ��ġ ���� - �ʼ��ڵ�
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumlib\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		//������ ù �ּ� �ۼ� - get() ����, close() ����
		driver.get("http://www.naver.com");
		
		//������ class�� ���� �� ���� �� �־� List�� �޴´�.
		//���̹� �α��� ��ư - anchor �±��� Ŭ���� �Ӽ�(class=lg_local_btn)
		
		//F12-> Elements��-> inspector -> �α��� Ŭ��
		// -> anchor �±׿��� ���콺 ������ ��ư Ŭ��
		// -> Copy -> Copy Selector -> �ٿ��ֱ�
		List<WebElement> btns=driver.findElements(By.cssSelector("#account > div > a"));
		
		//�� ���� Ŭ���� �����ڰ� �ִ��� Ȯ��
		System.out.println(btns.size()); //1
		//�����ڰ� �Ѱ��� 0��° Ŭ��
		btns.get(0).click();

		//driver.close(); //������ â�� ���� �� ���� ���� �������ʹ� �ּ�ó��
	}

}
