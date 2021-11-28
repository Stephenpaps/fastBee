package ProjectFastBee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbRidersonmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://admin.fastbeefood.net/admin/ridersonmap");
		
		
		
		//Riders on Map
		WebElement Ridersonmap=driver.findElement(By.xpath("//a[normalize-space()='Riders on Map']"));
		Ridersonmap.click();

	}

}
