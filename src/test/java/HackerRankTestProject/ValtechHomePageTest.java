package HackerRankTestProject;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValtechHomePageTest {

    WebDriver myDriver;
    WebDriverWait wait;


    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        myDriver = new ChromeDriver();
        wait = new WebDriverWait(myDriver, 30);
    }

    @After
    public void tearDown(){
        myDriver.quit();
    }

    @Test
    public void checkLatestNewsTest(){
        myDriver.navigate().to("http://www.valtech.com");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".navigation__menu__bg")));
        Assert.assertTrue(myDriver.findElement(By.cssSelector("div.bloglisting.news-post__listing")).isDisplayed());

        myDriver.findElement(By.linkText("ABOUT")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("header.page-header h1")));
        Assert.assertEquals(myDriver.findElement(By.cssSelector("header.page-header h1")).getText(), "About");
        myDriver.findElement(By.linkText("SERVICES")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("header.page-header h1")));
        Assert.assertEquals(myDriver.findElement(By.cssSelector("header.page-header h1")).getText(), "Services");
        myDriver.findElement(By.linkText("WORK")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("header.page-header h1")));
        Assert.assertEquals(myDriver.findElement(By.cssSelector("header.page-header h1")).getText(), "Work");

    }
}
