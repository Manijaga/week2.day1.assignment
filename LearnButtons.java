package wee2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnButtons {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		driver.findElement(By.id("home")).click();
		driver.get("http://www.leafground.com/pages/Button.html");
		System.out.println("Button location(x , y) is " + driver.findElement(By.id("position")).getLocation());
		System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
		System.out.println("Button size(Height , Width) is " + driver.findElement(By.id("size")).getSize());
		driver.close();
	}

}
