package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class LaunchBrowser {

    @Test
     public void launch() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish Raghuram\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");

// Initialize browser
        WebDriver driver = new ChromeDriver();

         System.out.println("driver" +driver);
// Open facebook
        driver.get("http://www.facebook.com");

         System.out.println("Navigated to facebook page");

// Maximize browser

        driver.manage().window().maximize();
         System.out.println("before Closing the driver");
        driver.close();

         System.out.println("Closing the driver");
    }

}

