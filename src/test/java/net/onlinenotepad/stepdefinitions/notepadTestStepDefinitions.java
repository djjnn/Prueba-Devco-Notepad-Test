package net.onlinenotepad.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ValidateTextField;
import tasks.NotaTextoEnriquecido;
import userinterfaces.MainPage;
import utils.Constanst;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.core.StringContains.containsString;

public class notepadTestStepDefinitions {

    @Before
    public void setup(){
        setTheStage(new OnlineCast());
    }

    @Given("nececisto ingresar a la plataforma de notepadOnline")
    public void necesitoIngresarALaPlataformaDeNotepadOnline() {
        theActorCalled(Constanst.ACTOR_NAME).wasAbleTo(Open.browserOn(new MainPage()));

    }

    @When("creo una nota de texto enriquecida {string} en letra en negrita")
    public void creoUnaNotaDeTextoEnriquecidaConLetraEnNegrita(String text) {
        theActorInTheSpotlight().attemptsTo(NotaTextoEnriquecido.ingresarTexto(text));
    }



    @Then("valido el ingreso del texto {string}")
    public void validoElIngresoDelTexto(String text) {
       theActorInTheSpotlight().should(seeThat(ValidateTextField.getText(MainPage.CampoTexto), containsString(text)));
    }


}