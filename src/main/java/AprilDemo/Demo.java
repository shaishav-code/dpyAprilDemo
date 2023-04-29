package AprilDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Demo {
	static WebDriver driver;

	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
    	WebElement Search= driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
    	Search.sendKeys("Taj Mahal");
    	Thread.sleep(2000);
    	List<WebElement> results = driver.findElements(By.xpath("//li[@class='sbct']"));
    	WebElement tajmahal = driver.findElement(By.id("jZ2SBf"));
    	tajmahal.click();
    	Thread.sleep(1000);
    	List<WebElement> searchResults =  driver.findElements(By.xpath("//h3"));
		int linkCounts = searchResults.size();
		System.out.println("Total search results links are " + linkCounts);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'][normalize-space()='Taj Mahal'])[1]")).click();
	    String title = driver.getTitle();
	    System.out.println(title);
	    driver.close();
	}
}
