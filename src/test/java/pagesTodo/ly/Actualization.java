package pagesTodo.ly;

import control.*;
import org.openqa.selenium.By;

public class Actualization {

    public Label createdProyect;

    public Image editionImage = new Image(By.xpath("//div[@style='display: block;']/img"));
    public Button editionButton = new Button(By.xpath("//ul[contains(@style,'block')]/li/a[text()='Edit']"));
    public TextBox editionText = new TextBox(By.xpath("//td/div/input[@id='ItemEditTextbox']"));
    public Button submitButton = new Button(By.xpath("//td/div/img[@id='ItemEditSubmit']"));
    public Label editedTitlePreject = new Label(By.id("CurrentProjectTitle"));

    public void setCreatedProyect(String name){
        createdProyect = new Label(By.xpath("//li[last()]//td[text()='"+name+"']"));
    }

    public Control createdProyect() {
        return createdProyect;
    }

}
