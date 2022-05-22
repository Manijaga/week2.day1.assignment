package wee2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// open browser and navigate to TestLeaf login page
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		// Login with valid user and PWD
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		// create a lead and fill the form
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("EY Global");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Manigandan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kanniyappan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Mani");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Mathematics");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Automation Testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("manijaga1991@gmail.com");
		// Select class for selecting the state
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select statedd = new Select(state);
		statedd.selectByVisibleText("New York");

		driver.findElement(By.name("submitButton")).click();
		System.out.println("This is Title of the page - " + driver.getTitle());
		driver.close();
	}

}
