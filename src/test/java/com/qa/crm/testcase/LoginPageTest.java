package com.qa.crm.testcase;

import com.qa.crm.base.TestBase;
import com.qa.crm.pages.HomePage;
import com.qa.crm.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;

    public LoginPageTest() {
        super(); /* before initialize it called test base constructor */
    }

    @BeforeMethod
    public void setup() {
        initialization();
        loginPage = new LoginPage(driver);
    }

    @Test(priority=1)
    public void LoginTestTitleTest() {
        String title=loginPage.validateLoginPageTitle();
        System.out.println(title);
        Assert.assertEquals(title,"Free CRM software for customer relationship management, sales, and support.");
    }

    @Test(priority=2)
    public void crmImagelogoTest() {
        boolean flag=loginPage.validateCRMImage();
        Assert.assertTrue(flag);
    }

    @Test(priority=3)
    public void LoginTest() {
        loginPage.login(prop.getProperty("email"),prop.getProperty("password"));

    }
    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
