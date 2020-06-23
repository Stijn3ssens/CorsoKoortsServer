package stijn_driessens.corsokoorts.frontend;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public abstract class FrontendTests {

    protected static WebDriver driver;

    protected static void setupDriver(String path) {
        System.setProperty("webdriver.chrome.driver", "D:\\Programs\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();

        String baseUri = "http://localhost:8100/";
        driver.get(baseUri + path);
    }

    @Test
    public void ionicPage() {
        Assertions.assertEquals("CorsoKoorts", driver.getTitle());
    }

    protected void getTitleOfPage(String expectedTitle) {
        String title = driver.findElement(By.tagName("ion-title")).getText();
        Assertions.assertEquals(expectedTitle.toUpperCase(), title.toUpperCase());
    }

    @AfterAll
    public static void quitBrowser() {
        driver.close();
    }
}
