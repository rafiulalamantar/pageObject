package com.qa.crm.pages;

import com.qa.crm.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static com.qa.crm.base.TestBase.driver;

public class LoginPage {
    @FindBy(name = "email")
    WebElement email;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[3]")
    WebElement loginBtn;

    @FindBy(xpath="//a[contains(text(),'Sign Up')]")
    WebElement signUpBtn;

    @FindBy(xpath="//img[contains(@class,'img-responsive')]")
    WebElement crmLogo;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(TestBase.driver, this);
        TestBase.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

    }

    /* Actions are Here */

    public String validateLoginPageTitle(){
        return driver.getTitle();
    }

    public boolean validateCRMImage(){
        return crmLogo.isDisplayed();
    }
    public HomePage login(String em, String pwd){
        signUpBtn.click();
        email.sendKeys(em);
        password.sendKeys(pwd);
        loginBtn.click();
        return new HomePage();
    }
}
