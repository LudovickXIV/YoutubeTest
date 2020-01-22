package com.base;

import com.youtube.pages.LoginPage;
import com.youtube.pages.YoutubeHomePage;
import com.youtube.utils.TestPageHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    private WebDriver driver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");

        YoutubeHomePage youtubeHomePage = new YoutubeHomePage(driver);
        TestPageHelper.delayQuit(driver, TimeUnit.SECONDS, 5);
    }

    public static void main(String[] args) {
        BaseTest baseTest = new BaseTest();
        baseTest.setUp();
    }
}
