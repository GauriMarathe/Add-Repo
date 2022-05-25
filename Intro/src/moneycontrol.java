
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class moneycontrol {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAGAR BUWA\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Launch
		driver.navigate().to("https://www.moneycontrol.com/");
		
		//maximize the tab
		driver.manage().window().maximize();
		
		
		// time wait
		//driver.manage().timeouts().implicityWait(2, TimeUnit.SECONDS);
		
		
		
		//hover
		//create an object of an Action class
		Actions action=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//*[@id=\'mc_mainWrapper\']/header/div[1]/div[3]/nav/div/ul/li[9]/a")).click();
		action.moveToElement(move).build().perform();
		driver.findElement(By.xpath("//a[@title='Income Tax Calculator']")).click();
		
		
		
		// choose without exemption option
		driver.findElement(By.xpath("//span[@class='styspri icradio_mid']")).click();
		
	// time wait
		driver.manage().timeouts().implicityWait(2, TimeUnit.SECONDS);
		
		// now choose with exemption option
		driver.findElement(By.xpath("//span[@class='styspri icradio_mid checked']")).click();
		
		//enter age
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("21");
		
		//choose residential status drop down 
		Select s=new Select(driver.findElement(By.xpath("//select[@class='custselect']")));
		s.selectByVisibleText("Stay in Non Metro city");
		
		//click on next button
		driver.findElement(By.xpath("//a[@title='Next']")).click();
		
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
