package UI;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Core.BaseTest;
import Pages.LoginPage;
import Utils.DataSheet;

public class LoginTests extends BaseTest{

    @Test(priority=1)
    void loginSuccess() throws IOException {
        LoginPage login = new LoginPage(page);
        DataSheet Data = new DataSheet();
        String Username = Data.DataImport(1,0);
        String Password = Data.DataImport(1,1);
        login.login(Username, Password);
        Assert.assertTrue(login.getMessage().contains("You logged into a secure area!"));
    }

    @Test(priority=2)
    void loginFailure() throws IOException {
        LoginPage login = new LoginPage(page);
        DataSheet Data = new DataSheet();
        String Username = Data.DataImport(2,0);
        String Password = Data.DataImport(2,1);
        login.login(Username, Password);
        Assert.assertTrue(login.getMessage().contains("Your username is invalid!"));
    }
}
