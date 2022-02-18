package w4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/sortable");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.switchTo().frame(0);
	    WebElement elementframe1 = driver.findElement(By.xpath("//li[contains(text(),'Item 1')]"));
		WebElement elementframe2 = driver.findElement(By.xpath("//li[contains(text(),'Item 2')]"));
		WebElement elementframe3 = driver.findElement(By.xpath("//li[contains(text(),'Item 3')]"));
		WebElement elementframe4 = driver.findElement(By.xpath("//li[contains(text(),'Item 4')]"));
		WebElement elementframe5 = driver.findElement(By.xpath("//li[contains(text(),'Item 5')]"));
		WebElement elementframe6 = driver.findElement(By.xpath("//li[contains(text(),'Item 6')]"));
		Actions builder = new Actions(driver);
		builder.keyDown(Keys.CONTROL).click(elementframe1).click(elementframe2).click(elementframe3).click(elementframe4).click(elementframe5).click(elementframe6).keyUp(Keys.CONTROL).perform();
		
	    
	}

}
