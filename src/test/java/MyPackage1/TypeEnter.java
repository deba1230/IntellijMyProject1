package MyPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TypeEnter
{
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://www.tutorialspoint.com/index.htm");
        // identify element
        WebElement m=driver.findElement(By.id("search-strings"));
        Thread.sleep(4000);
        m.sendKeys("Java");
        // type enter with sendKeys method and pass Keys.ENTER
        m.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.close();
    }
}
