package class1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLinks {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in");
//		System.out.println(driver.getTitle());

		List<WebElement> tags = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		for (int i = 0; i < tags.size(); i++) {
			tags = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
			tags.get(i).click();

		}

	}

}
