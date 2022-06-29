package walmart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Walmart {

    static WebDriver driver;
    String browserName = "chrome";
    String url = "https://www.walmart.com/";


    public static void main(String[] args) {

        String driverPath ="../QE_22_Practice_Automation/ExternalLibrary/BrowserDriver/Windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.walmart.com/");
        System.out.println("Browser is open");
        driver.manage().window().maximize();
    }
//    public void setup() {
//
//
//        //Navigate to walmart.com
//        //driver.get(this.url);
//        driver.get("https://www.walmart.com/");
//
//        driver.manage().window().maximize();
//
//    }
//
//
//    public static void setUpChromeBrowser() {
//        //Driver Location
//        String ChromeDriverPath = "../QE_22_Practice_Automation/ExternalLibrary/BrowserDriver/Windows/chromedriver.exe";
//
//        System.setProperty("webdriver.chrome.driver", ChromeDriverPath);
//
//        //open browser
//        driver = new ChromeDriver();
//    }

}
