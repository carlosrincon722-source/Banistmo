package starter.questions.pdfview;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class IsCurrentPage implements Question<Boolean> {

    private final String expectedUrl;

    public IsCurrentPage(String expectedUrl) {
        this.expectedUrl = expectedUrl;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        // Obtiene la URL actual del navegador
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        String currentUrl = driver.getCurrentUrl();

        // Compara con la URL esperada
        return currentUrl.equalsIgnoreCase(expectedUrl);
    }

    // Helper para crear la Question de forma legible
    public static IsCurrentPage equalTo(String expectedUrl) {
        return new IsCurrentPage(expectedUrl);
    }
}
