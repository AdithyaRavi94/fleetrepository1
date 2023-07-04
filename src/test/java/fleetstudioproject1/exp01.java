package fleetstudioproject1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class exp01 {

	WebDriver driver;
	@Test
	public void LoginWithValidCredentials() throws IOException {
		driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("input-email")).sendKeys("adityaraviraj786@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Aadhy@1994");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		System.out.println("first test successful");
		driver.quit();
	}
	
	@Test
	public void LoginWithInvalidCredentials() throws IOException {
		driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("input-email")).sendKeys("adityaraviraj786@gmail.com22");
		driver.findElement(By.id("input-password")).sendKeys("Aadhy@199412");
		TakesScreenshot ts =(TakesScreenshot) driver;
		File files = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\Screenshots\\Invalidcredentials.png");
		FileUtils.copyFile(files, trg);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.quit();
	}
	
	@Test
	public void LoginWithValidEmailIDandInvalidpassword() throws IOException {
		driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("input-email")).sendKeys("adityaraviraj786@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Aadhy@199412");
		TakesScreenshot ts =(TakesScreenshot) driver;
		File files = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\Screenshots\\LoginWithValidEmailIDandInvalidpassword.png");
		FileUtils.copyFile(files, trg);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.quit();
		
	}
	
	@Test
	public void LoginWithValidpasswordAndinvalidID() throws IOException {
		driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("input-email")).sendKeys("adityaraviraj786@gmail.com22");
		driver.findElement(By.id("input-password")).sendKeys("Aadhy@1994");
		TakesScreenshot ts =(TakesScreenshot) driver;
		File files = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\Screenshots\\LoginWithValidpasswordAndinvalidID.png");
		FileUtils.copyFile(files, trg);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.quit();
	}
	
	@Test
	public void LoginWithNofields() throws IOException {
		driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		TakesScreenshot ts =(TakesScreenshot) driver;
		File files = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\Screenshots\\LoginWithNofields.png");
		FileUtils.copyFile(files, trg);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.quit();
	}
	@Test
	public void forgetpasswordfunction() {
		driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Forgotten Password")).click();
		driver.findElement(By.id("input-email")).sendKeys("adityaraviraj786@gmail.com");
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		driver.quit();
	}
}
