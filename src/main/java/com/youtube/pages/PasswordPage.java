package com.youtube.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PasswordPage extends BasePage implements PageActions {

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//div[@id='passwordNext']")
    private WebElement nextPasswordButton;

    public PasswordPage(WebDriver driver) {
        super(driver);
    }

    public void insertPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickContinue() {
    }

    @Override
    public Object clickButton(WebElement element) {
        return null;
    }
}
