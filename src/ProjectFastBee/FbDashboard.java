package ProjectFastBee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbDashboard {

	public static void Dashboard() {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://admin.fastbeefood.net/admin/dashboard");
		
		//Today dashboard graph
				WebElement GCWgraphtoday = driver.findElement(By.xpath("//*[@id=\'growthcanvas\']/select[1]"));
				GCWgraphtoday.click();
				Select select3=new Select(GCWgraphtoday);
				select3.selectByValue("monthly");
				
				WebElement Resttoday = driver.findElement(By.name("restaurant_id"));
				Resttoday.click();
				Select select4 = new Select(Resttoday);
				select4.selectByVisibleText("Juicy");
				
				WebElement entryperpageToday = driver.findElement(By.xpath("//*[@id=\'nosortingtables2_length\']/label/select"));
				entryperpageToday.click();
				
				//Today dashboard Report
				Select select5 =new Select(entryperpageToday);
				select5.selectByVisibleText("50");
				
				driver.get("https://admin.fastbeefood.net/admin/dashboard/yesterday");	
				WebElement yesterdayBtn = driver.findElement(By.xpath("//a[normalize-space()='Yesterday']"));
				yesterdayBtn.click();
				
				
				WebElement GCdropdown = driver.findElement(By.name("charttype"));
				GCdropdown.click();
				
				
				Select select = new Select(GCdropdown);
				select.selectByVisibleText("Daily");
				
				
				WebElement Restdropdown = driver.findElement(By.name("restaurant_id"));
				Restdropdown.click();
				
				Select select1 =new Select(Restdropdown);
				select1.selectByVisibleText("Juicy");
				
				WebElement Entriesperpage= driver.findElement(By.name("nosortingtables_length"));
				Entriesperpage.click();
				
				Select select2 = new Select(Entriesperpage);
				select2.selectByVisibleText("25");
				
				

	}

}
