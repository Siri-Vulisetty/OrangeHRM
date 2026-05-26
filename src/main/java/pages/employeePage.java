package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.basePage;
import utils.commonMethods;

public class employeePage extends basePage {

    WebDriver driver;
    commonMethods commonMethods;
    public employeePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);


    }

    @FindBy(xpath = "//span[text()='PIM']/parent::a")
    public WebElement pimBtn;

    @FindBy(xpath = "//label[text()='Employee Name']/parent::div/following::div[3]/input")
    public WebElement employeeNameInput;

    @FindBy(xpath = "//button[text()=' Search ']")
    public WebElement searchBtn;


    public void clickPimBtn() {
        commonMethods = new commonMethods();
        commonMethods.waitForElement(pimBtn,30);
       // ..  commonMethods.javaScriptClick(pimBtn);
        pimBtn.click();
    }

    public void enterEmployeeName(String empName) throws InterruptedException {
        commonMethods.waitForElement(employeeNameInput,30);
        employeeNameInput.sendKeys(empName);
    }

    public void clickSearchBtn() {
        searchBtn.click();
    }

    public void searchEmployee(String empName) throws InterruptedException {
       // Thread.sleep(3000);
        clickPimBtn();
        enterEmployeeName(empName);
        clickSearchBtn();
    }


}
