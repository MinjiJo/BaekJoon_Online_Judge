package selenium_test_1104;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumlib\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();	
		driver.get("http://192.168.40.8:8088/Se_Web/ex3/NewFile5.html");
		JavascriptExecutor jsexe=(JavascriptExecutor)driver;
		
		WebElement id=driver.findElement(By.id("id"));
		WebElement idbutton=driver.findElement(By.xpath("html/body/div/form/div/fieldset/input[2]"));
		WebElement pass=driver.findElement(By.id("pass"));
		WebElement jumin1=driver.findElement(By.id("jumin1"));
		WebElement jumin2=driver.findElement(By.id("jumin2"));
		WebElement email=driver.findElement(By.id("email"));
		Select sel=new Select(driver.findElement(By.id("sel")));
		//List<WebElement> gender=driver.findElements(By.cssSelector("input[type='radio']"));
		List<WebElement> hobby=driver.findElements(By.cssSelector("input[type='checkbox']"));
		WebElement post1=driver.findElement(By.id("post1"));
		WebElement address=driver.findElement(By.id("address"));
		WebElement intro=driver.findElement(By.id("intro"));
		WebElement sign=driver.findElement(By.cssSelector("button[class='signupbtn']"));
		WebElement cancel=driver.findElement(By.cssSelector("button[class='cancelbtn']"));
		
		List<Member> list=new ArrayList<Member>();
		list.add(new Member("Q1234", "1234", "860407", "1348752", "Q1234", "naver.com", 
							"12", "13248","서울시 종로구", "안녕"));
		list.add(new Member("S45598", "1234", "501104", "2648518", "S45598", "daum.net", 
							"13", "50184","경기도 구리시", "안녕하세요"));
		list.add(new Member("Kwefes", "1234", "020807", "4513254", "Kwefes", "naver.com", 
							"145", "20184","세종시", "Hello~"));
		String main=driver.getWindowHandle();
		for(int i=0; i<list.size(); i++) {			
		if(i==list.size()-1) {
			id.sendKeys(list.get(i).getId());
			jsexe.executeScript("idcheck()");
			idbutton.click();
			
			for(String web:driver.getWindowHandles()) {
				
				if(!web.equals(main)) { 
					driver.switchTo().window(web).close();
				}
			}
			driver.switchTo().window(main);	

			pass.sendKeys(list.get(i).getPass());
			jumin1.sendKeys(list.get(i).getJumin1());
			jumin2.sendKeys(list.get(i).getJumin2());
			email.sendKeys(list.get(i).getEmail());
			sel.selectByIndex(1);
		
			for(int j=0; j<list.get(i).getHobby().length(); j++) {
				int count=Integer.valueOf(list.get(i).getHobby().substring(j,j+1));
				hobby.get(count-1).click();
			}
			post1.sendKeys(list.get(i).getPost());
			address.sendKeys(list.get(i).getAddress());
			intro.sendKeys(list.get(i).getContent());
			jsexe.executeScript("check()");
		} else {
			id.sendKeys(list.get(i).getId());
			jsexe.executeScript("idcheck()");
			idbutton.click();
			for(String web:driver.getWindowHandles()) {
				if(!web.equals(main)) { 
					driver.switchTo().window(web).close();
				}
			}
			driver.switchTo().window(main);	

			pass.sendKeys(list.get(i).getPass());
			jumin1.sendKeys(list.get(i).getJumin1());
			jumin2.sendKeys(list.get(i).getJumin2());
			email.sendKeys(list.get(i).getEmail());
			sel.selectByIndex(1);
			for(int j=0; j<list.get(i).getHobby().length(); j++) {
				int count=Integer.valueOf(list.get(i).getHobby().substring(j,j+1));
				hobby.get(count-1).click();
			}
			post1.sendKeys(list.get(i).getPost());
			address.sendKeys(list.get(i).getAddress());
			intro.sendKeys(list.get(i).getContent());
			jsexe.executeScript("check()");
			cancel.click();
		}
			}
		sign.click();
		}
}
