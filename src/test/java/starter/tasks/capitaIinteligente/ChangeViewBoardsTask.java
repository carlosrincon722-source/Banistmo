package starter.tasks.capitaIinteligente;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import starter.ui.actividadEconomicaUi.CapitalInteligenteUi;

public class ChangeViewBoardsTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CapitalInteligenteUi.BUTTON_CHANGE_VIEW_BOARDS));
    }


    public static ChangeViewBoardsTask changeViewBoardsTask(){
        return Tasks.instrumented(ChangeViewBoardsTask.class);
    }

}
