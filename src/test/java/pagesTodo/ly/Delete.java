package pagesTodo.ly;

import control.Button;
import control.Control;
import control.Image;
import control.Label;
import org.openqa.selenium.By;

public class Delete {

    public Label createdProyect;

    public Image editionImage = new Image(By.xpath("//div[@style='display: block;']/img"));
    public Button editionButton = new Button(By.xpath("//ul[contains(@style,'block')]/li/a[text()='Edit']"));
    public Button deleteButton = new Button(By.id("ProjShareMenuDel"));
    public Label titleProject = new Label(By.id("CurrentProjectTitle"));

    public void setCreatedProyect(String name){
        createdProyect = new Label(By.xpath("//li[last()]//td[text()='"+name+"']"));
    }

    public Control getCreatedProyect() {
        return createdProyect;
    }

}
