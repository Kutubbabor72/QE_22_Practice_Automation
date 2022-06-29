package amzon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonHW1 {

    static WebDriver driver;
    String browserName = "chrome";
    String url = "https://www.amazon.com/";

    @BeforeTest
    public void setUpAutomation() {
        System.out.println("+++++++Automation Started +++++++++++++");
    }

    @AfterTest
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
        // driver.close();
    }

  /*  @Test(enabled = false)
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

  */

    /**
     * This method will test signIn with Valid Credentials
     *
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
        System.out.println("Actual Text " + actualText);
        Assert.assertEquals(actualText, expectedText, "SignIn Success full");

        Thread.sleep(5000);
        //driver.close();

    }

    /**
     * This method will test signIn with inValid Credentials
     *
     * @throws InterruptedException
     */
    @Test
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
        System.out.println("Actual Text " + actualText);
        Assert.assertEquals(actualText, expectedText, "SignIn Success full and Error message not showing ");

        Thread.sleep(5000);
        //driver.close();

    }

    @Test
    public static void amazonLogoIsClickAble() throws InterruptedException {
        // click on amazon logo
        driver.findElement(By.id("nav-logo-sprites")).click();
        Thread.sleep(5000);
        //driver.close();
    }

    @Test
    public static void amazonLogoWorksAsHomePageButton() throws InterruptedException {
        // navigate to buy again page
        driver.findElement(By.id("nav_cs_buy_again")).click();
        // verify that by clicking amazon logo will navigate to amazon homge page
        driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]")).click();
        Thread.sleep(5000);
        //driver.close();
    }

    @Test
    public static void BeautyAndPersonalCareIsClickAble() throws InterruptedException {

        // Navigate to Beauty and personal Care page by make a click from amazon home page
        driver.findElement(By.id("nav_cs_1")).click();
        Thread.sleep(5000);
        // driver.close();

    }

    @Test
    public static void BeautyAndPersonalCareNavigate() throws InterruptedException {

        // Navigate to Beauty and personal Care page
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
        // Navigate to hair care in Beauty and personal care department
        driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[1]/ul/li[3]/span/a/span")).click();
        Thread.sleep(5000);
        //driver.close();


    }

    @Test
    public static void CheckHairStylingAccessories() throws InterruptedException {
        // Navigate to Beauty and personal Care page
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
        // Navigate to hair care in Beauty and personal care department
        driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[1]/ul/li[3]/span/a/span")).click();
        //Check for the product Hair Styling Accessories
        driver.findElement(By.xpath("//*[@id=\"anonCarousel2\"]/ol/li[1]/div/div/div[1]/div[1]/span")).click();
        String text = driver.findElement(By.xpath("//*[@id=\"anonCarousel2\"]/ol/li[1]/div/div/div[1]/div[1]/span")).getText();
        System.out.println("Actual Text" + text);
        Thread.sleep(5000);
        //driver.close();


    }

    @Test
    public static void HealthAndHouseHoldIsClickable() throws InterruptedException {

        // Navigate to Health and HouseHold Page by make a click from amazon home page
        driver.findElement(By.id("nav_cs_4")).click();
        Thread.sleep(5000);
        //driver.close();

    }

    @Test
    public static void HealthAndHouseHoldNavigate() throws InterruptedException {

        // Navigate to Health and HouseHold Page by make a click from amazon home page
        driver.findElement(By.id("nav_cs_4")).click();
        // Navigate to HouseHold cleaning
        driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div[2]/div[2]/div[2]/div/div[1]/ul[1]/li[3]/a")).click();
        Thread.sleep(5000);
        // driver.close();
    }

    @Test
    public static void AmazonBasicIsClickAble() throws InterruptedException {
        // Navigate to Health and HouseHold Page by make a click from amazon home page
        driver.findElement(By.id("nav_cs_6")).click();
        Thread.sleep(5000);
        //driver.close();

    }

    @Test
    public static void ShopperToolKitCheckTodayDeal() throws InterruptedException {

        // setup("chrome", "\"https://www.amazon.com/\"");
        // Navigate to Shopper Tool Kit Page by make a click from amazon home pag
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
        driver.findElement(By.className("nav-a-content")).click();
        String actualText = driver.findElement(By.className("a-size-extra-large a-spacing-micro")).getText();
        System.out.println("Actual Text " + actualText);

        Thread.sleep(10000);
        // driver.close();

    }

    @Test
    public static void CheckLocationOfUser() {
        // to check user's name and address in amazon header
        // setup("chrome", "\"https://www.amazon.com/\"");
        // Check for Delivered Person
        driver.findElement(By.id("glow-ingress-line1")).click();
        // this is to check the name of the person
        String actualText = driver.findElement(By.id("glow-ingress-line1")).getText();
        System.out.println("Actual Text " + actualText);
        // check for user's zipcode
        // driver.findElement(By.id("glow-ingress-line2")).click();
        String zipCode = driver.findElement(By.id("glow-ingress-line2")).getText();
        System.out.println("Zip Code is " + zipCode);
        // this code will check for pop up window of address
        driver.findElement(By.id("nav-global-location-popover-link")).click();

    }
}
