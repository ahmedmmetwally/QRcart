package findElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByXPaht {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://qacart.com/");
        String title=driver.findElement(By.xpath("//div[@id='el_1662364342087_375']")).getText();

        driver.get("https://qacart.com/");
        String title2=driver.findElement(By.xpath("//div[contains(@id,'el_16623643')]")).getText();

        driver.get("https://qacart.com/");
        String title3=driver.findElement(By.xpath("//div[text()='Choose your language!']")).getText();

        driver.get("https://qacart.com/");
        String title4=driver.findElement(By.xpath("//div[contains(text(),'Choose your language!')]")).getText();


        System.out.println(title);
        System.out.println(title2 + "using XPath contains ");
        System.out.println(title3 + "using XPath text using text");
        System.out.println(title4 + "using XPath text using contains with text");
        driver.quit();

    }
}
