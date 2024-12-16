package AUTO_IT;  //auto_it

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import dev.failsafe.Timeout;


public class Auto_it {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement blog = driver.findElement(By.id("uploadfile"));                        
	    Actions action=new Actions(driver);
        action.moveToElement(blog).click().perform();
       Thread.sleep(3000);
        Runtime.getRuntime().exec("C:\\Users\\ADMIN\\Desktop\\Mvn_prj\\Source\\uploadFile.exe");
        Runtime.getRuntime().exec("C:\\Users\\ADMIN\\Desktop\\Mvn_prj\\SOURCE1\\uploadFile.exe");// auto send file

	}

}
