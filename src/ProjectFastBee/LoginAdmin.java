package ProjectFastBee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAdmin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://admin.fastbeefood.net/admin");
		driver.manage().window().maximize();

		
		//Login page
		WebElement userName =driver.findElement(By.id("login_username"));
		userName.sendKeys("praveen@fastbee.net");
		
		WebElement passWord = driver.findElement(By.id("login_pass"));
		passWord.sendKeys("12345");
		
		WebElement submit = driver.findElement(By.xpath("//*[@id=\'form_admin_sign_in\']/div[3]/button"));
		submit.click();
		
		FbDashboard dashboard = new FbDashboard();
		dashboard.Dashboard();
	}
}		
		
		
		
	