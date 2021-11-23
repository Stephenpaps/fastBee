package ProjectFastBee;

import java.io.File;

import javax.swing.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LoginAdmin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://admin.fastbeefood.net/admin");
		
		//Login page
		WebElement userName =driver.findElement(By.id("login_username"));
		userName.sendKeys("praveen@fastbee.net");
		
		WebElement passWord = driver.findElement(By.id("login_pass"));
		passWord.sendKeys("12345");
		
		WebElement submit = driver.findElement(By.xpath("//*[@id=\'form_admin_sign_in\']/div[3]/button"));
		submit.click();
		
		//Today dashboard graph
		/*WebElement GCWgraphtoday = driver.findElement(By.xpath("//*[@id=\'growthcanvas\']/select[1]"));
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
		
		
		WebElement pagination = driver.findElement(By.xpath("//*[@id=\'nosortingtables_paginate\']/ul/li[4]/a"));
		pagination.click();

		Thread.sleep(3000);
		WebElement Searchsales=driver.findElement(By.xpath("//*[@id=\'nosortingtables_filter\']/label/input"));
		Searchsales.sendKeys("FASTBEE060");
		
		Thread.sleep(3000);*/
		
		//Order Management Module
		/*WebElement Ordermanagement=driver.findElement(By.xpath("//a[normalize-space()='Order Management']"));
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
		closeassign.click();*/
		
		
		
		
		/*WebElement Actionstoassign1=driver.findElement(By.xpath("//*[@id=\'dropdownMenuButton\']"));
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
		Updatebtn2.click();*/
		
		
		//Searchorders		
		/*WebElement Searchorders=driver.findElement(By.linkText("Search Orders"));
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
		WebElement Enddate=driver.findElement(By.id("datesto"));
		Enddate.clear();
		Thread.sleep(3000);
		Enddate.sendKeys("23rd Nov 2021");
		
		WebElement submitbtn=driver.findElement(By.xpath("//*[@id=\'form_validation\']/div/div[7]/button"));
		submitbtn.click();*/
		
		
		//Registeredusers
		/*WebElement Registeredusers=driver.findElement(By.xpath("//*[@id=\'leftsidebar\']/div/div/div/div/ul/li[5]/a"));
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
		
		//Settings(Restaurant super admin)
		
		WebElement Settings=driver.findElement(By.xpath("//a[normalize-space()='Settings']"));
		Actions actions01 = new Actions(driver);
		actions01.moveToElement(Settings);
		Thread.sleep(3000);
		
		WebElement restsuperadmin= driver.findElement(By.xpath("//span[normalize-space()='Settings']//following::li[1]"));
		actions01.moveToElement(restsuperadmin);
		actions01.click().build().perform();
		
		WebElement Addsuperadmin=driver.findElement(By.xpath("/html/body/section/div/section/div/div[2]/div/div/div[1]/h2/strong[2]"));
		Addsuperadmin.click();
		
		WebElement Manageadmin=driver.findElement(By.xpath("/html/body/section/div/section/div/div[2]/div/div/div[1]/h2/strong[2]"));
		Manageadmin.click();
		
		//Settings(Sort Restaurants)
		
		Thread.sleep(3000);
		WebElement Settings01=driver.findElement(By.xpath("//a[normalize-space()='Settings']"));
		Actions actions02 = new Actions(driver);
		actions02.moveToElement(Settings01);
		Thread.sleep(3000);
		
		WebElement Sortrest= driver.findElement(By.xpath("//span[normalize-space()='Settings']//following::li[2]"));
		actions02.moveToElement(Sortrest);
		actions02.click().build().perform();
		
		//Settings(Promocodes)
		
		Thread.sleep(3000);
		WebElement Settings02=driver.findElement(By.xpath("//a[normalize-space()='Settings']"));
		Actions actions03 = new Actions(driver);
		actions03.moveToElement(Settings02);
		Thread.sleep(3000);
		
		WebElement Promocodes= driver.findElement(By.xpath("//span[normalize-space()='Settings']//following::li[3]"));
		actions03.moveToElement(Promocodes);
		actions03.click().build().perform();
		
		WebElement AddPromo=driver.findElement(By.xpath("/html/body/section/div/section/div/div[2]/div/div/div[1]/h2/a"));
		AddPromo.click();
		
		WebElement Titlepromo=driver.findElement(By.name("title"));
		Titlepromo.sendKeys("StephenTest");
		Thread.sleep(2000);
		WebElement Descriptionpromo = driver.findElement(By.xpath("//*[@id=\'add_promocode\']/div[2]/div/span/textarea"));
		Descriptionpromo.sendKeys("Promocode Testing");
		Thread.sleep(2000);
		WebElement Code=driver.findElement(By.name("code"));
		Code.sendKeys("Stephen Promos");
		Thread.sleep(2000);
		WebElement Deliverytype=driver.findElement(By.xpath("//*[@id=\'add_promocode\']/div[4]/div/span/div/div[1]/label"));
		Deliverytype.click();
		Thread.sleep(2000);
		WebElement Coupontype=driver.findElement(By.xpath("//*[@id=\'add_promocode\']/div[5]/div/span/div/div[2]/label"));
		Coupontype.click();
		
		WebElement Offertype=driver.findElement(By.xpath("//*[@id=\'add_promocode\']/div[6]/div/span/select"));
	    Select select14= new Select(Offertype);
	    select14.selectByVisibleText("Percent");
	    
	    WebElement Maxamount=driver.findElement(By.name("max_amount"));
	    Maxamount.sendKeys("3000");
	    
	    WebElement Discount=driver.findElement(By.name("value"));
	    Discount.sendKeys("10");
	    
	    WebElement LimitCoupon= driver.findElement(By.name("total_use"));
	    LimitCoupon.sendKeys("2");
	    
	    WebElement Limituser=driver.findElement(By.name("use_per_customer"));
	    Limituser.sendKeys("3");
	    
	    WebElement Submitpromo=driver.findElement(By.xpath("//*[@id=\'add_promocode\']/div[14]/div/button"));
	    Submitpromo.click();
	    
	    Thread.sleep(3000);
		
		WebElement Actionpromo=driver.findElement(By.xpath("//*[@id=\'dropdownMenuButton\']"));
		Actionpromo.click();
		Thread.sleep(2000);
		WebElement Deletepromo= driver.findElement(By.xpath("//*[@id=\'nosortingtables\']/tbody/tr[1]/td[11]/div/ul/li[2]/a"));
		Deletepromo.click();*/
		
		//Settings(Hotdeals)
		
		WebElement Settings03=driver.findElement(By.xpath("//a[normalize-space()='Settings']"));
		Actions hotdeals = new Actions(driver);
		hotdeals.moveToElement(Settings03);
		Thread.sleep(3000);
		
		WebElement HotDeals= driver.findElement(By.xpath("//span[normalize-space()='Settings']//following::li[4]"));
		hotdeals.moveToElement(HotDeals);
		hotdeals.click().build().perform();
		
		
		
		
		
		
		
	    
	    
	    
	    
	    
	    
	    
	    		
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
