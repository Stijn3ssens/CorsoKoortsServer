package stijn_driessens.corsokoorts.frontend;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BuurtschappenPageTests extends FrontendTests {

    @BeforeAll
    public static void beforeAll() {
        setupDriver("buurtschappen");
    }

    @Test
    public void getTitlesOfPage() {
        getTitleOfPage("Buurtschappen");
    }

}