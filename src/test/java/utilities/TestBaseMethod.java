package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestBaseMethod {

    protected WebDriver driver;
    // access modifier yazilmazsa default access modifier gecerli olur
    // default access modifier sadece icinde bulundugu utilities package'da gecerlidir
    // baska package'dan driver'a ulasmak icin
    //  - herkes ulasabilsin dersek public
    //  - sadece child class'lar ulasabilsin dersek protected kullanilmalidir

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }

    @After
    public void teardown(){

       // driver.quit();
    }


}