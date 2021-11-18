package ProjectFastBee;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
		driver.get("https://admin.fastbeefood.net/admin");
		
		//Login page
		WebElement userName =driver.findElement(By.id("login_username"));
		userName.sendKeys("praveen@fastbee.net");
		
		WebElement passWord = driver.findElement(By.id("login_pass"));
		passWord.sendKeys("12345");
		
		WebElement submit = driver.findElement(By.xpath("//*[@id=\'form_admin_sign_in\']/div[3]/button"));
		submit.click();
		
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
		
		//Accounts (Invoice)
		WebElement Accounts=driver.findElement(By.xpath("//span[normalize-space()='Accounts']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(Accounts);
		
		WebElement Invoices= driver.findElement(By.xpath("//span[normalize-space()='Accounts']//following::li[2]"));
		actions.moveToElement(Invoices);
		actions.click().build().perform();
		
		WebElement Startdate=driver.findElement(By.id("datesfrom"));
		Startdate.clear();
		Startdate.sendKeys("16th Nov 2021");
		
		WebElement Enddate =driver.findElement(By.id("datesto"));
		Enddate.clear();
		Enddate.sendKeys("18th Nov 2021");
		
		WebElement Restaurantsselect=driver.findElement(By.id("restaurant_id"));
		Select select7 =new Select(Restaurantsselect);
		select7.selectByVisibleText("Juicy");
		
		WebElement GenerateBtn= driver.findElement(By.xpath("//button[normalize-space()='GENERATE REPORT']"));
		GenerateBtn.click();
		
		WebElement entryperpage2= driver.findElement(By.xpath("//*[@id=\'nosortingtables_invoices_length\']/label/select"));
		entryperpage2.click();
		Select select6 = new Select(entryperpage2);
		select6.selectByVisibleText("100");
		
		WebElement search1= driver.findElement(By.xpath("//*[@id=\'nosortingtables_invoices_filter\']/label/input"));
		search1.sendKeys("Goindha");
		
		//WebElement downloadInvoice= driver.findElement(By.xpath("/html/body/section/div/section/div/div[1]/div/div/div/div/div[2]/button"));
		//downloadInvoice.click();
			
	   
	    
        Thread.sleep(3000);
		//Accounts (Sales)
		WebElement Accounts1=driver.findElement(By.xpath("//span[normalize-space()='Accounts']"));
	  

		Actions actions1 = new Actions(driver);
		actions1.moveToElement(Accounts1);
		
		WebElement Sales= driver.findElement(By.xpath("//span[normalize-space()='Accounts']//following::li[1]"));
		actions1.moveToElement(Sales);
		actions1.click().build().perform();
		
		WebElement Startdate1= driver.findElement(By.xpath("//*[@id=\'datesfrom\']"));
		Startdate1.clear();
		Startdate1.sendKeys("16th Nov 2021");
		
		WebElement Enddate1 = driver.findElement(By.id("datesto"));
		Enddate1.clear();
		Enddate1.sendKeys("18th Nov 2021");
		
		WebElement Restaurantselection= driver.findElement(By.xpath("//*[@id=\'restaurant_id\']"));
		Restaurantselection.click();
		Select select8=new Select(Restaurantselection);
		select8.selectByVisibleText("Juicy");
		
		WebElement SalesReport= driver.findElement(By.xpath("//*[@id=\'form_validation\']/div/div[4]/button"));
		SalesReport.click();
		
		
		
		
		//Order Management Module
		WebElement Ordermanagement=driver.findElement(By.xpath("//a[normalize-space()='Order Management']"));
		Ordermanagement.click();
		
		
		
		
		
		
		
		/*WebElement Searchorders=driver.findElement(By.linkText("Search Orders"));
		Searchorders.click();*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
