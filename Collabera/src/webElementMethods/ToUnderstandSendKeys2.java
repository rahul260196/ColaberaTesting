package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandSendKeys2 {
	//for interview

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/user/login");
		Thread.sleep(3000);
		driver.findElement(By.linkText("X")).click();
		WebElement usernameTextField = driver.findElement(By.id("email"));
		usernameTextField.clear();
		
		usernameTextField.sendKeys("Rah","ul","kum",Keys.CONTROL+"a");
		Thread.sleep(2000);
		usernameTextField.sendKeys(Keys.CONTROL+"c");
		
		WebElement passwordTextField = driver.findElement(By.name("password"));
		passwordTextField.clear();
		Thread.sleep(2000);
		passwordTextField.sendKeys(Keys.CONTROL+"v");
		
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
				

	}

}
