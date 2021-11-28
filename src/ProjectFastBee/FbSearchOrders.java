package ProjectFastBee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSearchOrders {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Selenium Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://admin.fastbeefood.net/admin/searchorders");
		
		
		//Searchorders		
				WebElement Searchorders=driver.findElement(By.linkText("Search Orders"));
				Searchorders.click();
				Thread.sleep(3000);
				
				WebElement Orderid=driver.findElement(By.id("orderid"));
				Orderid.sendKeys("FASTBEE072");
				Thread.sleep(3000);
				WebElement Searchrest=driver.findElement(By.xpath("//*[@id=\'restaurant_id\']"));
				Searchrest.click();
				Select select11=new Select(Searchrest);
				select11.selectByVisibleText("Juicy");
				Thread.sleep(3000);
				
				WebElement startdate=driver.findElement(By.id("datesfrom"));
				startdate.clear();
				Thread.sleep(3000);
				startdate.sendKeys("17th Nov 2021");
				
				
				Thread.sleep(3000);
				WebElement Enddate01=driver.findElement(By.id("datesto"));
				Enddate01.clear();
				Thread.sleep(3000);
				Enddate01.sendKeys("23rd Nov 2021");
				
				WebElement submitbtn=driver.findElement(By.xpath("//*[@id=\'form_validation\']/div/div[7]/button"));
				submitbtn.click();
	}

}
