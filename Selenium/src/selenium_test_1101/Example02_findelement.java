package selenium_test_1101;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example02_findelement {

	public static void main(String[] args) {
		//ũ�ҵ���̹� ��ġ ���� - �ʼ��ڵ�
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumlib\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		//������ ù �ּ� �ۼ� - get() ����, close() ����
		driver.get("http://naver.com");
		
		//���̵�� ã�� ��� - findElement(By.id(���̵�)) �޼ҵ� ���
		//id="query" ã�´�
		WebElement inputSearch=driver.findElement(By.id("query"));
		System.out.println(inputSearch); //inputSearch Ȯ��
		inputSearch.sendKeys("KH����������"); //"KH����������"�� �����ϴ�.
		
		WebElement search_btn=driver.findElement(By.id("search_btn"));
		//�˻� ��ư Ŭ��
		search_btn.click();

		//driver.close(); //������ â�� ���� �� ���� ���� �������ʹ� �ּ�ó��
	}

}
