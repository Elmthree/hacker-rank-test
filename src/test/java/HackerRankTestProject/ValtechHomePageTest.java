package HackerRankTestProject;

import PageObjects.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class ValtechHomePageTest {

    WebDriver myDriver;
    WebDriverWait wait;
    HomePage homePage;
    CareersPage careersPage;
    AboutPage aboutPage;
    WorkPage workPage;
    ServicesPage servicesPage;


    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        myDriver = new ChromeDriver();
        wait = new WebDriverWait(myDriver, 30);
        homePage = new HomePage(myDriver, wait);
        careersPage = new CareersPage(myDriver, wait);
        workPage = new WorkPage(myDriver, wait);
        aboutPage = new AboutPage(myDriver, wait);
        servicesPage = new ServicesPage(myDriver, wait);
    }

    @After
    public void tearDown(){
        myDriver.quit();
    }

    @Test
    public void checkValtechPagesTest(){
        homePage. loadHomePage();
        Assert.assertTrue(homePage.isLatesNewsDispplayed());

        aboutPage.openAboutPage();
        Assert.assertEquals(aboutPage.getPageHeader(), "About");

        servicesPage.openServicesPage();
        Assert.assertEquals(servicesPage.getPageHeader(), "Services");

        workPage.openWorkPage();
        Assert.assertEquals(workPage.getPageHeader(), "Work");

        careersPage.openCareersPage();
        Assert.assertEquals(careersPage.getPageHeader(), "Careers");

        System.out.println("Number of blog listings is : " + careersPage.getNumberOfBlogListing());
    }
}
