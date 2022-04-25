package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class ForgotPassword extends Utility {
    String baseUrl="https://opensource-demo.orangehrmlive.com/ ";
    @Before
    public void setup(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){

        clickOnElement(By.linkText("Forgot your password?"));

        verifyText("Forgot Your Password?",By.xpath("//h1[contains(text(),'Forgot Your Password?')]"),"Forgot Your Password?");
    }
    @After
    public void close(){
        closeBrowser();

    }
}
