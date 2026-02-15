package starter.tasks.capitaIinteligente;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.actividadEconomicaUi.CapitalInteligenteUi;
import starter.util.SwitchToNewTab;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class DownloadReportTask implements Task {


   String altImage;

    public DownloadReportTask(String altImage) {
        this.altImage = altImage;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String getUrl= CapitalInteligenteUi.BUTTON_DOWNLOAD_REPORT.of(altImage)
                .resolveFor(actor)
                .getAttribute("href");
        actor.attemptsTo(
                Click.on(CapitalInteligenteUi.BUTTON_DOWNLOAD_REPORT.of(altImage)));
        actor.remember("urlReport",getUrl);

    }


    public static DownloadReportTask downloadReportTask(String altImage){
        return Tasks.instrumented(DownloadReportTask.class,altImage);
    }

}
