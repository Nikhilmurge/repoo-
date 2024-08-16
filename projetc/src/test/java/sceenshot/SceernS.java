package sceenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.internal.Locatable;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.description.annotation.AnnotationDescription.Loadable;

public class SceernS {

	public static void main(String[] args) throws Exception {
		String path = "C:\\Users\\admin\\eclipse-workspace_javap\\projetc\\screen";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mvnrepository.com/");
		 WebElement element = driver.findElement(By.xpath("(//*[@role=\"contentinfo\"])[last()]"));
		((Locatable) element).getCoordinates().inViewPort();

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(path + "screen1.jpg"));
	}

}