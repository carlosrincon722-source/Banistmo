package starter.util;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class SwitchToNewTab implements Task {

    public static SwitchToNewTab now() {
        return Tasks.instrumented(SwitchToNewTab.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        WebDriver driver = BrowseTheWeb.as(actor).getDriver();

        // Obtener todas las ventanas abiertas
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

        // Cambiar a la última pestaña abierta
        driver.switchTo().window(tabs.get(tabs.size() - 1));
    }
}
