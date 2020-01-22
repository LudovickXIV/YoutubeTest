package com.youtube.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage implements PageActions {

    @FindBy(xpath = "//div[@id='dismissable']")
    private WebElement el;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public Object clickButton(WebElement element) {
        return null;
    }
}
