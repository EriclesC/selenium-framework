package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ExtentReportManager;
import utils.Log;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin(){

        Log.info("Starting login test...");
        test = ExtentReportManager.createTest("Login test");

        test.info("Navigating to URL");
        LoginPage loginPage = new LoginPage(driver);

        Log.info("Adding credentials");
        test.info("Adding credentials");
        loginPage.enterUserName("admin@yourstore.com");
        loginPage.enterPassword("admin");
        test.info("Clicking on Login button");
        loginPage.clickLogin();

        //System.out.println("Title of the page is: "+driver.getTitle());
        Log.info("Verifying page title...");
        test.info("Verifying page title");
        Assert.assertEquals(driver.getTitle(),"Dashboard / nopCommerce administration");

        Log.info("Login test completed.");
        test.pass("Login Successful");
    }

    @Test
    public void testLoginWithInvalidCredentials(){

        Log.info("Starting login test...");
        test = ExtentReportManager.createTest("Login test with invalid credentials");

        test.info("Navigating to URL");
        LoginPage loginPage = new LoginPage(driver);

        Log.info("Adding credentials");
        test.info("Adding credentials");
        loginPage.enterUserName("admin@yourstore.com");
        loginPage.enterPassword("adminn");
        test.info("Clicking on Login button");
        loginPage.clickLogin();

        //System.out.println("Title of the page is: "+driver.getTitle());
        Log.info("Verifying page title...");
        test.info("Verifying page title");
        Assert.assertEquals(driver.getTitle(),"Dashboard / nopcommerce administration");

        Log.info("Login test completed.");
        test.pass("Login Successful");
    }
}
