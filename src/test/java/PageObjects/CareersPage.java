package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CareersPage {

    WebDriver myDriver;
    WebDriverWait wait;

    public CareersPage(WebDriver driver, WebDriverWait wait){
        myDriver = driver;
        this.wait = wait;
    }

    public void openCareersPage(){
        myDriver.findElement(By.linkText("CAREERS")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".page-header h1")));
    }

    public String getPageHeader(){
        return myDriver.findElement(By.cssSelector(".page-header h1")).getText();
    }

    public int getNumberOfBlogListing(){
        List<WebElement> blogListing =  myDriver.findElements(By.cssSelector(".bloglisting li"));
        return blogListing.size();
    }
}
