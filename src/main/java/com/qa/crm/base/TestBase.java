package com.qa.crm.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    public static Properties prop;

    public TestBase() {

        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream("E:\\Automation\\pageObject\\src\\main\\java\\" +
                    "com\\qa\\crm\\config\\config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        public static void initialization() {

            String browserName = prop.getProperty("browser");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get(prop.getProperty("url"));

        }
}
