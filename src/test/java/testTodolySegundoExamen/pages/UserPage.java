package testTodolySegundoExamen.pages;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class UserPage {
    public Label mensajedeConfirmacionReciclaje = new Label(By.xpath("//span[@id='InfoMessageText']"));
    //parte infereior izquierda
    public Button botonReciclaje = new Button(By.id("//td[@itemid='-3']"));
    //desplegables
    public Button botonReciclajePesplegable = new Button(By.xpath("//ul[@id='recycleContextMenu']"));
    public Button botonReciclajeOculto = new Button(By.xpath("//li[@itemid=\"-3\"]//td[@class='ItemIndicator']"));
}
