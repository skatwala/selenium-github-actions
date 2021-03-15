import org.testng.Assert;
import org.testng.annotations.Test;

public class UserLoginTest extends TestBase {

    @Test
    public void userLogin() {
        System.out.println("Current URL is:" + driver.getCurrentUrl());
        loginPage= new LoginPageObject(driver);
        //loginPage.typeEmailId(username);
        ///loginPage.typePassword(password);
        //loginPage.clickLoginButton();
        System.out.println("Current URL is:" + driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("Login"));
    }
}
