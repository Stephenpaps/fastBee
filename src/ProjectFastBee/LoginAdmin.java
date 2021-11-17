package ProjectFastBee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LoginAdmin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin.fastbeefood.net/admin/editrestaurant/45");
		
		WebElement userName =driver.findElement(By.id("login_username"));
		userName.sendKeys("praveen@fastbee.net");
		
		WebElement passWord = driver.findElement(By.id("login_pass"));
		passWord.sendKeys("12345");
		
		WebElement submit = driver.findElement(By.xpath("//*[@id=\'form_admin_sign_in\']/div[3]/button"));
		submit.click();
		
		driver.get("https://admin.fastbeefood.net/admin/dashboard");
		
		WebElement GCWgraphtoday = driver.findElement(By.xpath("//*[@id=\'growthcanvas\']/select[1]"));
		GCWgraphtoday.click();
		
		Select select3=new Select(GCWgraphtoday);
		select3.selectByValue("monthly");
		
		WebElement Resttoday = driver.findElement(By.name("restaurant_id"));
		Resttoday.click();
		Select select4 = new Select(Resttoday);
		select4.selectByValue("40");
		
		WebElement entryperpageToday = driver.findElement(By.xpath("//*[@id=\'nosortingtables2_length\']/label/select"));
		entryperpageToday.click();
		
		Select select5 =new Select(entryperpageToday);
		select5.selectByVisibleText("50");
		
				
		/*WebElement yesterdayBtn = driver.findElement(By.xpath("//a[normalize-space()='Yesterday']"));
		yesterdayBtn.click();
		driver.get("https://admin.fastbeefood.net/admin/dashboard/yesterday");
		Thread.sleep(3000);
		WebElement GCdropdown = driver.findElement(By.name("charttype"));
		GCdropdown.click();
		
		Thread.sleep(3000);
		Select select = new Select(GCdropdown);
		select.selectByVisibleText("Daily");
		
		Thread.sleep(3000);
		WebElement Restdropdown = driver.findElement(By.name("restaurant_id"));
		Restdropdown.click();
		Thread.sleep(3000);
		Select select1 =new Select(Restdropdown);
		select1.selectByVisibleText("Hardees");
		
		WebElement Entriesperpage= driver.findElement(By.name("nosortingtables_length"));
		Entriesperpage.click();
		
		Select select2 = new Select(Entriesperpage);
		select2.selectByVisibleText("25");*/ 
		
		WebElement Accounts=driver.findElement(By.xpath("//span[normalize-space()='Accounts']"));
		Actions actions = new Actions(driver);
		
		actions.moveToElement(Accounts);
		
		WebElement Invoices= driver.findElement(By.xpath("//span[normalize-space()='Accounts']//following::li[2]"));
		actions.moveToElement(Invoices);
		
		actions.click().build().perform();
		
		/*WebElement Startdate=driver.findElement(By.id("datesfrom"));
		Startdate.sendKeys();
		
		WebElement Enddate =driver.findElement(By.id("datesto"));
		Enddate.sendKeys();*/
		
		WebElement Restaurantsselect=driver.findElement(By.id("restaurant_id"));
		Select select =new Select(Restaurantsselect);
		select.selectByVisibleText("Sapphire");
		
		WebElement GenerateBtn= driver.findElement(By.xpath("//button[normalize-space()='GENERATE REPORT']"));
		GenerateBtn.click();
		
		WebElement entryperpage2= driver.findElement(By.xpath("//*[@id=\'nosortingtables_invoices_length\']/label/select"));
		entryperpage2.click();
		
		Select select6 = new Select(entryperpage2);
		select6.selectByVisibleText("100");
		
		WebElement search1= driver.findElement(By.xpath("//*[@id=\'nosortingtables_invoices_filter\']/label/input"));
		search1.sendKeys("Goindha");
		
		
		
		
		
		
		
		

	}

}
