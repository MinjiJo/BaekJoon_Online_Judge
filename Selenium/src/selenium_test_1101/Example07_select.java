package selenium_test_1101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example07_select {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumlib\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://192.168.40.8:8088/Se_Web/ex_select/Test_Select.html");
		
		//	<select class="form-control" id="age" name="age">
		//		<option value="">����</option>
		//		<option value="1">10��</option>
		//		<option value="2">20��</option>
		//		<option value="3">30��</option>
		//		<option value="4">40��</option>
		//		<option value="5">50��</option>
		//	</select>
		
		Select inputAge=new Select(driver.findElement(By.id("age")));
		//ID�� �̿��� ������ ȭ�鿡 ���̴� ���� �̿��� "20��"�� �����ϼ���.
		//inputAge.selectByVisibleText("20��");
		
		//index��ȣ�� 3��° �׸��� ����
		//inputAge.selectByIndex(3);
		
		//value �Ӽ� ������ ����
		inputAge.selectByValue("5");
	}

}
