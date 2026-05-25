package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basePage {

    public WebDriver driver;

    public void openBrowser() {
        // Code to initialize the WebDriver and open the browser
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void navigateTo(String url) {
        // Code to navigate to a specific URL
        driver.get(url);
    }
}
