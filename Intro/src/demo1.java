import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class demo1
{
	public static void main(String[] args) {
		//webDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAGAR BUWA\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.moneycontrol.com/");
				driver.manage().window().maximize();
				WebElement element=driver.findElement(By.xpath("//*[@id=\'mc_mainWrapper\']/header/div[1]/div[3]/nav/div/ul/li[9]/div/div[1]/ul/li[2]/ul[2]/li[3]/a"));
				
				Actions action = new Actions (driver);
				action.moveToElement(element).perform();
				
				//wait for 2 secs
				//driver.navigate().to("https://www.moneycontrol.com/");
				//WebDriverWait wait = new WebDriverWait(driver,2);
				//WebElement Withexemption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("cust_inp custradio active"))); 
				//Withexemption.click();
				//driver.quit();
				
				//enter age
				WebElement ele =driver.findElement(By.id("age"));
				
				//dropdown
				driver.navigate().to("https://www.moneycontrol.com/");
				driver.findElement(By.xpath("//*[@id=\"\'basic_info\']/div[2]/a[2]")).click();
				try
				{
					Thread.sleep(5000);
					Select dropdown =new Select(driver.findElement(By.id("resi_status")));
				    dropdown.selectByIndex(1);
				}
				catch(Exception e) {
					System.out.println(e);
				}
				
				//click
				//enter annual amount
				driver.findElement(By.xpath("//input[@id='annual_salary']")).sendKeys("1500000");
				//enter business income
				driver.findElement(By.xpath("//input[@id='business_income']")).sendKeys("20000");
				//enter other income 
				driver.findElement(By.xpath("//input[@id='other_income']")).sendKeys("100000");
				//click the next button
				driver.findElement(By.xpath("//a[@id='income_tab_next']")).click();
				
				//enter annual rent paid
				driver.findElement(By.xpath("//input[@id='rent_paid']")).sendKeys("10000");
		       driver.findElement(By.xpath("//*[@id=\'income_tab_next\']")).click();
				//deduction
				driver.findElement(By.xpath("//input[@id='rent_paid']")).sendKeys("10000");
				
				//enter next button
				driver.findElement(By.xpath("//a[@title='Next'][@role='tab'][@aria-expanded='true']")).click();
				//enter next button
				driver.findElement(By.xpath("//a[@title='Next'][@role='tab'][@aria-expanded='true']")).click();
				
				//get element which i have to pay
				WebElement p=driver.findElement(By.xpath("//span[@id='display_tax']"));
				String ss=p.getText();
				System.out.println("Amount i have to pay--> "+ss);
				
				//hover on  forum and click on latest poll
				Actions act=new Actions(driver);
				WebElement forum=driver.findElement(By.xpath("/html/body/header/div[1]/div[3]/nav/div/ul/li[10]/a")).click();
				act.moveToElement(forum).build().perform();
				driver.findElement(By.xpath("//a[@title='Latest Polls']")).click();
				
				
				
				
				//click on historical poll
				driver.findElement(By.xpath("//a[@id='proftbx2']")).click();
				
				//print yes percentage
				WebElement per=driver.findElement(By.xpath("//*[@id=\"profile_cnt2\"]/div[3]/div[4]/div[1]/div[3]/ul/li[1]/strong"));
				String sss=per.getText();
				System.out.println("percentage of yes 3rd poll--> "+sss);
	}
}
				
				
				
				
				
				
				
				
				
				
			
				
				 


				
				
				
	
