package com.qa.crm.pages;

import com.qa.crm.base.TestBase;
import org.openqa.selenium.support.PageFactory;

<<<<<<< HEAD
=======
import java.util.concurrent.TimeUnit;

>>>>>>> cefc44d (Add Action to home page)
public class HomePage extends TestBase {



    public HomePage(){
        PageFactory.initElements(driver, this);
<<<<<<< HEAD
=======
        TestBase.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    /** Actions are hare */

    public String pageTitle(){
        return driver.getTitle();
>>>>>>> cefc44d (Add Action to home page)
    }

}
