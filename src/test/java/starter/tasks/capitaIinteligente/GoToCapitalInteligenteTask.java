package starter.tasks.capitaIinteligente;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import starter.ui.corporativoUi.CorporativoUi;

public class GoToCapitalInteligenteTask implements Task {




        @Override
        public <T extends Actor > void performAs(T actor) {
            actor.attemptsTo(Click.on(CorporativoUi.BUTTON_CAPITAL_INTELIGENTE));
        }


        public static GoToCapitalInteligenteTask goToCapitalInteligente(){
            return Tasks.instrumented(GoToCapitalInteligenteTask.class);
        }
}
