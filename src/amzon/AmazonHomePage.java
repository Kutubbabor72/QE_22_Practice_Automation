package amzon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonHomePage {


    public static void main(String[] args) {

        String driverPath ="../QE_22_Practice_Automation/ExternalLibrary/BrowserDriver/Windows/chromedriver.exe";
   System.setProperty("webdriver.chrome.driver",driverPath);
   WebDriver driver=new ChromeDriver();
   driver.get("https://www.amazon.com/");

   driver.manage().window().maximize();


   driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone 13");
   driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();


    }

}
