package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium1stClass {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver","E:\\NEC + Aut data bkup\\NEC + Aut data bkup\\Drivers\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
//		System.out.println(driver.getPageSource());
		
		
	}

}
