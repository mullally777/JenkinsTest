import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {
    @Test
    public static void testTitle() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");  // Обязательно в CI
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.get("http://localhost:8080/");
        Assert.assertEquals(driver.getTitle(), "Sign in [Jenkins]");
        driver.quit();
    }

}
