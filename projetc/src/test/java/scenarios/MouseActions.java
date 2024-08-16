package scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
         Thread.sleep(5000);
         if(driver.findElement(By.xpath("//*[text()='Request OTP']")) .isDisplayed()) {
		driver.navigate().refresh();
         }else {
        	 System.out.println("skiping refresh");
         }
		Actions action = new Actions(driver);
	    WebElement element = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/div[2]/div/div/div/div/img"));
		action.moveToElement(element).perform();
		action.click(element).perform();
		action.contextClick(element).perform();
		action.clickAndHold(element).dragAndDrop(driver.findElement(By.id("")), driver.findElement(By.id(""))).build().perform();
		
		
	}


}