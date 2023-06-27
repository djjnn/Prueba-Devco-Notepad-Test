package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterfaces.MainPage;

public class NotaTextoEnriquecido implements Task {

    private final String Text;

    public NotaTextoEnriquecido(String text){
        this.Text=text;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(MainPage.BotonNotaTextoEnriquecido).andAlignToTop(),
                Click.on(MainPage.BotonNotaTextoEnriquecido),
                //Click.on(MainPage.BotonNegrita),
                Enter.theValue(Text).into(MainPage.CampoTexto)
        );

    }

    public static NotaTextoEnriquecido ingresarTexto(String text){
        return Tasks.instrumented(NotaTextoEnriquecido.class, text);
    }
}

