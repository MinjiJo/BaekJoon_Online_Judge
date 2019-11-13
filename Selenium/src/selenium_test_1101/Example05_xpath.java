package selenium_test_1101;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example05_xpath {

	public static void main(String[] args) {
		//크롬드라이버 위치 지정 - 필수코드
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumlib\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		//브라우저 첫 주소 작성 - get() 시작, close() 닫음
		driver.get("http://www.naver.com");
				
		List<WebElement> btns=driver.findElements(By.xpath("//*[@id='account']/div/a/i"));
		
		// xpath 선택자
		// 1. // : 문서 내의 모든 위치
		// 2. * : 모든 엘리먼트
		// 3. [] : 조건에 해당하는 노드들을 선택
		// 4. @ : 속성을 선택하는 지시자
		// 5. [@id='account'] : 속성 중 id가 'account'인 것을 선택하라는 의미
		
		//예) <bookstore>
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
		
		// 1. 루트 엘리먼트 : <bookstore> ...</bookstore>
		// 2. 엘리먼트  : <book>...</book>, <author>....</author>
		// 3. 속성 : lang="en"
		
		//예1) //@lang : xml 문서 내에서 이름이 lang인 모든 속성을 선택함
		//예2) //title[@lang] : 문서 내의 모든 title 엘리먼트 중 이름이 lang인 속성을 포함한 것들을 선택
		//예3) /bookstore/book[price>35.00] : bookstore 엘리먼트의 자식 엘리먼트인 book 엘리먼트 중에서 자식 엘리먼트 price의 값이 35보다 큰 것들을 선택
		//예4) //* : 문서의 모든 엘리먼트를 선택


		//몇 개의 클래스 선택자가 있는지 확인
		System.out.println(btns.size()); //1
		//선택자가 한개라서 0번째 클릭
		btns.get(0).click();

		//driver.close(); //브라우저 창이 열린 뒤 닫혀 다음 예제부터는 주석처리
	}

}
