import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{

	public static void main(String[] args) 
	{
		 String chdriver = "webdriver.chrome.driver";
		 String value = "G:\\SoftwareData\\Chromedriver\\chromedriver.exe";
		 System.setProperty(chdriver,value);
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.saucedemo.com/");
		 driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	}

}
