package selenium_test_1104;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/*
1. http://192.168.40.8:8088/Se_Web/board2/loginInput.html 접속
2. 아이디와 비밀번호는 test/test 입력
3. 로그인 onClick 이벤트의 fnLogin()함수 호출
4. 페이지 이동 후 "D_CLASS 훈련생도 평가" 제목이 표시될 때까지 명시적 대기
5. 자바스크립트 코드를 이용해서 게시판 페이지로 이동
6. "D_CLASS 우리반 게시판" 제목이 표시될 때까지 명시적 대기
7. 게시판글쓰기시작 버튼의 클릭 시 수행할 함수 실행하기(버튼 클릭하지 않음)
8. "글제목 - 안녕하세요? 이순신 인사드립니다^^"
9. "글내용 - iframe으로 되어진 곳에 글내용을 적어봅니다.ㅎㅎㅎ"
10. 작성완료버튼 클릭시 실행할 함수 실행하기
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
		wait.until(ExpectedConditions.titleContains("D-CLASS 훈련생도 평가"));
		java.executeScript("javascript:location.href='currBoard.html'");
		wait.until(ExpectedConditions.titleContains("D-CLASS 우리반 게시판"));
		java.executeScript("fnWriteForm()");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("title")));
		WebElement title=driver.findElement(By.id("title"));
		title.sendKeys("안녕하세요? 이순신 인사드립니다^^");
		driver.switchTo().frame("iframeMsg");
		WebElement areaMsg=driver.findElement(By.id("areaMsg"));
		areaMsg.sendKeys("iframe으로 되어진 곳에 글내용을 적어봅니다.ㅎㅎㅎ");
		driver.switchTo().parentFrame();
		java.executeScript("javascript:fnRegister()");
		driver.switchTo().alert().accept();



		
	}
}
