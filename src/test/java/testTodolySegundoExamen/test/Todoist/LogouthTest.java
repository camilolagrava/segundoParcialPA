package testTodolySegundoExamen.test.Todoist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pagesTodoist.LoginPage;
import pagesTodoist.MainPage;
import pagesTodoist.PersonalPage;
import testTodolySegundoExamen.pages.Todoist.Userpage;

public class LogouthTest extends BaseTodoist {

    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    PersonalPage personalPage = new PersonalPage();
    Userpage userpage =new Userpage();
    String email = "camilolagrava@gmail.com";
    String pass = "contrasenna123";

    @Test
    public void loginTest(){
        mainPage.imagenInicioDeSecion.click();
        loginPage.textoEmail.click();
        loginPage.textoEmail.clearSetText(email);
        loginPage.textoPass.click();
        loginPage.textoPass.clearSetText(pass);
        loginPage.registerButton.click();

        Assertions.assertTrue(personalPage.avatarImage.isControlDisplayed(),
                "Error, loggin no exitoso");
    }

    @Test
    public void logouthTest() throws InterruptedException{
        loginTest();
        userpage.userImage.click();
        userpage.logouthButton.click();
        Thread.sleep(2000);
        Assertions.assertTrue(mainPage.imagenInicioDeSecion.isControlDisplayed(),
                "No se puedo desloggear");
    }


}
