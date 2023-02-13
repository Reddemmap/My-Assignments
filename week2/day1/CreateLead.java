package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		Thread.sleep(2000);
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Leads")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test leaft");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Reddemma");
		
		//driver.findElement(By.id("createLeadForm_dataSourceId")).click();
		
		WebElement sourcedropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select dd = new Select(sourcedropdown);
		
		dd.selectByVisibleText("Cold Call");
		
		driver.findElement(By.id("createLeadForm_industryEnumId")).click();
		
		
		
		
	 
		
		
		

	}
	
	
}
