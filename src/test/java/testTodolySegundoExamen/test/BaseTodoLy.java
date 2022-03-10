package testTodolySegundoExamen.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import singleton.Session;

public class BaseTodoLy {

    public WebDriver driver;
    @BeforeEach
    public void openBrowser(){
        Session.getInstance().getDriver().get("http://todo.ly/");
        driver = Session.getDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }
}
