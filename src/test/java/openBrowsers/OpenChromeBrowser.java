package openBrowsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {
    public static void main(String[] args) {
        // System.setProperty("webdriver.chrome.driver","src\test\resources\chromedriver");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
    }
}
