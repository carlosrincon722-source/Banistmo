package starter.tasks.capitalinteligente;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.actividadEconomicaUi.CapitalInteligenteUi;
import starter.util.SwitchToNewTab;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class GoToActividadEconomicaTask implements Task {




    @Override
    public <T extends Actor > void performAs(T actor) {
        actor.attemptsTo(
                SwitchToNewTab.now(),
                WaitUntil.the(CapitalInteligenteUi.BUTTON_ACTIVIDAD_ECONOMICA, isPresent()).forNoMoreThan(60).seconds(),
                Click.on(CapitalInteligenteUi.BUTTON_ACTIVIDAD_ECONOMICA));
    }


    public static GoToActividadEconomicaTask goToActividadEconomica(){
        return Tasks.instrumented(GoToActividadEconomicaTask.class);
    }
}
