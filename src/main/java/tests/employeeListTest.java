package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.employeePage;
import pages.loginPage;
import utils.basePage;

public class employeeListTest extends basePage{


        loginPage login;
        employeePage empPage;


    @BeforeMethod
        public void setUp() throws InterruptedException {
            openBrowser();
            navigateTo("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            login = new loginPage(driver);
            Thread.sleep(3000);
            login.login("Admin", "admin123");
            Thread.sleep(5000);
            Assert.assertTrue(login.isDashboardDisplayed(), "Dashboard is not displayed after login");

    }


        @Test
        public void searchEmployeeTest() throws InterruptedException {
            empPage = new employeePage(driver);
            empPage.searchEmployee("Animesh");
           // Thread.sleep(3000);

        }


    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
