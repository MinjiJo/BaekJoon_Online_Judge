package selenium_test_1101;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example06_iframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumlib\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://192.168.40.8:8088/Se_Web/ex1/Test5.html");
		
		//���� �ذ� - parentFrame�� iframe���� �����Ѵ�.
		//�Ʒ� ������ �ּ����� ó���ϸ�
		//Element info: {Using=id, value=memId} ���� �߻�
		//<iframe name="subIframe" src="loginInput.html" width="500" height="550" cd_frame_id_="91d3ba40f56c29ecb596f35d27023bb4"></iframe>
		
		driver.switchTo().frame("subIframe");
		
		WebElement id=driver.findElement(By.id("id"));
		WebElement ps=driver.findElement(By.id("password"));
		id.sendKeys("test2");
		ps.sendKeys("test");
		
		//�α��� ��ư �����ϴ� ���
		//1. �ڹٽ�ũ��Ʈ �Լ� fnLogin() ����
		JavascriptExecutor exe=(JavascriptExecutor)driver;
		exe.executeScript("fnLogin()");
		
		//2. �α��� ��ư Ŭ��
		//WebElement button=driver.findElement(By.cssSelector("button"));
		//button.click();
	}

}
