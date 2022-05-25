import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class demo1 {

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
	   	   // driver.get("https://test.salesforce.com");
		//driver.findElement(By.id("email")).sendKeys("This is my first code");//fb
		//driver.findElement(By.name("pass")).sendKeys("123456");//fb
		//driver.findElement(By.linkText("Forgotten password?")).click();//salesforce
		
	    driver.get("https://www.facebook.com");

	    //driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();//Xpath to click the button or plug in.salesforce
		//driver.findElement(By.cssSelector("#email")).sendKeys("emailAddress");//fb
	    driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("password G");//fb
	    driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		
	    //tag name[v='value']  .css
	    driver.findElement(By.cssSelector("input[name='email']")).sendKeys("myowncss");
		driver.findElement(By.cssSelector("value='Log In']")).click();
	    
	    
	    
	  
		//System.out.println(driver.getCurrentUrl());//validate itself if u r landed on correct url
		//System.out.println(driver.getPageSource());//print page src
		//driver.get("http:\\yahoo.com");// for hitting the url.
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.close();//closing the  current browser 
		//driver.quit();//it closees all browser opened by selenium
				
	}

}
