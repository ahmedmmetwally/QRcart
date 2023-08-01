package findElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementById {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

//        By id=By.id("el_1662364342087_375");
//        WebElement webElement=driver.findElement(id);
//        String title=webElement.getText();

//        driver.get("https://qacart.com/");
//        String title=driver.findElement(id).getText();

//        driver.get("chrome://settings/help");    //there is an error
//        String title=driver.findElement(By.className("secondary")).getText();  //there is an error

        driver.get("https://qacart.com/");
        String title=driver.findElement(By.xpath("//div[@id='el_1662364342087_375']")).getText();
        Boolean isDisplayed=driver.findElement(By.xpath("//h1[@id='el_1662364342086_374']")).isDisplayed();
        Boolean isEnable=driver.findElement(By.xpath("//h1[@id='el_1662364342086_374']")).isEnabled();
        String attribute=driver.findElement(By.xpath("//div[@id='el_1662364342087_375']")).getAttribute("data-magic");
        String tagName=driver.findElement(By.xpath("//div[@id='el_1662364342087_375']")).getTagName();
        String cssValueForFont=driver.findElement(By.xpath("//div[@id='el_1662364342087_375']")).getCssValue("font-family");
        Point location=driver.findElement(By.xpath("//div[@id='el_1662364342087_375']")).getLocation();
        Dimension dimension=driver.findElement(By.xpath("//div[@id='el_1662364342087_375']")).getSize();
        Rectangle rectangle=driver.findElement(By.xpath("//div[@id='el_1662364342087_375']")).getRect(); //(location and size)
       // String ariaRole=String title = driver.findElement(By.cssSelector("#el_1662364342087_375")).getAriaRole();



        int xAxis=location.x;
        int yAxis=location.y;

        int width=dimension.width;
        int height=dimension.height;

        System.out.println(title);
        System.out.println("is display = "+isDisplayed);
        System.out.println("is enable = "+isEnable);
        System.out.println("attribute = "+attribute);
        System.out.println("tagName  = "+tagName);
        System.out.println("cssValueForFont  = "+cssValueForFont);
        System.out.println("distance from x aixs  = "+xAxis);
        System.out.println("distance from x yixs  = "+yAxis);
        System.out.println("the width   = "+width);
        System.out.println("the height   = "+height);
        System.out.println("distance from x aixs (rectangler) = "+rectangle.x);
        System.out.println("distance from x yixs (rectangler)   = "+rectangle.y);
        System.out.println("the width  (rectangler)  = "+rectangle.width);
        System.out.println("the height  (rectangler)  = "+rectangle.height);

        driver.quit();

    }
}
