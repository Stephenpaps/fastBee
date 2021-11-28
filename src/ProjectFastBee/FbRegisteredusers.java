package ProjectFastBee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbRegisteredusers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Selenium Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://admin.fastbeefood.net/admin/manageclients");
		
		
		//Registeredusers
				WebElement Registeredusers=driver.findElement(By.xpath("//*[@id=\'leftsidebar\']/div/div/div/div/ul/li[5]/a"));
				Registeredusers.click();
				
				Thread.sleep(3000);
				WebElement Thisyear=driver.findElement(By.xpath("//a[normalize-space()='This Year']"));
				Thisyear.click();
				
				Thread.sleep(3000);
				WebElement search01=driver.findElement(By.xpath("//*[@id=\'nosortingtables_filter\']/label/input"));
				search01.sendKeys("Test");
				
				Thread.sleep(3000);
				WebElement thismonth=driver.findElement(By.xpath("//a[normalize-space()='This Month']"));
				thismonth.click();
				
		
	}

}
