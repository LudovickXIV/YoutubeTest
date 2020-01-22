package com.youtube.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage implements PageActions {

    @FindBy(xpath = "//div[@data-view-id='hm18Ec']")
    private WebElement dataView;

    @FindBy(xpath = "//input[@name='identifier']")
    private WebElement emailField;

    @FindBy(xpath = "//div[@id='identifierNext']")
    private WebElement nextLoginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getDataView() {
        return dataView;
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getNextLoginButton() {
        return nextLoginButton;
    }

    public void insertEmail(String email) {
        emailField.sendKeys(email);
    }

    @Override
    public BasePage clickButton(WebElement element) {
        return null;
    }
}
