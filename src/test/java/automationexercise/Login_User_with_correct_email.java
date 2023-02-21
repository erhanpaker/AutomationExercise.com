package automationexercise;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBaseMethod;

public class Login_User_with_correct_email extends TestBaseMethod {

    @Test

    public void AutomationExercise(){


        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        WebElement logoElementi = driver.findElement(By.xpath("//img[@src = '/static/images/home/logo.png']"));
        Assert.assertTrue(logoElementi.isDisplayed());

        //4. Click on 'Signup / Login' button
        //4- Click on 'Signup / Login' button
        WebElement login = driver.findElement(By.xpath("//*[text()= ' Signup / Login']"));
        login.click();

        //5. Verify 'Login to your account' is visible
        WebElement loginYazıElemnti = driver.findElement(By.xpath("//h2[text()='Login to your account']"));
        Assert.assertTrue(loginYazıElemnti.isDisplayed());

        //6. Enter correct email address and password
        WebElement mailKutusu = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
        mailKutusu.sendKeys("metehan0077@gmail.com");

        WebElement parolaKutusu = driver.findElement(By.xpath("//input[@data-qa='login-password']"));
        parolaKutusu.sendKeys("12345");

        //7. Click 'login' button
        WebElement clicButon = driver.findElement(By.xpath("//button[@data-qa='login-button']"));
        clicButon.click();

        //8. Verify that 'Logged in as username' is visible
        WebElement beyza  = driver.findElement(By.xpath("//b[text()='beyzanur']"));
        Assert.assertTrue(beyza.isDisplayed());

        //9. Click 'Delete Account' button
        WebElement deleteButonu = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a"));
        deleteButonu.click();


        //10. Verify that 'ACCOUNT DELETED!' is visible


    }


}
