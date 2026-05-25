package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.loginPage;
import utils.basePage;

public class loginTest extends basePage {

    loginPage login;



    @BeforeMethod
    public void setUp() {
        openBrowser();
        navigateTo("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test
    public void validLoginTest() throws InterruptedException {
        login = new loginPage(driver);
        Thread.sleep(3000);
        login.login("Admin", "admin123");
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
