import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonTest {


    WebDriver driver;
    @BeforeMethod
    public  void TestButton(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/button.xhtml");
    }

    @Test
    public void testButton(){
        //Click and Confirm title.
        WebElement title = driver.findElement(By.id("j_idt88:j_idt90"));
        title.click();
        String expectedTitle = "Dashboard";
        String actuelTitel = driver.getTitle();
        if (actuelTitel.equals(expectedTitle)){
            System.out.println("actual val");
        } else {
            System.out.println("actual val is not same ");
        }
        driver.navigate().back();

        //Assert.assertEquals(actuelTitel,expectedTitle,"done");


        //Find the position of the Submit button
        WebElement position = driver.findElement(By.id("j_idt88:j_idt94"));
        Point location = position.getLocation();
        int x =location.getX();
        int y =location.getY();
        System.out.println("y+\"x\"+x = " + y+"x"+x);

        //find the save button color

        WebElement color = driver.findElement(By.id("j_idt88:j_idt96"));
        String cssValue = color.getCssValue("    background: ");
        System.out.println("cssValue = " + cssValue);

        //find the height and width of the submit button

        WebElement element = driver.findElement(By.id("j_idt88:j_idt98"));
        int width = element.getSize().getWidth();
        int height = element.getSize().getHeight();

        System.out.println("height = " + height +"width"+width);



    }
}
