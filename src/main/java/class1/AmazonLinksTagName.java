package class1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonLinksTagName {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.com/");

		List<WebElement> tags = driver.findElements(By.tagName("a"));

		for (int i = 0; i < tags.size(); i++) {
			String text = tags.get(i).getText();
			if (!text.isEmpty()) {

				System.out.println(text);
			}

		}

	}

}
