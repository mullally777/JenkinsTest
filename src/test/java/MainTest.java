import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {
    @Test
    public static void testTitle() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/");
        Assert.assertEquals(driver.getTitle(), "Sign in [Jenkins]");
        driver.quit();
    }

}
