package SElenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class TakeScreenshot {
private static final String FileUtil = null;
static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\JARs\\chromeSelinium\\finalpath\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Tackscreenshot("facebook_login");
	
	}
	
	
	
		public static void Tackscreenshot(String filename) throws Exception {
		File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//String CurrentDIr = System.getProperty("config.dir");
		FileHandler.copy(file, new File( "D:\\SpringBoot API Projects\\DEmo_selenium\\src\\main\\java\\config\\"+filename+ ".png"));

		//FileHandler.copyFile(file, "D:\\SpringBoot API Projects\\DEmo_selenium\\src\\main\\java\\config\\"+filename+"jpg");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		

		
		

	}


