package methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://transmission-dev.azurewebsites.net/login");
        driver.findElement(By.cssSelector("[name=\"email\"]")).sendKeys("testbotitb2@dist.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        System.out.println("name/email");
        driver.quit();
    }
}
