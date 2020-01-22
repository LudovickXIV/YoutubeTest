package com.youtube.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YoutubeHomePage extends BasePage implements PageActions {

    @FindBy(id = "guide-button")
    private WebElement hamburgerMenu;

    @FindBy(id = "logo-icon-container")
    private WebElement logoHomepage;

    @FindBy(xpath = "//input[@name='search_query']")
    private WebElement searchField;

    @FindBy(css = "#search-icon-legacy.ytd-searchbox")
    private WebElement searchButton;

    @FindBy(xpath = "//button[@aria-label='Create a video or post']")
    private WebElement createVideoButton;

    @FindBy(xpath = "//button[@aria-label='YouTube apps']")
    private WebElement youtubeApps;

    @FindBy(xpath = "//a[@class='yt-simple-endpoint style-scope ytd-notification-topbar-button-renderer']")
    private WebElement notification;

    @FindBy(xpath = "//paper-button[@class='style-scope ytd-button-renderer style-suggestive size-small']")
    private WebElement loginButton;


    public YoutubeHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getHamburgerMenu() {
        return hamburgerMenu;
    }

    public WebElement getLogoHomepage() {
        return logoHomepage;
    }

    public WebElement getSearchField() {
        return searchField;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getCreateVideoButton() {
        return createVideoButton;
    }

    public WebElement getYoutubeApps() {
        return youtubeApps;
    }

    public WebElement getNotification() {
        return notification;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    @Override
    public Object clickButton(WebElement element) {
        switch (element.getAttribute("id")) {
            case "button":
                element.click();
                return new LoginPage(driver);
            case "search-icon-legacy":
                element.click();
                return new SearchPage(driver);
            case "logo-icon-container":
                System.out.println(element.getAttribute("title"));;
                element.click();
                return this;
            default:
                element.click();
                return this;
        }
    }
}
