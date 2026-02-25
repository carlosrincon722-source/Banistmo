package starter.tasks.capitaIinteligente;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;
import starter.ui.actividadEconomicaUi.CapitalInteligenteUi;

public class SelectReportTask  implements Task {

    String nameReport;

    public SelectReportTask(String nameReport) {
        this.nameReport = nameReport;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Target report = CapitalInteligenteUi.OPEN_REPORT_NAME.of(nameReport);
        actor.attemptsTo(Scroll.to(report),Click.on(report));
    }


    public static SelectReportTask selectreporttask(String nameReport){
        return Tasks.instrumented(SelectReportTask.class,nameReport);
    }
}
