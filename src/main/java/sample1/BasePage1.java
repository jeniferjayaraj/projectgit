package sample1;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

	public class BasePage1{

		public static WebDriver driver;
		public String browser = "chrome";

		public BasePage1() {
			if (driver == null) {
				if (browser.equals("chrome")) {
					System.setProperty("webdriver.chrome.driver",
							"C:\\Users\\ELLIKUTTY\\Downloads\\chromedriver_win32\\chromedriver.exe");
					driver = new ChromeDriver();
			} else if (browser.equals("firefox")) {
					System.setProperty("webdriver.gecko.driver", "Firefox Driver Server Path");
					driver = new FirefoxDriver();
				}
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				driver.get("http://flipkart.com");
			}
		}

		public boolean elementFound(WebElement element) {
			boolean res = false;
			try {
				res = element.isDisplayed();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return res;
		}
		
		public void setText(WebElement element, String name) {
			if (name != null) {
				element.click();
				element.clear();
				element.sendKeys(name);
			}
		}
		
		

		
		public String getTitlte1() {
			return driver.getTitle();
		}	
		
		public void quitDriver() {
			driver.quit();
			
		}
		
		public String getTxtAttribute(WebElement element) {
			return element.getAttribute("value");
		}

		public String selectFromDropDown(WebElement element, String option) {
			Select obj = new Select(element);
			obj.selectByValue(option);
			return obj.getFirstSelectedOption().getText();
		}


}
