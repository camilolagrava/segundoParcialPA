package testTodolySegundoExamen.pages.Todoist;

import control.Button;
import control.Image;
import org.openqa.selenium.By;

public class Userpage {
    public Image userImage = new Image(By.xpath("//img[@class='user_avatar big settings_avatar']"));
    // Menu desplegable
    public Button logouthButton = new Button(By.id("id-15s3pj-20"));
}
