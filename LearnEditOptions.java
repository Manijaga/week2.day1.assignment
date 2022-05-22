package wee2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnEditOptions {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("manijaga1991@gmail.com");
		driver.findElement(By.xpath("//body/div/div/div[3]/section/div[2]/div/div/input")).sendKeys("Value 2");
		System.out.println(
				"The default text entered - " + (driver.findElement(By.name("username")).getAttribute("Value")));
		driver.findElement(By.xpath("(//input[@name ='username'])[2]")).clear();
		boolean flag = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
		// System.out.println(driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled());
		if (flag == true) {
			System.out.println("field is Enabled");
		} else {
			System.out.println("field is Disabled");
		}
		driver.close();
	}
}
