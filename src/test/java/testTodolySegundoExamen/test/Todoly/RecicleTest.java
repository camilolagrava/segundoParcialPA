package testTodolySegundoExamen.test.Todoly;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pagesTodo.ly.LoginModal;
import pagesTodo.ly.MainPage;
import pagesTodo.ly.MenuSection;
import testCleanTodo.ly.BaseTodoLy;
import testTodolySegundoExamen.pages.Todoly.UserPage;

public class RecicleTest extends BaseTodoLy {
    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    MenuSection menuSection = new MenuSection();
    UserPage userPage =  new UserPage();

    @Test
    public void verifyLoginTodoLy(){
        mainPage.loginImage.click();
        loginModal.emailTxtBox.setText("ejercicio@gmail.com");
        loginModal.pwdTxtBox.setText("12345");
        loginModal.loginButton.click();
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR no se pudo hacer el login");
    }

    @Test
    public void verifyRecicleTodoly()throws InterruptedException{
        verifyLoginTodoLy();
        userPage.botonReciclaje.click();
        Thread.sleep(1000);
        userPage.botonReciclajeOculto.click();
        Thread.sleep(1000);
        userPage.botonReciclajePesplegable.click();
        Thread.sleep(2000);
        Assertions.assertTrue(userPage.mensajedeConfirmacionReciclaje.isControlDisplayed(),
                "No se pudo recilar la papelera");
    }



}