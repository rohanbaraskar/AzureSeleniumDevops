package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

     public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish Raghuram\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");

// Initialize browser
        WebDriver driver = new ChromeDriver();

// Open facebook
        driver.get("http://www.facebook.com");

         System.out.println("Navigated to facebook page");

// Maximize browser

        driver.manage().window().maximize();

        driver.close();

         System.out.println("Closing the driver");
    }

}

