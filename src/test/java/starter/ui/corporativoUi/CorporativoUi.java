package starter.ui.corporativoUi;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CorporativoUi {

    public static Target BUTTON_CAPITAL_INTELIGENTE= Target.the("button capital inteligente").located(By.xpath("//a[@class='header-menu_link' and normalize-space()='Capital Inteligente']"));
}
