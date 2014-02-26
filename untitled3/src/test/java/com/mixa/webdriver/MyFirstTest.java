package com.mixa.webdriver;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by mikhaildzarasov on 2/24/14.
 */
public class MyFirstTest {

   @Test
    public void testing(){
        WebDriver driver = new FirefoxDriver();

       driver.get("https://www.yahoo.com/");



        driver.close();

        driver.quit();

    }
}
