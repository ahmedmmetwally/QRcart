package findElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Click {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://qacart.com/");

        WebElement element=driver.findElement(By.cssSelector("#menuItem_1686499159773_338"));
        Actions actions=new Actions(driver);
        //actions.doubleClick(element).perform();
        //actions.contextClick(element).perform();  //right click
        actions.moveToElement(element).perform();

/*        //drag and drop
        WebElement source=driver.findElement(By.cssSelector("#component_1604315730724_43"));
        WebElement distination=driver.findElement(By.cssSelector("#menuItem_1686499138773_337"));
        actions.dragAndDrop(source,distination).perform();*/

/*                //drag and drop anthor way;
        WebElement source=driver.findElement(By.cssSelector("#component_1604315730724_43"));
        WebElement distination=driver.findElement(By.cssSelector("#menuItem_1686499138773_337"));
        actions.clickAndHold(source).moveToElement(distination).release().build().perform();*/

    }
}
