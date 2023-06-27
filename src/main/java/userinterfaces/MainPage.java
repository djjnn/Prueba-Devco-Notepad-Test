package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.online-notepad.net/")
public class MainPage extends PageObject {

    public static final Target BotonNotaTextoEnriquecido = Target.the("Boton de nota de texto enriquecido").located(By.id("richtextnote-tab"));
    public static final Target BotonNegrita = Target.the("Boton de negrita de texto enriquecido").located(By.xpath("//button[@aria-pressed='false']"));
    //public static final Target BotonNegrita = Target.the("Boton de negrita de texto enriquecido").located(By.xpath("//button/span[contains(text(),'Bold')]"));
    public static final Target CampoTexto= Target.the("Campo de nota de texto enriquecido").located(By.id("editor"));

}

