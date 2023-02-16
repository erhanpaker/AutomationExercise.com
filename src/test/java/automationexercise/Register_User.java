package automationexercise;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBaseMethod;

public class Register_User extends TestBaseMethod {

    // 1. Launch browser
    //2. Navigate to url 'http://automationexercise.com'
    @Test

    public void sayfayaGit (){
        driver.get("http://automationexercise.com");



    }
    //3. Verify that home page is visible successfully
    @Test

    public void görünürOlduğumuTestEt(){

        String expectedTitle="automationexercise";

        String  actualUrl = driver.getCurrentUrl();
        Assert.assertFalse(actualUrl.contains(expectedTitle));
    }

    @Test
    //4. Click on 'Signup / Login' button

    public void signupLogin(){
        driver.get("http://automationexercise.com");
        WebElement login = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
        login.click();
    }




    //5. Verify 'New User Signup!' is visible
    //6. Enter name and email address
    //7. Click 'Signup' button
    //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
    //9. Fill details: Title, Name, Email, Password, Date of birth
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
