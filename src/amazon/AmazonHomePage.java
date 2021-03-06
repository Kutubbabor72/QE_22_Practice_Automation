package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonHomePage {
    static WebDriver driver;
    String browserName ="chrome";
    String url="https://www.amazon.com/";

    @BeforeTest
    public void setUpAutomation(){
        System.out.println("+++++++Automation Started +++++++++++++");
    }
    @AfterTest
    public void tearDownAutomation(){
        System.out.println("+++++++++++Automation Ended++++++++++++");
    }

@BeforeTest
    public void setup() {

      //  setUpFireFoxBrowser();

        if (this.browserName == "chrome") {
            setUpChromeBrowser();
        } else if (this.browserName == "firefox") {
            setUpFireFoxBrowser();
        }
        //Navigate to amazon.com
        driver.get(this.url);

        driver.manage().window().maximize();

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

    @Test
    public static void testSearchBoxOnChrome() throws InterruptedException {
       // setup("chrome", "\"https://www.amazon.com/\"");

        // enter keyword in search box field
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iPhone 14");
        // click on search box button
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();

        // Verify search product
        String actualText = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")).getText();
        System.out.println("Actual Text :" + actualText);
        String expectedText = "iphone 14";
        System.out.println("Expected Test : " + expectedText);

        if (actualText.equals(expectedText)) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }

        Thread.sleep(10000);
        driver.close();
    }
@Test(enabled = false)
    public static void testSearchBoxOnFireFox() throws InterruptedException {
      //  setup("firefox", "\"https://www.amazon.com/\"");

        // enter keyword in search box field
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iPhone 14");
        // click on search box button
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();

        // Verify search product
        String actualText = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")).getText();
        System.out.println("Actual Text :" + actualText);
        String expectedText = "iphone 14";
        System.out.println("Expected Test : " + expectedText);

        if (actualText.equals(expectedText)) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }

        Thread.sleep(5000);
        driver.close();
    }

    /**
     * This method will test signIn with Valid Credentials
     * @throws InterruptedException
     */
    @Test
    public static void testSignIn() throws InterruptedException {

        // Click on Hello SignIN
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
        //Enter Email /Phone Number
        driver.findElement(By.id("ap_email")).sendKeys("kutub.babor@gmail.com");
        //Click on Continue Button
        driver.findElement(By.cssSelector("#continue")).click();
        //Enter Password
        driver.findElement(By.name("password")).sendKeys("Test1234");
        // Click SignIn Button
        driver.findElement(By.className("a-button-input")).click();
        // Verify Successful log in
        String expectedText = "Hello, Kutub";
        String actualText = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).getText();
        System.out.println("Actual Text "+actualText);
        Assert.assertEquals(actualText,expectedText,"SignIn Success full");

    Thread.sleep(5000);
    driver.close();

    }

    /**
     * This method will test signIn with inValid Credentials
     * @throws InterruptedException
     */
    public static void testSignInInvalidCredentials() throws InterruptedException {

        // Click on Hello SignIN
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
        //Enter Email /Phone Number
        driver.findElement(By.id("ap_email")).sendKeys("kutub.babor@gmail.com");
        //Click on Continue Button
        driver.findElement(By.cssSelector("#continue")).click();
        //Enter Password
        driver.findElement(By.name("password")).sendKeys("Test1234");
        // Click SignIn Button
        driver.findElement(By.className("a-button-input")).click();
        // Verify Successful log in
        String expectedText = "There was a problem";
        String actualText = driver.findElement(By.xpath("//*[@id=\"auth-error-message-box\"]/div/h4")).getText();
        System.out.println("Actual Text "+actualText);
        Assert.assertEquals(actualText,expectedText,"SignIn Success full and Error message not showing ");

        Thread.sleep(5000);
        driver.close();

    }

}
