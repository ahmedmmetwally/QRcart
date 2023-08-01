package basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Back_Forword_Fresh {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //driver.manage().window().fullscreen();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.navigate().to("https://www.qacart.com");
        String title=driver.getTitle();
        System.out.println("current title is : "+title);
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.close();

    }
}
