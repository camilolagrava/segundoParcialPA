package testTodolySegundoExamen.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pagesTodo.ly.LoginModal;
import pagesTodo.ly.MainPage;
import pagesTodo.ly.MenuSection;
import testCleanTodo.ly.BaseTodoLy;
import testTodolySegundoExamen.pages.UserPage;

public class RecicleTest extends BaseTodoLy {
    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    MenuSection menuSection = new MenuSection();
    UserPage userPage = new UserPage();

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
    public void verifyRecicleTodoly(){

    }
}