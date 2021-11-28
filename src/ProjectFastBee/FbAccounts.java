package ProjectFastBee;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FbAccounts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://admin.fastbeefood.net/admin/salesreport");
		
		
		
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
				
				WebElement downloadInvoice= driver.findElement(By.xpath("/html/body/section/div/section/div/div[1]/div/div/div/div/div[2]/button"));
				downloadInvoice.click();
					

				File filelocation= new File("C:\\Users\\Viveka\\Downloads");
				File[] totalfiles=filelocation.listFiles();
				
				for (File file : totalfiles) {
					
					if(file.getName().equals("1637928647.csv")) {
						System.out.println("File is downloaded");
						break;
					
					}
					
				}

			    

	}

}
