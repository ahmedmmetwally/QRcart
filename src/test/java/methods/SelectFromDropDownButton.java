package methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.DriverManager;

public class SelectFromDropDownButton {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://transmission-dev.azurewebsites.net/login");
        WebElement usernameField = driver.findElement(By.xpath("//input[@name=\"email\"]"));
        WebElement passwordField = driver.findElement(By.xpath("//input[@name=\"password\"]"));
        usernameField.sendKeys(new CharSequence[]{"testbotitb2@dist.com"});
        passwordField.sendKeys(new CharSequence[]{"123456"});
        WebElement loginButton = driver.findElement(By.xpath("//input[@class='button-input newd']"));
        loginButton.click();
       // driver.get("http://transmission-dev.azurewebsites.net/");



        WebElement element=driver.findElement(By.xpath("//select[@id='branch_layout_ids']"));
        Select select=new Select(element);
        //select.selectByIndex(2);
        //select.selectByValue("33");
        select.selectByVisibleText("Choose branch");


        System.out.println("dfffffffffffff");
    }
}
