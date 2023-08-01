package findElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByCssSelector {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://qacart.com/");
        String title = driver.findElement(By.cssSelector("#el_1662364342087_375")).getText();

        String title2 = driver.findElement(By.cssSelector("[data-node-type=buttonWrapper]")).getText();

       // String elementFromArray = driver.findElements(By.cssSelector(".dfdf")).get(4).getText();

        //class =>".ddderer"
        //id=>"#fdfere"
        //"[data-node-type=buttonWrapper]"

       // "[data-node-type=buttonWrapper usespace .fdfdf]" //space refare to direct parent
        // "[data-node-type=buttonWrapper > .fdfdf]" //> refare to any parent call data-node-type=buttonWrapper
        //("#el_1662364342087_375" jkjk:nth-of-type(index)) //this will get the element number 7 from the array by using nth-...
        System.out.println(title);

        System.out.println(title2+"using attribute");


        driver.quit();
    }
    }
