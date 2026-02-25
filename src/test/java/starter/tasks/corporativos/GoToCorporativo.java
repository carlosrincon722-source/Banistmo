package starter.tasks.corporativos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import starter.ui.personaUi.PersonaUi;

public class GoToCorporativo implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PersonaUi.BUTTON_CORPORATIVOS));
    }


    public static GoToCorporativo goToValue(){
        return Tasks.instrumented(GoToCorporativo.class);
    }
}
