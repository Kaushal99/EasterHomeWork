package Test123;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class NewProject extends Utils {




        @Before
        public void setUp () {
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\Test123\\BrowserDrivers\\chromedriver.exe");

        driver = new ChromeDriver();
        //implicit wait applied to driver instance which will be applied to driver until driver instance
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //driver to get URL
        driver.get("https://demo.nopcommerce.com/");
    }

        @Test
        public void userShouldBeRegister () throws ParseException {

        //driver.findElement(By.xpath("//a[@class='ico-register']")).click();
//
//            //
        //dropDownPresent(By.xpath("//select[@name='DateOfBirthMonth']"),"May");
        //WebDriverWait wait = new WebDriverWait(driver, 10);

        //scrollViewElement(By.xpath("//select[@name='DateOfBirthMonth']"));

        //scrollElementClick(By.xpath("//select[@name='DateOfBirthMonth']"));

//            getCssPropertyElement(By.xpath("//select[@name='DateOfBirthMonth']"));
//          // browserScreenshot();
//           currentDisplayScreenShot();

            converDate();

        System.out.println("Kaushal");


    }

        @After
        public void shutIt()
        {

        driver.quit();

    }


}


