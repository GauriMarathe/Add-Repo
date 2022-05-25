import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class salesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //selenium code
		//create driver object for chrome browser
		/*class name = ChromeDriver,
				{
			x driver = new x();*/
		//invoke .exe.file first
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAGAR BUWA\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://www.google.com");
		driver.get("https://test.salesforce.com");
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();//Xpath to click the button or plug in.salesforce
		
		
		
		
		//System.out.println(driver.getCurrentUrl());//validate itself if u r landed on correct url
		//System.out.println(driver.getPageSource());//print page src
		//driver.get("http:\\yahoo.com");// for hitting the url.
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.close();//closing the  current browser 
		//driver.quit();//it closees all browser opened by selenium
				
	}

}
