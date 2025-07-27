import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBox {


    WebDriver driver;
    @BeforeMethod
    public void TestBox() throws InterruptedException {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/input.xhtml");
        Thread.sleep(8000);
    }

    @Test
    public void TextTypeBoxTest(){
        //Type your name
        WebElement name = driver.findElement(By.id("j_idt88:name"));
        name.sendKeys("sahan");


        //Append Country to this City.

        WebElement tagelement = driver.findElement(By.id("j_idt88:j_idt91"));
        tagelement.sendKeys("Matara");


        // WebElement tagElement = driver.findE    lement(By.id("j_idt88:j_idt91"));
        boolean enabled = driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
        System.out.println("enabled = " + enabled);


        //Retrieve the typed text.

        WebElement retrieve = driver.findElement(By.id("j_idt88:j_idt97"));
        String value = retrieve.getDomAttribute("value");
        System.out.println("value = " + value);


        //Type email and Tab. Confirm control moved to next element

        WebElement element2 = driver.findElement(By.id("j_idt88:j_idt99"));
        element2.sendKeys("sahanpramudith466@gmail.com"+ Keys.TAB);

        //Clear the typed text.
        WebElement element3 = driver.findElement(By.id("j_idt88:j_idt95"));
        element3.clear();


    }
}
