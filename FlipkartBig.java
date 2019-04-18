package PractiseMore;

//-------------------------------------------

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.thoughtworks.selenium.webdriven.commands.GetText;

public class FlipkartBig {

	public static void main(String[] args) {
		//-----------TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
		WebElement loginClose= driver.findElement(By.xpath("//div[2]/div/div/button"));
		if (loginClose.isDisplayed()){
			loginClose.click();
		}
		List <WebElement> Column= driver.findElements(By.xpath("//*[@id='container']/div/div[2]/div/ul/li[1]/ul/li/ul/li"));
		List<WebElement> tabs= driver.findElements(By.xpath("//*[@id='container']/div/div[2]/div/ul/li"));
		System.out.println("Column count in each tab is :" +Column.size());
		System.out.println("Total tabs in a row are :" +tabs.size());


		for (int i = 1; i<=4 ; i++) {
			for (int j = 1; j <=7; j++) {
				String s=driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/ul/li[1]/ul/li/ul/li["+i+"]/ul/li["+j+"]/a")).getText();
				System.out.println(s);
			}
		}
		driver.close();
	}
}
