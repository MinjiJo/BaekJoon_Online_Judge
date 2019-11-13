package selenium_test_1104;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//�������� �񵿱�� �۵��ؼ� �Ź� ���� ����� �ٸ��ϴ�.
// 1. ����� �ð� ���� : � ������Ʈ ��Ÿ�� ������ ��ٷ���
//		Ư�� Element�� ��Ÿ�� ������ ��ٷ��ִ� ����� Explicitly Wait�� ����� �� �ֽ��ϴ�.
//		��) WebDriverWait wait=new WebDriverWait(driver, 10); //10�ʱ��� ��ٸ��ϴ�.
//			wait.until(ExpectedConditions.titleContains("D-CLASS �Ʒû�");
// 2. ������ �ð� ���� : �����ڰ� �� �����Ⱓ ��ٷ���
//		��)driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		 	driver.get("http://~");
public class Example02_wait {

	public static void main(String[] args) {
		//ũ�� ����̹��� ��ġ�� ��� �� ����̹� ���� ��ġ�� �����ؾ� �Ѵ�. - �ʼ���
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumlib\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//Ÿ�� ����Ʈ �ּ� ����
		driver.get("http://192.168.40.8:8088/Se_Web/board/login.html");
		
		WebElement id=driver.findElement(By.id("id"));
		WebElement pass=driver.findElement(By.id("pwd"));
		//xpath("//button");
		WebElement button=driver.findElement(By.cssSelector("button"));
		
		id.sendKeys("ȫ�浿");
		pass.sendKeys("12345");
		button.click();
		
		//�� ���������� �ִ� ��� �ð��� 10�ʷ� �����մϴ�.
		//Ư�� Element�� ��Ÿ�� ������ ��ٷ��ִ� ����� Explicitly Wait�� ����� �� �ֽ��ϴ�.
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		//alertâ�� �㶧����
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		//���� �� ������ ������ "�Խ���"�� ǥ�õ� ������ ���α׷��� ���, ����� ���
		wait.until(ExpectedConditions.titleContains("�Խ���"));
		//�̰� ���� 
		//tried for 10 second(s) with 500 milliseconds interval
		//wait.until(ExpectedConditions.titleContains("�Խ���2"));
		
		//�۾��� Form�� �۾��� Ŭ�� ������ �������� ���α׷��� ���
		wait.until(ExpectedConditions.elementToBeClickable(By.id("board_name")));
		WebElement name=driver.findElement(By.id("board_name"));
		name.sendKeys("��ȣ��");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("board_pass")));
		WebElement password=driver.findElement(By.id("board_pass"));
		password.sendKeys("1234");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("board_subject")));
		WebElement subject=driver.findElement(By.id("board_subject"));
		subject.sendKeys("�ȳ��ϼ���");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("board_content")));
		WebElement content=driver.findElement(By.id("board_content"));
		content.sendKeys("�ߺ�Ź�帳�ϴ�");
		
		WebElement submit=driver.findElement(By.cssSelector("button[type='submit']"));
		submit.click();
		//�ۼ��� ���������� �Ǿ��ٴ� alert�� �߸� Ȯ�� ��ư�� ��������.
		driver.switchTo().alert().accept();
	}
}
