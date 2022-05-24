package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAGAR BUWA\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		
		driver.findElement(By.xpath("//*[@id='topnav_wrapper']/ul/li[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[1]/div/div/ul/li[1]/ul/li[1]/a/span")).click();
	  
	
	}
	
	

}
