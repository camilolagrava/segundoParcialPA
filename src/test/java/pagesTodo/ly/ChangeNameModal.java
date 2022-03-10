package pagesTodo.ly;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class ChangeNameModal {

    public Button settingButton = new Button(By.xpath("//a[@href='javascript:OpenSettingsDialog();']"));
    public TextBox inputName = new TextBox(By.id("FullNameInput"));
    public Button okButton = new Button(By.xpath("//span[text()='Ok']"));


}
