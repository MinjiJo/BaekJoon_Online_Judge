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
		//		<option value="">선택</option>
		//		<option value="1">10대</option>
		//		<option value="2">20대</option>
		//		<option value="3">30대</option>
		//		<option value="4">40대</option>
		//		<option value="5">50대</option>
		//	</select>
		
		Select inputAge=new Select(driver.findElement(By.id("age")));
		//ID를 이용해 페이지 화면에 보이는 값을 이용해 "20대"를 선택하세요.
		//inputAge.selectByVisibleText("20대");
		
		//index번호로 3번째 항목을 선택
		//inputAge.selectByIndex(3);
		
		//value 속성 값으로 선택
		inputAge.selectByValue("5");
	}

}
