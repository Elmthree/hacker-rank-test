package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ServicesPage {

    WebDriver myDriver;
    WebDriverWait wait;

    public ServicesPage(WebDriver driver, WebDriverWait wait){
        myDriver = driver;
        this.wait = wait;
    }

    public void openServicesPage(){
        myDriver.findElement(By.linkText("SERVICES")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".page-header h1")));
    }

    public String getPageHeader(){
        return myDriver.findElement(By.cssSelector(".page-header h1")).getText();
    }
}
