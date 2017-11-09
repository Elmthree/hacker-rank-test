package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    WebDriver myDriver;
    WebDriverWait wait;
    String homePageUrl = "http://www.valtech.com";

    public HomePage(WebDriver driver, WebDriverWait wait){
        myDriver = driver;
        this.wait = wait;
    }

    public void loadHomePage(){
        myDriver.navigate().to(homePageUrl);
        myDriver.manage().window().maximize();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".navigation__menu__bg")));
    }

    public Boolean isLatesNewsDispplayed(){
        return myDriver.findElement(By.cssSelector("div.bloglisting.news-post__listing")).isDisplayed();
    }
}
