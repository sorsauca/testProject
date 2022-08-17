import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class OpenBrowser {
    private WebDriver driver;
    private String link = "https://qa-practice.netlify.app/";

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

    }
}
