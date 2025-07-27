import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBox {


    WebDriver driver;
    @BeforeMethod
    public void TestBox(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/input.xhtml");
    }

    @Test
    public void TextTypeBoxTest(){
        //Type your name
        WebElement name = driver.findElement(By.id("j_idt88:name"));
        name.sendKeys("sahan");


        //Append Country to this City.

        WebElement tagelement = driver.findElement(By.id("j_idt88:j_idt91"));
        tagelement.sendKeys("Matara");



    }
}
