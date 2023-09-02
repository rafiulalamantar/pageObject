package com.qa.crm.pages;

import com.qa.crm.base.TestBase;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {



    public HomePage(){
        PageFactory.initElements(driver, this);
    }

}
