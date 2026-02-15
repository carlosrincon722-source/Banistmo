package starter.ui.actividadEconomicaUi;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CapitalInteligenteUi {

    public static Target BUTTON_ACTIVIDAD_ECONOMICA= Target.the("button actividad economica").located(By.xpath("//a[@title='Actualidad económica']"));
    public static Target BUTTON_CHANGE_VIEW_BOARDS= Target.the("button change view boards").located(By.id("btnGrid"));
    public static final Target OPEN_REPORT_NAME = Target.the("Report by name").locatedBy("(//a[normalize-space()='{0}'])[1]");

    public static final Target BUTTON_DOWNLOAD_REPORT = Target.the("Download report").locatedBy("//a[img[@alt='{0}']]");


}
