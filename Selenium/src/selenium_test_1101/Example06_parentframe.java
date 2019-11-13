package selenium_test_1101;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example06_parentframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumlib\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://192.168.40.8:8088/Se_Web/ex1/Test6.html");
		
		//���� �ذ� - parentFrame�� iframe���� �����Ѵ�.
		//�Ʒ� ������ �ּ����� ó���ϸ�
		//Element info: {Using=id, value=memId} ���� �߻�
		//<iframe name="subIframe" src="loginInput.html" width="500" height="550" cd_frame_id_="91d3ba40f56c29ecb596f35d27023bb4"></iframe>
		
		driver.switchTo().frame("subIframe");
		
		WebElement id=driver.findElement(By.id("id"));
		WebElement ps=driver.findElement(By.id("password"));
		id.sendKeys("test");
		ps.sendKeys("test");
		
		//�α��� ��ư �����ϴ� ���
		//1. �ڹٽ�ũ��Ʈ �Լ� fnLogin() ����
		JavascriptExecutor exe=(JavascriptExecutor)driver;
		exe.executeScript("fnLogin()");
		
		//alert() ��ȭ���� Ȯ�� �����մϴ�.
		driver.switchTo().alert().accept();
		//�ٽ� �θ� ���������� ��ȯ
		driver.switchTo().parentFrame();
		WebElement p=driver.findElement(By.cssSelector("p"));
		//WebElement p=driver.findElement(By.tagName("p"));
		System.out.println(p.getText());
		//2. �α��� ��ư Ŭ��
		//WebElement button=driver.findElement(By.cssSelector("button"));
		//button.click();
	}

}
