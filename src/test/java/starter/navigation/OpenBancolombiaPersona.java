package starter.navigation;

import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;

public class OpenBancolombiaPersona implements Task {

    private static final EnvironmentVariables ENVIRONMENT_VARIABLES= SystemEnvironmentVariables.createEnvironmentVariables();

    @Override
    public <T extends Actor> void performAs(T actor) {
        String urlWeb= EnvironmentSpecificConfiguration.from(ENVIRONMENT_VARIABLES).getProperty("pages.default");
        actor.attemptsTo(Open.url(urlWeb));
    }

    public static OpenBancolombiaPersona openMainLogin(){
        return Tasks.instrumented(OpenBancolombiaPersona.class);
    }
}

