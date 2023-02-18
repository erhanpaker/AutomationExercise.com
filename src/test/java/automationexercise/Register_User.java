package automationexercise;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseMethod;

public class Register_User extends TestBaseMethod {

       //1- Launch browser

    @Test

    public void AutomationExercise () throws InterruptedException {

        //2- Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        WebElement logoElement = driver.findElement(By.xpath("//img[@src = '/static/images/home/logo.png']"));
        Assert.assertTrue(logoElement.isDisplayed()); //Logo elementinin göründüğünü kontrol eder.


        //4- Click on 'Signup / Login' button
        WebElement login = driver.findElement(By.xpath("//*[text()= ' Signup / Login']"));
        login.click();

        //5-  Verify 'New User Signup!' is visible
        WebElement yaziElementi = driver.findElement(By.xpath("//h2[text()='New User Signup!']"));

        String expectedYazi = "New User Signup!";
        String actualYazi = yaziElementi.getText();
        Assert.assertEquals(expectedYazi,actualYazi);

        Thread.sleep(1000);


        //6- Enter name and email address
        WebElement email = driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
        email.sendKeys("erhan");
        WebElement pass = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
        pass.sendKeys("metehan0077@gmail.com"); // email ve password alanlarına bilgileri gönderdim

        //7- Click 'Signup' button
        WebElement signupButon = driver.findElement(By.xpath("//button[@data-qa='signup-button']"));
        signupButon.click();

        //8- Verify that 'ENTER ACCOUNT INFORMATION' is visible
        String expectedTitle="ENTER ACCOUNT INFORMATION";
        String  actualUrl = driver.getCurrentUrl();
        Assert.assertFalse(actualUrl.contains(expectedTitle));

        //9- Fill details: Title, Name, Email, Password, Date of birth
        WebElement title = driver.findElement(By.xpath(" (//input[@type='radio'])[1]"));
        title.click();
        Actions actions = new Actions(driver);
        actions.click(title)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("1990")
                .sendKeys(Keys.ENTER);

        //form alanını geçemiyorum




    }



        



    //10. Select checkbox 'Sign up for our newsletter!'
    //11. Select checkbox 'Receive special offers from our partners!'
    //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    //13. Click 'Create Account button'
    //14. Verify that 'ACCOUNT CREATED!' is visible
    //15. Click 'Continue' button
    //16. Verify that 'Logged in as username' is visible
    //17. Click 'Delete Account' button
    //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button


}
