package methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class ImplicitAndExPlicitWait {
    public static void main(String[] args) {
        //WebDriverManager.chromedriver().setup();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qacart.com/");
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit wait
        new WebDriverWait(driver,5).until(ExpectedConditions.visibilityOfElementLocated(By.id("el_1685982990930_342"))).click();
       // WebElement element=driver.findElement(By.id("el_1685982990930_342"));
       // element.click();

        //Thread.sleep(3000);
        driver.close();
    }
}
