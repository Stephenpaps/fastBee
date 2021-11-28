package ProjectFastBee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbOrdermanagement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Selenium Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://admin.fastbeefood.net/admin/ordermanagement");
		
		
		//Order Management Module
				WebElement Ordermanagement=driver.findElement(By.xpath("//a[normalize-space()='Order Management']"));
				Ordermanagement.click();
				
				WebElement Actionstoassign=driver.findElement(By.xpath("//*[@id=\'dropdownMenuButton\']"));
				Actionstoassign.click();
				
				WebElement RiderAssignment=driver.findElement(By.xpath("//*[@id=\'nosortingtables2\']/tbody/tr[1]/td[11]/div/ul/li[1]/a"));
				RiderAssignment.click();
				
				Thread.sleep(3000);
				WebElement Clickassign=driver.findElement(By.id("notlob"));
				Clickassign.click();
				
				Thread.sleep(3000);
				WebElement assigntojacktest=driver.findElement(By.xpath("//*[@id=\'riderslist\']/table/tbody/tr[4]/td[6]/button"));
				assigntojacktest.click();
				
						
				Thread.sleep(3000);
			
				WebElement closeassign = driver.findElement(By.xpath("//*[@id=\'ourriders\']/div/div/div[3]/button"));
				closeassign.click();
				
				
				
				
				WebElement Actionstoassign1=driver.findElement(By.xpath("//*[@id=\'dropdownMenuButton\']"));
				Actionstoassign1.click();
				
				WebElement Editdetails=driver.findElement(By.xpath("//*[@id=\'nosortingtables2\']/tbody/tr[1]/td[11]/div/ul/li[2]/a"));
				Editdetails.click();
				
				WebElement Statusoforder=driver.findElement(By.name("request_status"));
				Statusoforder.click();
				Select select9=new Select(Statusoforder);
				select9.selectByVisibleText("Delivered");
				
				WebElement Updatebtn1=driver.findElement(By.xpath("/html/body/section/div/section/div/div[3]/div/div/div/section/div/div[1]/div[2]/span/form/button"));
				Updatebtn1.click();
				
				WebElement Paidby=driver.findElement(By.name("request_pay_type"));
				Paidby.click();
				Select select10=new Select(Paidby);
				select10.selectByVisibleText("Debit Card");
				
				WebElement Updatebtn2=driver.findElement(By.xpath("/html/body/section/div/section/div/div[3]/div/div/div/section/div/div[1]/div[3]/span/form/button"));
				Updatebtn2.click();
	}

}
