package basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

import static javax.swing.Spring.height;
import static javax.swing.Spring.width;

public class WindoSize {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //driver.manage().window().fullscreen();
        //driver.manage().window().maximize();
        //Dimension iPhoneS4=new Dimension(width(375),height(667));
       // driver.manage().window().setSize(iPhoneS4);
         driver.get("https://www.selenium.dev/documentation/webdriver/drivers/remote_webdriver/");

    }
}
