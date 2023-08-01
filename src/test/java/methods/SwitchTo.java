package methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import java.util.Set;

public class SwitchTo {
    public static void main(String[] args) throws InterruptedException {
        //WebDriverManager.chromedriver().setup();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qacart.com/");
        WebElement element=driver.findElement(By.id("el_1685982990930_342"));
        String parent=driver.getWindowHandle();
        System.out.println(parent);
        element.click();
        Set<String> windowIds=driver.getWindowHandles(); //must open new tap to print difrrnet id
        System.out.println(windowIds);
        Thread.sleep(3000);
        driver.close();




//
//
//
//
//        driver.get("http://transmission-dev.azurewebsites.net/login");
//        WebElement usernameField = driver.findElement(By.xpath("//input[@name=\"email\"]"));
//        WebElement passwordField = driver.findElement(By.xpath("//input[@name=\"password\"]"));
//        usernameField.sendKeys(new CharSequence[]{"testbotitb2@dist.com"});
//        passwordField.sendKeys(new CharSequence[]{"123456"});
//        WebElement loginButton = driver.findElement(By.xpath("//input[@class='button-input newd']"));
//
//        String parent=driver.getWindowHandle();
//        System.out.println(parent+"parent id");
//        loginButton.click();
//        Set<String> windowIds=driver.getWindowHandles();
//        System.out.println(driver.getWindowHandles());
//
//        for(String id:windowIds){
//            if(!id.equalsIgnoreCase(parent)){
//                System.out.println(driver.getTitle());
//                driver.switchTo().window(id);
//               // String child=driver.getWindowHandle();
//                System.out.println(driver.getTitle());
//                driver.switchTo().window(parent);
//                System.out.println(driver.getTitle());
//
//            }
//        }
//        SoftAssert softAssert= new SoftAssert();
//        String actualWord="Catalog";
//        softAssert.equals(actualWord);
//        System.out.println("this softAssert");
//        softAssert.assertAll();

       // driver.quit();
    }
}
