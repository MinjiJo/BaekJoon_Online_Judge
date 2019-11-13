package selenium_test_1101;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example02_findelement {

	public static void main(String[] args) {
		//크롬드라이버 위치 지정 - 필수코드
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumlib\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		//브라우저 첫 주소 작성 - get() 시작, close() 닫음
		driver.get("http://naver.com");
		
		//아이디로 찾는 경우 - findElement(By.id(아이디)) 메소드 사용
		//id="query" 찾는다
		WebElement inputSearch=driver.findElement(By.id("query"));
		System.out.println(inputSearch); //inputSearch 확인
		inputSearch.sendKeys("KH정보교육원"); //"KH정보교육원"을 보냅니다.
		
		WebElement search_btn=driver.findElement(By.id("search_btn"));
		//검색 버튼 클릭
		search_btn.click();

		//driver.close(); //브라우저 창이 열린 뒤 닫혀 다음 예제부터는 주석처리
	}

}
