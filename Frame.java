package w4day2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://chercher.tech/practice/frames-example-selenium-webdriver");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.switchTo().frame(0);
		driver.findElement(By.tagName("input")).sendKeys("Frames Selections");
		WebElement elementFrame = driver.findElement(By.id("frame3"));
	 	driver.switchTo().frame(elementFrame);
		Thread.sleep(2000);
	 	driver.findElement(By.id("a")).click();
	 	driver.switchTo().defaultContent();
	 	Thread.sleep(2000);
	 	WebElement elementFrame1 = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(elementFrame1);
	 	WebElement animal = driver.findElement(By.id("animals"));
	 	Select animal1=new Select(animal);
	 	animal1.selectByValue("avatar");


	}

}
