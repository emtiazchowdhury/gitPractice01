import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SeleniumTest {

    public static ChromeOptions options;
    public static WebDriver driver;


    @BeforeTest
    public static void OpeBrowser() {
        options = new ChromeOptions();
        driver = new ChromeDriver(options);
        System.out.println("In BeforeTest");
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
        driver.get("https://www.target.com/");
    }

    @Test
    public void test1() {
        System.out.println("In Test1");
        System.out.println(driver.getTitle());
        driver.close();
        System.out.println("Browser Closed");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Test is now Completed");
    }

}
