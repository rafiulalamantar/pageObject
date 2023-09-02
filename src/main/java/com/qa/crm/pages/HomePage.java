package com.qa.crm.pages;

import com.qa.crm.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    @FindBy(className = "user-display")
    WebElement displayUserName;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    /**
     * Actions are hare
     *
     * @return
     */
    public String VerifyDisplayTitle(){
        return driver.getTitle();
    }



}
