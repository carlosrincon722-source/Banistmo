package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import starter.navigation.OpenBancolombiaPersona;
import starter.questions.pdfview.IsCurrentPage;
import starter.tasks.capitalinteligente.*;
import starter.tasks.corporativos.GoToCorporativo;
import starter.util.SwitchToNewTab;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class OpenPdfStepDefinitions {

    @Given("the actor opens the Bancolombia portal in the Personas section")
    public void the_actor_opens_the_bancolombia_portal_in_the_personas_section() {
        OnStage.theActorCalled("actor").attemptsTo(OpenBancolombiaPersona.openMainLogin());
    }

    @When("the actor selects the {string} menu")
    public void theActorSelectsTheMenu(String menuName) {
        OnStage.theActorCalled("actor").attemptsTo(GoToCorporativo.goToValue());
    }

    @And("selects the {string} option")
    public void selectsTheOption(String optionName) {
        OnStage.theActorCalled("actor").attemptsTo(GoToCapitalInteligenteTask.goToCapitalInteligente());
    }

    @And("navigates to the {string} section")
    public void navigatesToTheSection(String sectionName) {
        OnStage.theActorCalled("actor").attemptsTo(GoToActividadEconomicaTask.goToActividadEconomica());

    }

    @And("configures the view to display the available reports")
    public void configuresTheViewToDisplayTheAvailableReports() {
        OnStage.theActorCalled("actor").attemptsTo(ChangeViewBoardsTask.changeViewBoardsTask());
    }

    @And("selects the report {string}")
    public void selectsTheReport(String nameReport) {
        OnStage.theActorCalled("actor").attemptsTo(SelectReportTask.selectreporttask(nameReport));

    }

    @And("clicks on the {string}")
    public void clicksOnThe(String altImage) {
        OnStage.theActorCalled("actor").attemptsTo(DownloadReportTask.downloadReportTask(altImage));
    }

    @Then("the system should generate the download of a PDF file")
    public void theSystemShouldGenerateTheDownloadOfAPDFFile() {
        String saveUrl=OnStage.theActorCalled("actor").recall("urlReport");
        OnStage.theActorCalled("actor").attemptsTo( SwitchToNewTab.now());
        OnStage.theActorCalled("actor").should(seeThat(IsCurrentPage.equalTo(saveUrl),is(true)));
    }
}
