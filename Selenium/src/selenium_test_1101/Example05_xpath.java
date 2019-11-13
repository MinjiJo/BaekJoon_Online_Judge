package selenium_test_1101;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example05_xpath {

	public static void main(String[] args) {
		//ũ�ҵ���̹� ��ġ ���� - �ʼ��ڵ�
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumlib\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		//������ ù �ּ� �ۼ� - get() ����, close() ����
		driver.get("http://www.naver.com");
				
		List<WebElement> btns=driver.findElements(By.xpath("//*[@id='account']/div/a/i"));
		
		// xpath ������
		// 1. // : ���� ���� ��� ��ġ
		// 2. * : ��� ������Ʈ
		// 3. [] : ���ǿ� �ش��ϴ� ������ ����
		// 4. @ : �Ӽ��� �����ϴ� ������
		// 5. [@id='account'] : �Ӽ� �� id�� 'account'�� ���� �����϶�� �ǹ�
		
		//��) <bookstore>
		//		<book>
		//			<title lang="en">Harry Potter</title>
		//			<author>J.K.Rowling</author>
		//			<year>2005</year>
		//			<price>29.99</price>
		//		</book>
		//		<book>
		//			<title lang="en">Learning XML</title>
		//			<price>39.95</price>
		//		</book>
		//	</bookstore>
		
		// 1. ��Ʈ ������Ʈ : <bookstore> ...</bookstore>
		// 2. ������Ʈ  : <book>...</book>, <author>....</author>
		// 3. �Ӽ� : lang="en"
		
		//��1) //@lang : xml ���� ������ �̸��� lang�� ��� �Ӽ��� ������
		//��2) //title[@lang] : ���� ���� ��� title ������Ʈ �� �̸��� lang�� �Ӽ��� ������ �͵��� ����
		//��3) /bookstore/book[price>35.00] : bookstore ������Ʈ�� �ڽ� ������Ʈ�� book ������Ʈ �߿��� �ڽ� ������Ʈ price�� ���� 35���� ū �͵��� ����
		//��4) //* : ������ ��� ������Ʈ�� ����


		//�� ���� Ŭ���� �����ڰ� �ִ��� Ȯ��
		System.out.println(btns.size()); //1
		//�����ڰ� �Ѱ��� 0��° Ŭ��
		btns.get(0).click();

		//driver.close(); //������ â�� ���� �� ���� ���� �������ʹ� �ּ�ó��
	}

}
