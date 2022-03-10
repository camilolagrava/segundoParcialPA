package pagesTodoist;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class DeleteProjectModal {
    public Label confirmationRecicleMessaje = new Label(By.xpath("//span[@id='InfoMessageText']"));
    /*lista inferior izquierda*/
    public Button recicleButton = new Button(By.xpath("//li[@itemid='-3']"));
        /*lista deplegable*/
    public Button hideButtonRecicle = new Button(By.xpath("//li[@itemid='-3']"));
    public Button despegableButton = new Button(By.xpath("//ul[@id='recycleContextMenu']"));

}
