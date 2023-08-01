package basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //driver.manage().window().fullscreen();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/documentation/webdriver/drivers/remote_webdriver/");
        String title=driver.getTitle();
        System.out.println("current title is : "+title);

    }
}
