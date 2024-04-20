package MyPackage1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvents
{
    public static void main(String[] args) throws InterruptedException {
        // Initialize ChromeDriver
        // Here we assume that the ChromeDriver path has been set in the System Global variables
        System.setProperty("webdriver.chrome.driver","E:/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //Navigate to the demo site
        driver.get("https://demoqa.com/text-box");
        //Create object of the Actions class
        //Actions actions = new Actions(driver);

        // Enter the Full Name
        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("Mr.Peter Haynes");

        //Enter the Email
        WebElement email=driver.findElement(By.id("userEmail"));
        email.sendKeys("PeterHaynes@toolsqa.com");
        Thread.sleep(2000);
        // Enter the Current Address
        WebElement currentAddress=driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("43 School Lane London EC71 9GO");
        Thread.sleep(3000);
        WebElement sub=driver.findElement(By.id("submit"));

        // Copy the Current Address using CTRL + C
        currentAddress.sendKeys(Keys.CONTROL);
        currentAddress.sendKeys("A");
        currentAddress.sendKeys(Keys.CONTROL);
        currentAddress.sendKeys("C");
        //Press the TAB Key to Switch Focus to Permanent Address
        currentAddress.sendKeys(Keys.TAB);
        //Paste the Address in the Permanent Address field
        WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys(Keys.CONTROL);
        permanentAddress.sendKeys("V");
        //Thread.sleep(3000);
        //actions.moveToElement(sub).click().perform();
        sub.sendKeys(Keys.ENTER);
        //Compare Text of current Address and Permanent Address
       // assertEquals(currentAddress.getAttribute("value"),permanentAddress.getAttribute("value"));
        Thread.sleep(3000);
        driver.close();

    }
}
