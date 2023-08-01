package basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseTheBrowser {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //driver.manage().window().fullscreen();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/documentation/webdriver/drivers/remote_webdriver/");
        String title=driver.getTitle();
        System.out.println("current title is : "+title);
        //driver.close(); //close one tab
        driver.quit(); //close all tabs

    }
}
