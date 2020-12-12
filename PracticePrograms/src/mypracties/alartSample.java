package mypracties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alartSample
{
	 public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver","C:\\Data\\Soft\\Selenium\\Selenium.jars\\geckodriver.exe");
	        WebDriver driver = new FirefoxDriver();
	        String alertMessage = "";

	        driver.get("http://jsbin.com/usidix/1");
	        driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
	        alertMessage = driver.switchTo().alert().getText();
	        Thread.sleep(2000);
	        driver.switchTo().alert().accept();
	       
	        System.out.println(alertMessage);
	        driver.close();
}
}