package ritik.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sarat\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vprismqc.vidgyor.com/");
		
		WebElement section = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/main/center/amplify-authenticator/amplify-sign-in//amplify-form-section/form/amplify-section/section"));
		section.click();
		
		//find username
		WebElement email= driver.findElement(By.name("email"));
		email.sendKeys("sarather25@gmail.com");
		
		//find password
		driver.findElement(By.name("password")).sendKeys("ritik123");
	
		//find sign in button
		driver.findElement(By.className("button")).click();
		//or 
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/main/center/amplify-authenticator/amplify-sign-in//amplify-form-section/form/amplify-section/section/div[2]/div/slot/div/slot/amplify-button/button")).click();
	}

}
