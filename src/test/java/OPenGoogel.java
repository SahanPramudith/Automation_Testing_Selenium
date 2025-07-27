import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OPenGoogel {
    @Test
    public void googelTest(){

        WebDriver webDriver=new ChromeDriver();
        webDriver.get("https://www.google.com/");
        webDriver.findElement(new By.ByName("q")).sendKeys("matara"+ Keys.ENTER);

    }

}
