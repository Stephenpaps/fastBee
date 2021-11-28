package ProjectFastBee;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FbSettings {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://admin.fastbeefood.net/admin/manageusers");
		
		
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
				Deletepromo.click();
				
				//Settings(Hotdeals)
				
				WebElement Settings03=driver.findElement(By.xpath("//a[normalize-space()='Settings']"));
				Actions hotdeals = new Actions(driver);
				hotdeals.moveToElement(Settings03);
				Thread.sleep(3000);
				
				WebElement HotDeals= driver.findElement(By.xpath("//span[normalize-space()='Settings']//following::li[4]"));
				hotdeals.moveToElement(HotDeals);
				hotdeals.click().build().perform();
				
				//settings(CuisinesList)
				WebElement Settings04=driver.findElement(By.xpath("//a[normalize-space()='Settings']"));
				Actions Cuisineslist = new Actions(driver);
				Cuisineslist.moveToElement(Settings04);
				Thread.sleep(3000);
				
				WebElement cuisine= driver.findElement(By.xpath("//span[normalize-space()='Settings']//following::li[5]"));
				Cuisineslist.moveToElement(cuisine);
				Cuisineslist.click().build().perform();
				
				WebElement Addcuisine=driver.findElement(By.xpath("/html/body/section/div/section/div/div[2]/div/div/div[1]/h2/a"));
				Addcuisine.click();
				
				WebElement cuisinenameeng=driver.findElement(By.xpath("//*[@id=\'add_cuisines\']/div[1]/div/span/input"));
				cuisinenameeng.sendKeys("Chaat items");
				
				WebElement cuisinearabic=driver.findElement(By.name("name_ar"));
				cuisinearabic.sendKeys("عناصر شات");
				
				WebElement cuisinekurdish = driver.findElement(By.name("name_kur"));
				cuisinekurdish.sendKeys("tiştên chat");
				
				WebElement submitcuisine=driver.findElement(By.xpath("//*[@id=\'add_cuisines\']/div[6]/div/button"));
				submitcuisine.click();
				
				WebElement cuisinedelete=driver.findElement(By.xpath("//*[@id=\'dropdownMenuButton\']"));
				cuisinedelete.click();
				
				WebElement deletecuisine=driver.findElement(By.xpath("//*[@id=\'nosortingtables\']/tbody/tr[1]/td[7]/div/ul/li[2]/a"));
				deletecuisine.click();
				
				//Settings(Popular Brand)
				
				
				WebElement Settings05=driver.findElement(By.xpath("//a[normalize-space()='Settings']"));
				Actions PopularBrand = new Actions(driver);
				PopularBrand.moveToElement(Settings05);
				Thread.sleep(3000);
				
				WebElement popularbrand= driver.findElement(By.xpath("//span[normalize-space()='Settings']//following::li[6]"));
				PopularBrand.moveToElement(popularbrand);
				PopularBrand.click().build().perform();
				
				WebElement addPopularbrand=driver.findElement(By.xpath("/html/body/section/div/section/div/div[2]/div/div/div[1]/h2/a"));
				addPopularbrand.click();
				
				Thread.sleep(3000);
				
				WebElement restpop=driver.findElement(By.xpath("//*[@id=\'add_popularbrand\']/div[1]/div/span/div/select"));
				Select selectjuicy=new Select(restpop);
				selectjuicy.selectByVisibleText("Juicy");
				
				WebElement Submitpop=driver.findElement(By.xpath("//*[@id=\'add_popularbrand\']/div[4]/div/button"));
				Submitpop.click();
				
				
				//Settings (Marketing Expense)
				
				WebElement Settings06=driver.findElement(By.xpath("//a[normalize-space()='Settings']"));
				Actions marketingexp = new Actions(driver);
				marketingexp.moveToElement(Settings06);
				Thread.sleep(3000);
				
				WebElement MarketingExp= driver.findElement(By.xpath("//span[normalize-space()='Settings']//following::li[7]"));
				marketingexp.moveToElement(MarketingExp);
				marketingexp.click().build().perform();
				
				
				WebElement Novdetails=driver.findElement(By.xpath("/html/body/section/div/section/div/div[1]/div/div/div/div/div[2]/a[2]"));
				Novdetails.click();
				
				WebElement Goback=driver.findElement(By.xpath("/html/body/section/div/section/div/div[1]/div/div/div/div/div[2]/a"));
				Goback.click();
				
				
				//Settings (Push Notifications)
				WebElement Settings07=driver.findElement(By.xpath("//a[normalize-space()='Settings']"));
				Actions pushnoti = new Actions(driver);
				pushnoti.moveToElement(Settings07);
				Thread.sleep(3000);
				
				WebElement Pushnotifications= driver.findElement(By.xpath("//span[normalize-space()='Settings']//following::li[8]"));
				pushnoti.moveToElement(Pushnotifications);
				pushnoti.click().build().perform();
				
				WebElement notiTitle=driver.findElement(By.id("notificationtitle"));
				notiTitle.sendKeys("Offers Exclusively for You !!");
				
				WebElement Noticontent=driver.findElement(By.id("notificationcontent"));
				Noticontent.sendKeys("Hello Dudes ! Here's Exciting Offers For You");
				
				WebElement SendNoti=driver.findElement(By.xpath("//*[@id=\'form_validation\']/div/div[5]/button"));
				SendNoti.click();		
				
				Alert confirm=driver.switchTo().alert();
				confirm.accept();
				
				//Settings(Manage Restaurants)
				WebElement Settings08=driver.findElement(By.xpath("//a[normalize-space()='Settings']"));
				Actions managerest = new Actions(driver);
				managerest.moveToElement(Settings08);
				Thread.sleep(3000);
				
				WebElement Managerestaurant= driver.findElement(By.xpath("//span[normalize-space()='Settings']//following::li[9]"));
				managerest.moveToElement(Managerestaurant);
				managerest.click().build().perform();
				
				WebElement Addnewrest=driver.findElement(By.xpath("/html/body/section/div/section/div/div[2]/div/div/div[1]/h2/a"));
				Addnewrest.click();
				
				WebElement Restname=driver.findElement(By.name("restaurant_name"));
				Restname.sendKeys("Maja Soja");
				
				WebElement Restnamearabic=driver.findElement(By.name("restaurant_name_ar"));
				Restnamearabic.sendKeys("ماجا سوجا");
				
				WebElement Restnamekurdish=driver.findElement(By.name("restaurant_name_kur"));
				Restnamekurdish.sendKeys("Maja Soja");
				
				WebElement packagingcharge=driver.findElement(By.name("packaging_charge"));
				packagingcharge.sendKeys("300");
				
				WebElement email=driver.findElement(By.id("email"));
				email.sendKeys("majasoja@mailinator.com");
				
				WebElement password=driver.findElement(By.id("password"));
				password.sendKeys("Majada");
				
				WebElement minordervalue=driver.findElement(By.name("min_order_value"));
				minordervalue.sendKeys("200");
				
				WebElement suburb=driver.findElement(By.xpath("//*[@id=\'add_restaurant\']/fieldset/div[1]/div[2]/div[5]/span/span[1]/span"));
				Select Suburb=new Select(suburb);
				Suburb.selectByVisibleText("HARSHAM");
				
				WebElement Phonenumber=driver.findElement(By.id("phone"));
				Phonenumber.sendKeys("1234567890");
				
				WebElement Status=driver.findElement(By.name("status"));
				Select status=new Select(Status);
				status.selectByValue("1");
				
				WebElement cuisrest = driver.findElement(By.xpath("//*[@id=\'add_restaurant\']/fieldset/div[1]/div[1]/div[9]/div[1]/div/span/span[1]/span"));
				Select cuis=new Select(cuisrest);
				cuis.selectByVisibleText("Indian");
				
				WebElement addcuisrest=driver.findElement(By.id("add_cuisine"));
				addcuisrest.click();
				
				WebElement homedeliv=driver.findElement(By.id("home_delivery"));
				homedeliv.click();
				
				WebElement pickup=driver.findElement(By.id("pickup"));
				pickup.click();
				
				//Settings(Restaurant Chat)
				WebElement Settings09=driver.findElement(By.xpath("//a[normalize-space()='Settings']"));
				Actions Restchat = new Actions(driver);
				Restchat.moveToElement(Settings09);
				Thread.sleep(3000);
				
				WebElement restchat= driver.findElement(By.xpath("//span[normalize-space()='Settings']//following::li[11]"));
				Restchat.moveToElement(restchat);
				Restchat.click().build().perform();
				
				WebElement Searchrestchat=driver.findElement(By.xpath("//*[@id=\'nosortingtables_filter\']/label/input"));
				Searchrestchat.sendKeys("Juicy");
				
				WebElement Chatjuicy=driver.findElement(By.xpath("//*[@id=\'nosortingtables\']/tbody/tr/td[5]/a"));
				Chatjuicy.click();
				
				WebElement Typemesg=driver.findElement(By.name("chat"));
				Typemesg.sendKeys("Va Mamey !");
				
				WebElement sendmesg=driver.findElement(By.id("send"));
				sendmesg.click();
				
				
				//Settings(Rider's Report)
				WebElement Settings10=driver.findElement(By.xpath("//a[normalize-space()='Settings']"));
				Actions Reportrider = new Actions(driver);
				Reportrider.moveToElement(Settings10);
				Thread.sleep(3000);
				
				WebElement Riderreport= driver.findElement(By.xpath("//span[normalize-space()='Settings']//following::li[12]"));
				Reportrider.moveToElement(Riderreport);
				Reportrider.click().build().perform();
				
				Thread.sleep(3000);
				WebElement Selectrider=driver.findElement(By.id("rider_id"));
				Select selectrider = new Select(Selectrider);
				selectrider.selectByVisibleText("Kombalanz");
				
				WebElement riderdatesfrom=driver.findElement(By.id("datesfrom"));
				riderdatesfrom.clear();
				riderdatesfrom.sendKeys("1st Nov 2021");
				
				WebElement riderdatesto=driver.findElement(By.id("datesto"));
				riderdatesto.clear();
				riderdatesto.sendKeys("25th Nov 2021");
				
				WebElement riderreportsearch=driver.findElement(By.xpath("//*[@id=\'form_validation\']/div/div[5]/button"));
				riderreportsearch.click();
				
				//Settings (Refunds report)
				
				WebElement Settings11=driver.findElement(By.xpath("//a[normalize-space()='Settings']"));
				Actions Refundsreport = new Actions(driver);
				Refundsreport.moveToElement(Settings11);
				Thread.sleep(3000);
				
				WebElement refunds= driver.findElement(By.xpath("//span[normalize-space()='Settings']//following::li[13]"));
				Refundsreport.moveToElement(refunds);
				Refundsreport.click().build().perform();
				
				WebElement Dec20=driver.findElement(By.xpath("/html/body/section/div/section/div/div[2]/div/div/div/a[12]"));
				Dec20.click();
				
				WebElement DetailsDec20=driver.findElement(By.xpath("/html/body/section/div/section/div/div[1]/div/div/div/div/div[2]/a[2]"));
				DetailsDec20.click();
				Thread.sleep(3000);
				WebElement goback =driver.findElement(By.xpath("//a[normalize-space()='GO BACK']"));
				goback.click();
				
				
				//Settings(Manage Driver)
				WebElement Settings12=driver.findElement(By.xpath("//a[normalize-space()='Settings']"));
				Actions Managedriver = new Actions(driver);
				Managedriver.moveToElement(Settings12);
				Thread.sleep(3000);
				
				WebElement managedriver= driver.findElement(By.xpath("//span[normalize-space()='Settings']//following::li[14]"));
				Managedriver.moveToElement(managedriver);
				Managedriver.click().build().perform();
				
				WebElement adddriverbtnmd=driver.findElement(By.xpath("/html/body/section/div/section/div/div[2]/div/div/div[1]/h2/a"));
				adddriverbtnmd.click();

	}

}
