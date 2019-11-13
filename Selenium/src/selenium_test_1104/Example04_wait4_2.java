package selenium_test_1104;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/*
1. http://192.168.40.8:8088/Se_Web/board2/loginInput.html ����
2. ���̵�� ��й�ȣ�� test/test �Է�
3. �α��� onClick �̺�Ʈ�� fnLogin()�Լ� ȣ��
4. ������ �̵� �� "D_CLASS �Ʒû��� ��" ������ ǥ�õ� ������ ����� ���
5. �ڹٽ�ũ��Ʈ �ڵ带 �̿��ؼ� �Խ��� �������� �̵�
6. "D_CLASS �츮�� �Խ���" ������ ǥ�õ� ������ ����� ���
7. �Խ��Ǳ۾������ ��ư�� Ŭ�� �� ������ �Լ� �����ϱ�(��ư Ŭ������ ����)
8. "������ - �ȳ��ϼ���? �̼��� �λ�帳�ϴ�^^"
9. "�۳��� - iframe���� �Ǿ��� ���� �۳����� ����ϴ�.������"
10. �ۼ��Ϸ��ư Ŭ���� ������ �Լ� �����ϱ�
*/
public class Example04_wait4_2 {

	public static void main(String[] args) {	
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumlib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.40.8:8088/Se_Web/board2/loginInput.html");
		WebElement id=driver.findElement(By.id("id"));
		WebElement password=driver.findElement(By.id("password"));
		id.sendKeys("test");
		password.sendKeys("test");
		JavascriptExecutor java=(JavascriptExecutor)driver;
		java.executeScript("fnLogin()");
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("D-CLASS �Ʒû��� ��"));
		java.executeScript("javascript:location.href='currBoard.html'");
		wait.until(ExpectedConditions.titleContains("D-CLASS �츮�� �Խ���"));
		java.executeScript("fnWriteForm()");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("title")));
		WebElement title=driver.findElement(By.id("title"));
		title.sendKeys("�ȳ��ϼ���? �̼��� �λ�帳�ϴ�^^");
		driver.switchTo().frame("iframeMsg");
		WebElement areaMsg=driver.findElement(By.id("areaMsg"));
		areaMsg.sendKeys("iframe���� �Ǿ��� ���� �۳����� ����ϴ�.������");
		driver.switchTo().parentFrame();
		java.executeScript("javascript:fnRegister()");
		driver.switchTo().alert().accept();



		
	}
}
