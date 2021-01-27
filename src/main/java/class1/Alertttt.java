package class1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Alertttt {

	static WebDriver driver;

	public static void main(String[] args) {
		
		/*
		Fluentwait given you below 3 facilities :
			a. timeout
			b.pollingPeriod
			c.IgnoreException
			
			Since it is implementing Wait interface so we can use top casting here: */


	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(10))
			.pollingEvery(Duration.ofSeconds(2))
			.ignoring(Exception.class);
		
		
		
	}

}
