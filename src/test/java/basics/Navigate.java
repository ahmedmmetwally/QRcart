package basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //driver.manage().window().fullscreen();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.navigate().to("https://www.selenium.dev/documentation/webdriver/drivers/remote_webdriver/");
        String title=driver.getTitle();
        System.out.println("current title is : "+title);

    }
}
