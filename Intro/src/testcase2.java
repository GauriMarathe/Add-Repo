import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class testcase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//selenium code
				//create driver object for chrome browser
				/*class name = ChromeDriver,
						{
					x driver = new x();*/
				//invoke .exe.file first
				//System.setProperty("webdriver.gecko.driver", "C:\\Users\\SAGAR BUWA\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
				//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.ie.driver", "C:\\Users\\SAGAR BUWA\\Downloads\\IEDriverServer_x64_4.0.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
				driver.get("http://www.google.com");
				System.out.println(driver.getTitle());
	}

}
