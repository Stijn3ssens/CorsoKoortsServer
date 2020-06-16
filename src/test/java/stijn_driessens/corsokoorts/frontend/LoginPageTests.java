package stijn_driessens.corsokoorts.frontend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPageTests extends FrontendTests {

    @BeforeAll
    public static void beforeAll()
    {
        setupDriver("login");
    }

    @Test
    public void getTitlesOfPage() {
        getTitleOfPage("Login");
    }

    @Test
    public void testForUsernameInputField()
    {
        List<WebElement> inputs = driver.findElements(By.tagName("ion-input"));

        //Tests the username input
        Assertions.assertEquals("USERNAME", inputs.get(0).getAttribute("name").toUpperCase());
        Assertions.assertEquals("true", inputs.get(0).getAttribute("required"));
    }

    @Test
    public void testForPasswordInputField()
    {
        List<WebElement> inputs = driver.findElements(By.tagName("ion-input"));

        //Tests the password input
        Assertions.assertEquals("PASSWORD", inputs.get(1).getAttribute("name").toUpperCase());
        Assertions.assertEquals("true", inputs.get(1).getAttribute("required"));
    }

    @Test
    public void testForSubmitButton()
    {
        List<WebElement> form = driver.findElements(By.tagName("form"));
        List<WebElement> buttons = driver.findElements(By.tagName("ion-button"));

        //Test if there is a form
        Assertions.assertEquals(1, form.size());
        //Test the button
        Assertions.assertEquals("submit", buttons.get(0).getAttribute("type"));
        Assertions.assertEquals("LOGIN", buttons.get(0).getText().toUpperCase());
    }
}