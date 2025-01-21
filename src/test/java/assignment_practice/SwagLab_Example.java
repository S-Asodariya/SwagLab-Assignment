package assignment_practice;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class SwagLab_Example {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrom.driver", "C:\\Users\\sumis\\Downloads\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement txt_username = driver.findElement(By.id("user-name"));
		WebElement txt_password = driver.findElement(By.id("password"));
		WebElement btn_login = driver.findElement(By.id("login-button"));
		txt_username.sendKeys("standard_user");
		txt_password.sendKeys("secret_sauce");
		btn_login.click();
		Thread.sleep(5000);
		
		WebElement btn_addtocart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		btn_addtocart.click();
		Thread.sleep(5000);
		
		WebElement btn_remove = driver.findElement(By.id("remove-sauce-labs-backpack"));
		btn_remove.click();
		Thread.sleep(5000);
		
		WebElement btn_hemburgermenu = driver.findElement(By.id("react-burger-menu-btn"));
		btn_hemburgermenu.click();
		
		Thread.sleep(5000);
		WebElement link_logout = driver.findElement(By.id("logout_sidebar_link"));
		link_logout.click();
		
		Thread.sleep(5000);
		driver.quit();
		
		/*boolean isLogout_display = lnk_logout.isDisplayed();
		if(isLogout_display) {
			System.out.println("Login Successfully");
		}else {
			System.out.println("Login Unsuccessfully");
		}*/
		}

}
