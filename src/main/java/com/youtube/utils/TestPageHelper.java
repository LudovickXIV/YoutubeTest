package com.youtube.utils;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class TestPageHelper {

    public static void delayQuit(WebDriver driver, TimeUnit timeUnit, int delay) {
        new Thread(() -> {
            try {
                Thread.sleep(timeUnit.toMillis(delay));
                driver.quit();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                driver.quit();
            }
        }).start();
    }
}
