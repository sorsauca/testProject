import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class OpenBrowser {
    private WebDriver driver;
    private WebDriverWait wait;
    private String link = "https://qa-practice.netlify.app/";
    private By menuAlerts = By.id("alerts");
    private By buttonAlert = By.id("alert-btn");

    public WebDriver chromeInit (){
        WebDriverManager.chromedriver().setup();
        return driver = new ChromeDriver();
    }

    public WebDriver edgeInit (){
        WebDriverManager.edgedriver().setup();
        return driver = new EdgeDriver();
    }

    public WebDriver firefoxInit (){
        WebDriverManager.firefoxdriver().setup();
        return driver = new FirefoxDriver();
    }


    @Test
    public void test1 (){
        chromeInit();
        driver.get(link);
        driver.manage().window().maximize();
        WebElement alert = driver.findElement(menuAlerts);
        alert.click();
        WebElement bttnAlert = driver.findElement(buttonAlert);
        bttnAlert.click();
        driver.quit();

    }
}
