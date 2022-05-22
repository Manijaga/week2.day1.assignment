package wee2.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		// Select by Index Value
		WebElement selectTrainingIndex = driver.findElement(By.id("dropdown1"));
		Select selectTrainingByIndex = new Select(selectTrainingIndex);
		selectTrainingByIndex.selectByIndex(4);
		// Select by using Text
		Select selectTrainingByText = new Select(driver.findElement(By.name("dropdown2")));
		selectTrainingByText.selectByVisibleText("UFT/QTP");
		// Select by using Value
		Select selectTrainingByValue = new Select(driver.findElement(By.id("dropdown3")));
		selectTrainingByValue.selectByValue("2");
		// Find Total # of drop downs
		Select numberOfdd = new Select(driver.findElement(By.className("dropdown")));
		List<WebElement> totalnumberOfdd = numberOfdd.getOptions();
		int size = totalnumberOfdd.size();
		System.out.println("Totoal # of drop down is: " + size);

		driver.findElement(By.xpath("//body/div/div/div[3]/section/div[5][@class='example']/select"))
				.sendKeys("Selenium");

		Select selectProByText = new Select(
				driver.findElement(By.xpath("//body/div/div/div[3]/section/div[6][@class='example']/select")));
		selectProByText.selectByIndex(3);
		driver.close();
	}

}
