package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class TestBase {
    //Configuration

    public static WebDriver driver;
    String browserName = "chrome";
    String url = "https://www.amazon.com/";

    @BeforeTest
    public void setUpAutomation() {
        System.out.println("+++++++Automation Started +++++++++++++");
    }

    @AfterTest(alwaysRun = true)
    public void tearDownAutomation() {
        driver.close();
        System.out.println("+++++++++++Automation Ended++++++++++++");
    }

    @BeforeTest
    public void setup() {


        if (this.browserName == "chrome") {
            setUpChromeBrowser();
        } else if (this.browserName == "firefox") {
            setUpFireFoxBrowser();
        }
        //Navigate to amazon.com
        driver.manage().window().maximize();
        driver.get(this.url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().deleteAllCookies();

    }

    public static void setUpChromeBrowser() {
        //Driver Location
        String ChromeDriverPath = "../QE_22_Practice_Automation/ExternalLibrary/BrowserDriver/Windows/chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", ChromeDriverPath);

        //open browser
        driver = new ChromeDriver();
    }

    public static void setUpFireFoxBrowser() {
        //Driver Location

        String fireFoxDriverPath = "../QE_22_Practice_Automation/ExternalLibrary/BrowserDriver/Windows/geckodriver.exe";

        System.setProperty("webdriver.gecko.driver", fireFoxDriverPath);
        //open browser
        driver = new FirefoxDriver();
    }

    public static void display() {
        System.out.println("This is a display Method");
    }


}
