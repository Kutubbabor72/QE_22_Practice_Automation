package testAmazon;

import static amazon.AmazonHW1.*;
import base.TestBase;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.Assert;


public class AmazonHWTest extends TestBase {
    // To test all the methods

@Test
    public void testSearchBoxOnChrome() throws InterruptedException {
        searchBoxOnChrome(); //#1
    }
    @Test
    public void testSignIn() throws InterruptedException {
        signIn(); //#2
    }
    @Test
    public static void testSignInInvalidCredentials() throws InterruptedException {
        signInInvalidCredentials(); //#3
    }
    @Test
    public static void testAmazonLogoIsClickAble() throws InterruptedException {
        amazonLogoIsClickAble(); //#4
    }
    @Test
    public static void testAmazonLogoWorksAsHomePageButton() throws InterruptedException {
        amazonLogoWorksAsHomePageButton(); //#5
    }

    @Test
    public static void testBeautyAndPersonalCareIsClickAble() throws InterruptedException {
        beautyAndPersonalCareIsClickAble(); //#6
    }
    @Test
    public static void testBeautyAndPersonalCareNavigate() throws InterruptedException {
        beautyAndPersonalCareNavigate(); //#7
    }
    @Test
    public static void testCheckHairStylingAccessories() throws InterruptedException {
        checkHairStylingAccessories(); //#8
    }
    @Test
    public static void testHealthAndHouseHoldIsClickable() throws InterruptedException {
        healthAndHouseHoldIsClickable(); //#9

    }
    @Test
    public void testHealthAndHouseHoldNavigate() throws InterruptedException {
        healthAndHouseHoldNavigate(); //#10
    }
   @Test
    public static void testAmazonBasicIsClickAble() throws InterruptedException {
        amazonBasicIsClickAble(); //#11

    }
   @Test
    public void testShopperToolKitCheckTodayDeal() throws InterruptedException {
        shopperToolKitCheckTodayDeal(); //#12
    }
    @Test
    public void testCheckLocationOfUser() throws InterruptedException {
        checkLocationOfUser(); //#13
    }
    @Test
    public void testFathersDayBooksGiftGuid() throws InterruptedException {
        fathersDayBooksGiftGuid(); //#14
    }
    @Test
    public void testAfricanAmericanBiographies() throws InterruptedException {
        africanAmericanBiographies(); //#15
    }
    @Test
    public void testComputerAccessories() throws InterruptedException {
        computerAccessories(); //#16
    }
    @Test
    public void testAmazonHome() throws InterruptedException {
        amazonHome(); //#17
    }

    @Test
    public void testSmartHome() throws InterruptedException {
        smartHome(); //#18
    }
    @Test
    public void testDiy() throws InterruptedException {
        diy(); //#19
    }

   @Test
    public void testNavigateToGaana() throws InterruptedException {
        navigateToGaana(); //#20
    }
    @Test
    public void testAmazonDevicesAndAccessories() throws InterruptedException {
        amazonDevicesAndAccessories(); //#21
    }
    @Test
    public void testAmazonLaunchpad() throws InterruptedException {
        amazonLaunchpad();//#22
    }
    @Test
    public void testAppliances() throws InterruptedException {
        appliances();//#23
    }
    @Test
    public void testAppsAndGames() throws InterruptedException {
        appsAndGames();//#23
    }
    @Test
    public void testArtsCraftsAndSewing() throws InterruptedException {
        artsCraftsAndSewing();//#24
    }
    @Test
    public void testAutomotive() throws InterruptedException {
        automotive();//#25
    }
    @Test
    public void testBook() throws InterruptedException {
        book(); //#26
    }
    @Test
    public void testBeautyAndPersonalCare() throws InterruptedException {
        beautyAndPersonalCare(); //#27
    }
    @Test
    public void testCameraAndPhotoProducts() throws InterruptedException {
        cameraAndPhotoProducts(); //#28
    }
    @Test
    public void testCellPhonesAndAccessories() throws InterruptedException {
        cellPhonesAndAccessories(); //#29
    }
    @Test
    public void testClothingShoesAndJewelery() throws InterruptedException {
        clothingShoesAndJewelery(); //#30
    }

    
}
