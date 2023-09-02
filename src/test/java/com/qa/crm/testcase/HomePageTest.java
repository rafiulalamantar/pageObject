package com.qa.crm.testcase;

import com.qa.crm.base.TestBase;
import com.qa.crm.pages.HomePage;
import com.qa.crm.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;

    public HomePageTest(){
        super();
    }
    @BeforeMethod
    public void setup() {
        initialization();
        loginPage = new LoginPage();
        homePage=loginPage.login(prop.getProperty("email"),prop.getProperty("password"));
    }
    @Test
    public void verifyTitleTest(){
       String title= homePage.VerifyDisplayTitle();
       System.out.println(title);
       Assert.assertEquals(title,"Cogmento CRM");
    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }

}
