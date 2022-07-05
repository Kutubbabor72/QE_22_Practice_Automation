package amazon;

import base.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonHW1 extends TestBase {
    // Action purpose -
    static String actualText;


    public static void searchBoxOnChrome() throws InterruptedException {
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

    public static void signIn() throws InterruptedException {

        // Click on Hello SignIN
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
        //Enter Email /Phone Number
        driver.findElement(By.id("ap_email")).sendKeys("kkbtest2022@gmail.com");
        Thread.sleep(5000);
        //Click on Continue Button
        driver.findElement(By.cssSelector("#continue")).click();
        Thread.sleep(5000);
        //Enter Password
        driver.findElement(By.name("password")).sendKeys("Test@123456");
        Thread.sleep(5000);
        // Click SignIn Button
        driver.findElement(By.className("a-button-input")).click();
        Thread.sleep(5000);
        // Verify Successful log in
        String expectedText = "Hello, Kazi";
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

    public static void signInInvalidCredentials() throws InterruptedException {

        // Click on Hello SignIN
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
        //Enter Email /Phone Number
        driver.findElement(By.id("ap_email")).sendKeys("kkbtest2022@gmail.com");
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


    public static void amazonLogoIsClickAble() throws InterruptedException {
        // click on amazon logo
        driver.findElement(By.id("nav-logo-sprites")).click();
        Thread.sleep(5000);
        //driver.close();
    }


    public static void amazonLogoWorksAsHomePageButton() throws InterruptedException {
        // navigate to buy again page
        driver.findElement(By.id("nav_cs_buy_again")).click();
        // verify that by clicking amazon logo will navigate to amazon homge page
        driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]")).click();
        Thread.sleep(5000);
        //driver.close();
    }


    public static void beautyAndPersonalCareIsClickAble() throws InterruptedException {

        // Navigate to Beauty and personal Care page by make a click from amazon home page
        driver.findElement(By.id("nav_cs_1")).click();
        Thread.sleep(5000);
        // driver.close();

    }


    public static void beautyAndPersonalCareNavigate() throws InterruptedException {

        // Navigate to Beauty and personal Care page
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
        // Navigate to hair care in Beauty and personal care department
        driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[1]/ul/li[3]/span/a/span")).click();
        Thread.sleep(5000);
        //driver.close();


    }


    public static void checkHairStylingAccessories() throws InterruptedException {
        // Navigate to Beauty and personal Care page
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
        Thread.sleep(5000);
        // Navigate to hair care in Beauty and personal care department
        driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[1]/ul/li[3]/span/a/span")).click();
        Thread.sleep(5000);
        //Check for the product Hair Styling Accessories
        driver.findElement(By.xpath("//*[@id=\"anonCarousel2\"]/ol/li[1]/div/div/div[1]/div[1]/span")).click();
        String text = driver.findElement(By.xpath("//*[@id=\"anonCarousel2\"]/ol/li[1]/div/div/div[1]/div[1]/span")).getText();
        System.out.println("Actual Text" + text);
        Thread.sleep(5000);
        //driver.close();


    }


    public static void healthAndHouseHoldIsClickable() throws InterruptedException {

        // Navigate to Health and HouseHold Page by make a click from amazon home page
        driver.findElement(By.id("nav_cs_4")).click();
        Thread.sleep(5000);
        //driver.close();

    }


    public static void healthAndHouseHoldNavigate() throws InterruptedException {

        // Navigate to Health and HouseHold Page by make a click from amazon home page
        driver.findElement(By.id("nav_cs_4")).click();
        // Navigate to HouseHold cleaning
        driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div[2]/div[2]/div[2]/div/div[1]/ul[1]/li[3]/a")).click();
        Thread.sleep(5000);
        // driver.close();
    }

    @Test
    public static void amazonBasicIsClickAble() throws InterruptedException {
        // Navigate to Health and HouseHold Page by make a click from amazon home page
        driver.findElement(By.id("nav_cs_6")).click();
        Thread.sleep(5000);
        //driver.close();

    }


    public static void shopperToolKitCheckTodayDeal() throws InterruptedException {

        // setup("chrome", "\"https://www.amazon.com/\"");
        // Navigate to Shopper Tool Kit Page by make a click from amazon home pag
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
        Thread.sleep(10000);
        driver.findElement(By.className("nav-a-content")).click();
        Thread.sleep(10000);
        String actualText = driver.findElement(By.className("a-size-extra-large a-spacing-micro")).getText();
        System.out.println("Actual Text " + actualText);

        Thread.sleep(10000);
        // driver.close();

    }


    public static void checkLocationOfUser() throws InterruptedException {
        // to check user's name and address in amazon header
        // setup("chrome", "\"https://www.amazon.com/\"");
        //SignIn Method to log in to amazon
        signIn();
        // Check for Delivered Person
//        driver.findElement(By.id("glow-ingress-line1")).click();
//        Thread.sleep(5000);
        // this is to check the name of the person
        String actualText = driver.findElement(By.id("glow-ingress-line1")).getText();
        System.out.println("Actual Text " + actualText);
        // check for user's zipcode
        // driver.findElement(By.id("glow-ingress-line2")).click();
        String zipCode = driver.findElement(By.id("glow-ingress-line2")).getText();
        System.out.println("Zip Code is " + zipCode);
        // this code will check for pop up window of address
        driver.findElement(By.id("nav-global-location-popover-link")).click();
        Thread.sleep(5000);

    }


    public static void navigateToYahoo() throws InterruptedException {
        Thread.sleep(5000);
        driver.navigate().to("https://www.yahoo.com");
        Thread.sleep(5000);

    }


    public static void navigateToGaana() throws InterruptedException {
        Thread.sleep(5000);
        driver.navigate().to("https://gaana.com/");
        Thread.sleep(5000);
        //driver.findElement(By.xpath("//*[@id=\"app\"]/header/div/div[1]/div[4]/section/div[1]/div/input")).click();
        //driver.findElement(By.xpath("//*[@id=\"app\"]/header/div/div[1]/div[4]/section/div[1]/div/input")).sendKeys("Junaid Jamshed");
        // Need to know how to press Enter button on keyboard, this webpage search box don't have click button

    }

    /**
     * this method is to check the functionality of the page "Father's day books gift guide"
     */

    public static void fathersDayBooksGiftGuid() throws InterruptedException {
        //Click in books
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[8]")).click();
        Thread.sleep(5000);
        //Click to Father's day book gift guide
        driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div[2]/div[2]/div[1]/div/div[1]/ul[1]/li[2]/a")).click();
        Thread.sleep(5000);
        //click on Biographies and Memories
        driver.findElement(By.xpath("//*[text()='Biographies & Memoirs']"));
        Thread.sleep(5000);
        // Verifies user can see the list of books of Father's Day Book.

    }

    /**
     * This method is to verify the page for books based on African American Biographies
     */

    public static void africanAmericanBiographies() throws InterruptedException {
        //click on department books
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[8]")).click();
        Thread.sleep(5000);
        //click on Amplify Black Voices
        driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div[2]/div[2]/div[1]/div/div[1]/ul[1]/li[3]/a")).click();
        Thread.sleep(5000);
        //click on African American Biographies to verify list of books on African American Biographies
        driver.findElement(By.id("a-autoid-2-announce")).click();
        Thread.sleep(5000);

    }

    /**
     * This method is to verify the page computer accessories of Amazon Basic department -
     * If user can successfully navigate to the computer accessories page and see list of products
     */

    public static void computerAccessories() throws InterruptedException {
        //user click on amazon basics
        driver.findElement(By.xpath("//*[text()='Amazon Basics']")).click();
        Thread.sleep(5000);
        // user landed on the page on amazon basics
        // user click on computer accessories
        driver.findElement(By.xpath("//*[@id=\"Header-aElYFjT\"]/div/div/div[3]/div/div[2]/div/div[2]/div[2]/div[2]/nav/ul/li[5]/a")).click();
        Thread.sleep(5000);
        //Verifies user is on the page of computer and accessories and can see the list of products

    }

    /**
     * This method is to verify the page Home of Amazon Basic department -
     * If user can successfully navigate to the "Home" page and see list of products
     */

    public static void amazonHome() throws InterruptedException {
        //user click on amazon basics
        driver.findElement(By.xpath("//*[text()='Amazon Basics']")).click();
        Thread.sleep(5000);
        // user landed on the page on amazon basics
        // user click on Home
        driver.findElement(By.xpath("//*[@id=\"Header-nrSPTYf\"]/div/div/div[3]/div/div[2]/div/div[2]/div[2]/div[2]/nav/ul/li[1]/a")).click();
        Thread.sleep(5000);
        //Verifies user is on the page of "Home"and can see the list of products

    }

    /**
     * This method is to verify the page Smart Home of Amazon Basic department -
     * If user can successfully navigate to the "Smart Home" page and see list of products
     */

    public static void smartHome() throws InterruptedException {
        //user click on amazon basics
        driver.findElement(By.xpath("//*[text()='Amazon Basics']")).click();
        Thread.sleep(5000);
        // user landed on the page on amazon basics
        // user click on Smart Home             //*[@id="ProductGrid-tsSCByx"]/div/div/div/div/ul/li[3]/div[1]/a
        driver.findElement(By.xpath("//*[@id=\"ProductGrid-tsSCByx\"]/div/div/div/div/ul/li[3]/div[1]/a")).click();
        Thread.sleep(5000);
        //Verifies user is on the page of "Home"and can see the list of products
    }

    /**
     * This method is to verify the page DIY of Amazon Basic department -
     * If user can successfully navigate to the "DIY" page and see list of products
     */

    public static void diy() throws InterruptedException {
        //user click on amazon basics
        driver.findElement(By.xpath("//*[text()='Amazon Basics']")).click();
        Thread.sleep(5000);
        // user landed on the page on amazon basics
        // user click on DIY
        driver.findElement(By.xpath("//*[@id=\"Header-fJJZveW\"]/div/div/div[3]/div/div[2]/div/div[2]/div[2]/div[2]/nav/ul/li[4]/a")).click();
        ////*[@id="Header-pkhjHhN"]/div/div/div[3]/div/div[2]/div/div[2]/div[2]/div[2]/nav/ul/li[4]/a
        Thread.sleep(5000);
        //Verifies user is on the page of "Home"and can see the list of products
    }

    /**
     * This method is to verify the page Amazon Devices & Accessories of Amazon Best Seller department -
     * If user can successfully navigate to the "Amazon Devices and Accessories" page and see list of products
     */

    public static void amazonDevicesAndAccessories() throws InterruptedException {
        //user click on amazon best seller
        //driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();
        Thread.sleep(5000);
        // user landed on the amazon best seller page
        // user click on amazon devices and accessories
        driver.findElement(By.xpath("//*[text()='Amazon Devices & Accessories']")).click();
        Thread.sleep(5000);
        // verifies user can see the list of products of amazon devices and accessories on best seller department

    }

    /**
     * This method is to verify the page Amazon Launchpad of Amazon Best Seller department -
     * If user can successfully navigate to the "Amazon Launchpad" page and see list of products
     */

    public static void amazonLaunchpad() throws InterruptedException {
        //user click on amazon best seller
        //driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();
        Thread.sleep(5000);
        // user landed on the amazon best seller page
        //user click on amazon launchpad
        driver.findElement(By.xpath("//*[text()='Amazon Launchpad']")).click();
        Thread.sleep(5000);
        //user landed on amazon launchpad
        //driver.findElement(By.xpath("//*[text()='Best Sellers in Amazon Launchpad']")).getText();
        String expectedText = "Best Sellers in Amazon Launchpad";
        String actualText = driver.findElement(By.xpath("//*[text()='Best Sellers in Amazon Launchpad']")).getText();
        Assert.assertEquals(actualText, expectedText, "Best Sellers in Amazon Launchpad");
        //The message "Best Sellers in Amazon Launchpad" will verify user landed successfully on amazon launchpad and is able to see
        //the list of products
    }

    /**
     * This method is to verify the page Appliances of Amazon Best Seller department -
     * If user can successfully navigate to the "Appliances" page and see list of products
     */

    public static void appliances() throws InterruptedException {
        //user click on amazon best seller
        //driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();
        Thread.sleep(5000);
        // user landed on the amazon best seller page
        //user click on appliances
        ////*[text()='Appliances'] 1/2 - this custom Xpath is not unique - need to try to make it unique
        driver.findElement(By.xpath("//*[@id=\"CardInstanceRZBDcR7QznjQaUOqFmgFmg\"]/div[2]/div[3]/a")).click();
        Thread.sleep(5000);
        //user landed on appliances
        String expectedText = "Best Sellers in Appliances";
        //driver.findElement(By.xpath("//*[text()='Best Sellers in Appliances']")).getText();
        String actualText = driver.findElement(By.xpath("//*[text()='Best Sellers in Appliances']")).getText();
        Assert.assertEquals(actualText, expectedText, "Best Sellers in Appliances");
        // The message "Best Sellers in Appliances" will verify user landed successfully on appliances page
    }

    /**
     * This method is to verify the page Apps and Games of Amazon Best Seller department -
     * If user can successfully navigate to the "Apps and Games" page and see list of products
     */

    public static void appsAndGames() throws InterruptedException {
        //user click on amazon best seller
        //driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();
        Thread.sleep(5000);
        // user landed on the amazon best seller page
        //user click on App and Games
        ////*[text()='Apps & Games'] 1/2 - this custom Xpath is not unique
        driver.findElement(By.xpath("//*[@id=\"CardInstanceCtf7FobAxnf5e8wnMYV0GQ\"]/div[2]/div[4]/a")).click();
        Thread.sleep(5000);
        //user landed on App and Games page
        String expectedText = "Best Sellers in Apps & Games";
        //driver.findElement(By.xpath("//*[text()='Best Sellers in Apps & Games']")).getText();
        String actualText = driver.findElement(By.xpath("//*[text()='Best Sellers in Apps & Games']")).getText();
        Assert.assertEquals(actualText, expectedText, "Best Sellers in Apps & Games");
        // The message "Best Sellers in Apps & Games" will verify user landed successfully on App and Game page

    }

    /**
     * This method is to verify the page Arts, Crafts & Sewing of Amazon Best Seller department -
     * If user can successfully navigate to the "Arts, Crafts & Sewing" page and see list of products
     */

    public static void artsCraftsAndSewing() throws InterruptedException {
        //user click on amazon best seller
        //driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();
        Thread.sleep(5000);
        // user landed on the amazon best seller page
        //user click on Arts,Crafts and Sewing
        ////*[text()='Arts, Crafts & Sewing'] 1/2 this custom X path is not unique
        driver.findElement(By.xpath("//*[@id=\"CardInstancepnd4uvQZ12r7aNfnG8gOeA\"]/div[2]/div[5]/a")).click();
        Thread.sleep(5000);
        //user landed in Arts Crafts and Sewing Page
        String expectedText = "Best Sellers in Arts, Crafts & Sewing";
        //driver.findElement(By.xpath("//*[text()='Best Sellers in Arts, Crafts & Sewing']")).getText();
        String actualText = driver.findElement(By.xpath("//*[text()='Best Sellers in Arts, Crafts & Sewing']")).getText();
        Assert.assertEquals(actualText, expectedText, "Best Sellers in Arts, Crafts & Sewings");
        // The message "Best Sellers in Arts, Crafts & Sewing" will verify user landed successfully on Arts, Crafts & Sewing

    }

    /**
     * This method is to verify the page Automotive of Amazon Best Seller department -
     * If user can successfully navigate to the "Automotive" page and see list of products
     */

    public static void automotive() throws InterruptedException {
        //user click on amazon best seller
        //driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();
        Thread.sleep(5000);
        // user landed on the amazon best seller page
        //user click automotive
        ////*[text()='Automotive'] 1/2 - this custom X path is not Unique
        //driver.findElement(By.xpath("//*[@id=\"CardInstanceiRrkj4v7p_gujXANQyvM0g\"]/div[2]/div[7]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"CardInstanceiRrkj4v7p_gujXANQyvM0g\"]/div[2]/div[7]")).click();
        Thread.sleep(5000);
        //user landed in Automotive
        String expectedText = "Best Sellers in Automotive";
        String actualText = driver.findElement(By.xpath("//*[text()='Best Sellers in Automotive']")).getText();
        Assert.assertEquals(actualText, expectedText, "Best Sellers in Automotive");
        // The message "Best Sellers in Automotive" will verify user landed successfully on Automotive


    }

    /**
     * This method is to verify the page Book of Amazon Best Seller department -
     * If user can successfully navigate to the "Book" page and see list of products
     */
    @Test
    public static void book() throws InterruptedException {
        //user click on amazon best seller
        //driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();
        Thread.sleep(5000);
        // user landed on the amazon best seller page
        //user click book
        driver.findElement(By.xpath("//*[@id=\"CardInstanceRmSAD2qN-9GO1aoCwG93PA\"]/div[2]/div[10]")).click();
        Thread.sleep(5000);
        //user landed on page Book
        String expectedText = "Best Sellers in Books";
        String actualText = driver.findElement(By.xpath("//*[text()='Best Sellers in Books']")).getText();
        Assert.assertEquals(actualText, expectedText, "Best Sellers in Books");
        // The message "Best Sellers in Books" will verify user landed successfully on Book


    }

    /**
     * This method is to verify the page Beauty and personal care of Amazon Best Seller department -
     * If user can successfully navigate to the "Beauty and personal care" page and see list of products
     */

    public static void beautyAndPersonalCare() throws InterruptedException {
        //user click on amazon best seller
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();
        Thread.sleep(5000);
        // user landed on the amazon best seller page
        //user click Beauty & Personal Care
        ////*[text()='Beauty & Personal Care'] 1/3 - this custom X path is not unique
        driver.findElement(By.xpath("//*[@id=\"CardInstancebWw8LwlwkNastwSi9jzm9A\"]/div[2]/div[9]/a")).click();
        //user landed on the page Beauty & Personal Care
        String expectedText = "Best Sellers in Beauty & Personal Care";
        String actualText = driver.findElement(By.xpath("//*[text()='Best Sellers in Beauty & Personal Care']")).getText();
        Assert.assertEquals(actualText, expectedText, "Best Sellers in Beauty & Personal Care");
        // The message "Best Sellers in Beauty & Personal Care" will verify user landed successfully on Beauty & Personal Care

    }

    /**
     * This method is to verify the page Camera & Photo Products of Amazon Best Seller department -
     * If user can successfully navigate to the "Camera & Photo Products" page and see list of products
     */

    public static void cameraAndPhotoProducts() throws InterruptedException {
        //user click on amazon best seller
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();
        Thread.sleep(5000);
        // user landed on the amazon best seller page
        //user click on Camera and photo products
        driver.findElement(By.xpath("//*[text()='Camera & Photo Products']")).click();
        //user landed on the page camera and photo products
        String expectedText = "Best Sellers in Camera & Photo Products";
        String actualText = driver.findElement(By.xpath("//*[text()='Best Sellers in Camera & Photo Products']")).getText();
        Assert.assertEquals(actualText, expectedText, "Best Sellers in Camera & Photo Products");
        // The message "Best Sellers in Camera & Photo Products" will verify user landed successfully on camera and photo products
    }

    /**
     * This method is to verify the page Cell phone and accessories of Amazon Best Seller department -
     * If user can successfully navigate to the "Cell phone and accessories" page and see list of products
     */
    @Test
    public static void cellPhonesAndAccessories() throws InterruptedException {
        //user click on amazon best seller
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
        Thread.sleep(5000);
        // user landed on the amazon best seller page
        //user click on Cell Phone and accessories
        ////*[text()='Cell Phones & Accessories'] 1/2 - this custom X path is not unique
        driver.findElement(By.xpath("//*[@id=\"CardInstanceY2z26V5m1ZuZT8DbQJ8_0w\"]/div[2]/div[13]/a")).click();
        //user landed on the page cell phone and accessories
        String expectedText = "Best Sellers in Camera & Photo Products";
        String actualText = driver.findElement(By.xpath("//*[text()='Best Sellers in Cell Phones & Accessories']")).getText();
        Assert.assertEquals(actualText, expectedText, "Best Sellers in Camera & Photo Products");
        // The message "Best Sellers in Camera & Photo Products" will verify user landed successfully on Cell Phone and Accessories

    }

    /**
     * This method is to verify the page Clothing, Shoes & Jewelry of Amazon Best Seller department -
     * If user can successfully navigate to the "Clothing, Shoes & Jewelry" page and see list of products
     */
@Test
    public static void clothingShoesAndJewelery() throws InterruptedException {
        //user click on amazon best seller //*[@id="nav-xshop"]/a[2]
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
        Thread.sleep(5000);
        // user landed on the amazon best seller page
        //user click on Clothing Shoes and Jewelery
        ////*[text()='Clothing, Shoes & Jewelry']- 1/2 custom X path is not unique
        driver.findElement(By.xpath("//*[@id=\"CardInstancelTEh6tjeL4WkMuONX3rh2Q\"]/div[2]/div[14]/a")).click();
        Thread.sleep(5000);
    //user landed on the page clothing shoe and jewelery
    String expectedText = "Best Sellers in Clothing, Shoes & Jewelry";
    String actualText = driver.findElement(By.xpath("//*[text()='Best Sellers in Clothing, Shoes & Jewelry']")).getText();
    Assert.assertEquals(actualText, expectedText, "Best Sellers in Clothing, Shoes & Jewelry");
    // The message "Best Sellers in Clothing, Shoes & Jewelry" will verify user landed successfully on Clothing Shoes and jewelery
    }

}
