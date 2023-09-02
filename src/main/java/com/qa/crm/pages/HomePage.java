package com.qa.crm.pages;

import com.qa.crm.base.TestBase;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class HomePage extends TestBase {



    public HomePage(){
        PageFactory.initElements(driver, this);
        TestBase.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    /** Actions are hare */


}
