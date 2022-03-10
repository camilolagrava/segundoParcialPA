package pagesTodo.ly;

import control.Button;
import control.Control;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class Create {

    public Label createdProyect;

    public Label addNewProyect = new Label(By.xpath("//td[text()='Add New Project']"));
    public TextBox proyectName = new TextBox(By.id("NewProjNameInput"));
    public Button newProyectButton= new Button(By.id("NewProjNameButton"));
    public Label createdTitlePreject = new Label(By.id("NewProjNameButto"));

    public void setCreatedProyect(String name){
      createdProyect = new Label(By.xpath("//li[last()]//td[text()='"+name+"']"));
    }

    public Control createdProyect() {
        return createdProyect;
    }
}
