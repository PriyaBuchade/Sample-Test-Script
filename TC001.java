package II_ROUND;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

public class TC001 {

	@Test
	public  void TC001() throws InterruptedException {
	//TC001:User able to create account using special symbol “@” in password field
    System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testing-assessment-foh15kew9-edvora.vercel.app/");	
		//Verify functionality of SignUp Button
		WebElement Signin = driver.findElement(By.xpath("//button[text()='SignIn']"));
		Signin.click();
		driver.navigate().to("https://testing-assessment-foh15kew9-edvora.vercel.app/r");	
		//Verify Username Text box accept keyword or not
		WebElement AUsername =	driver.findElement(By.xpath("//input[@autocomplete='username']"));
		AUsername.click(); 
		AUsername.sendKeys("qwert");
		WebElement APassword = driver.findElement(By.xpath("//input[@autocomplete='current-password']"));
		APassword.click();
		APassword.sendKeys("1@234");
		WebElement CreateAccount = driver.findElement(By.xpath("//button[text()='Create Account']"));
		CreateAccount.click();
		Thread.sleep(20000);
		Alert alt = driver.switchTo().alert();
		String text = alt.getText();
		Assert.assertEquals(text,("Account created succesfully"));
	   alt.accept();
		Thread.sleep(2000);
	    driver.close();
	}

	private void assertequal(boolean equalsIgnoreCase) {
		// TODO Auto-generated method stub
		
	}

	
}
