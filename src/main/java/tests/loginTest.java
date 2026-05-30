package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.loginPage;
import utils.ConfigReader;
import utils.basePage;

public class loginTest extends basePage {

    loginPage login;
   ConfigReader config= new ConfigReader();



    @BeforeMethod
    public void setUp() {
        openBrowser();
        navigateTo(ConfigReader.read("baseurl"));
    }

    @Test
    public void validLoginTest() throws InterruptedException {
        login = new loginPage(driver);
        Thread.sleep(3000);
        login.login(ConfigReader.read("username"), ConfigReader.read("password"));
        Thread.sleep(5000);
        Assert.assertTrue(login.isDashboardDisplayed(), "Dashboard is not displayed after login");
    }






    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
