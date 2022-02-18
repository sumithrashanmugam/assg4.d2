package w4day2;

import java.util.ArrayList;
import org.openqa.selenium.Alert;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(2000);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
	    String WindowHandle=driver.getWindowHandle();
		System.out.println(WindowHandle);
		String firstWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//img[@src='/images/fieldlookup.gif']")).click();
		Set<String>WindowHandles=	driver.getWindowHandles();
		List<String>list=new ArrayList<String>(WindowHandles);
		String secWindow=list.get(1);
		driver.switchTo().window(secWindow);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='linktext']")).click();
		driver.switchTo().window(list.get(0));
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> windowHandle1 = driver.getWindowHandles();
		List<String>list1 = new ArrayList<String>(windowHandle1);
	    String newWindow=list1.get(1);
	    driver.switchTo().window(newWindow);
	    driver.findElement(By.xpath("(//a[@class='linktext'])[3]")).click();
		driver.switchTo().window(firstWindow);
		driver.findElement(By.className("buttonDangerous")).click();
		Alert alert = (Alert) driver.switchTo().alert();
        alert.accept();
		String Title = driver.getTitle();
		System.out.println(" PageTitle  is :: "+Title);
		}

}
