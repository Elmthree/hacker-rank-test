package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AboutPage {

    WebDriver myDriver;
    WebDriverWait wait;

    public AboutPage(WebDriver driver, WebDriverWait wait){
        myDriver = driver;
        this.wait = wait;
    }

    public void openAboutPage(){
        myDriver.findElement(By.linkText("ABOUT")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".page-header h1")));
    }

    public String getPageHeader(){
        return myDriver.findElement(By.cssSelector(".page-header h1")).getText();
    }


}
