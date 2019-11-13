package selenium_test_1104;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//셀레늄은 비동기로 작동해서 매번 실행 결과가 다릅니다.
// 1. 명시적 시간 지정 : 어떤 엘리먼트 나타날 때까지 기다려라
//		특정 Element가 나타날 때까지 기다려주는 방식인 Explicitly Wait을 사용할 수 있습니다.
//		예) WebDriverWait wait=new WebDriverWait(driver, 10); //10초까지 기다립니다.
//			wait.until(ExpectedConditions.titleContains("D-CLASS 훈련생");
// 2. 묵시적 시간 지정 : 개발자가 준 일정기간 기다려라
//		예)driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		 	driver.get("http://~");
public class Example02_wait {

	public static void main(String[] args) {
		//크롬 드라이버가 위치한 경로 및 드라이버 파일 위치를 지정해야 한다. - 필수임
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumlib\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//타겟 사이트 주소 지정
		driver.get("http://192.168.40.8:8088/Se_Web/board/login.html");
		
		WebElement id=driver.findElement(By.id("id"));
		WebElement pass=driver.findElement(By.id("pwd"));
		//xpath("//button");
		WebElement button=driver.findElement(By.cssSelector("button"));
		
		id.sendKeys("홍길동");
		pass.sendKeys("12345");
		button.click();
		
		//웹 페이지에서 최대 대기 시간을 10초로 설정합니다.
		//특정 Element가 나타날 때까지 기다려주는 방식인 Explicitly Wait을 사용할 수 있습니다.
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		//alert창이 뜰때까지
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		//실행 후 페이지 제목이 "게시판"이 표시될 때까지 프로그램을 대기, 명시적 대기
		wait.until(ExpectedConditions.titleContains("게시판"));
		//이건 오류 
		//tried for 10 second(s) with 500 milliseconds interval
		//wait.until(ExpectedConditions.titleContains("게시판2"));
		
		//글쓰기 Form의 글쓴이 클릭 가능한 시점까지 프로그램을 대기
		wait.until(ExpectedConditions.elementToBeClickable(By.id("board_name")));
		WebElement name=driver.findElement(By.id("board_name"));
		name.sendKeys("김호엥");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("board_pass")));
		WebElement password=driver.findElement(By.id("board_pass"));
		password.sendKeys("1234");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("board_subject")));
		WebElement subject=driver.findElement(By.id("board_subject"));
		subject.sendKeys("안녕하세요");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("board_content")));
		WebElement content=driver.findElement(By.id("board_content"));
		content.sendKeys("잘부탁드립니다");
		
		WebElement submit=driver.findElement(By.cssSelector("button[type='submit']"));
		submit.click();
		//작성이 성공적으로 되었다는 alert이 뜨면 확인 버튼을 누르세요.
		driver.switchTo().alert().accept();
	}
}
