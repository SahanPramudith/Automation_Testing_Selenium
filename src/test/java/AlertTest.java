import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.Alert;

import java.time.Duration;

public class AlertTest {

    WebDriver driver;
    @BeforeMethod
    public void Alert(){
        driver=new ChromeDriver();
        driver.get("https://www.leafground.com/alert.xhtml");
        driver.manage().window().maximize();
    }

    @Test

    //click alert
    public  void TestAlert (){
        WebElement alert = driver.findElement(By.id("j_idt88:j_idt91"));
        alert.click();
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();

        //Alert promting
        WebElement testAlert = driver.findElement(By.id("j_idt88:j_idt104"));
        testAlert.click();
        Alert alert2 = driver.switchTo().alert();
        String text = alert2.getText();
        System.out.println("text = " + text);
        alert2.sendKeys("sahan ");
        alert2.accept();


        //Alert confirm
        WebElement element = driver.findElement(By.id("j_idt88:j_idt93"));
        element.click();
        Alert confirm=driver.switchTo().alert();
        confirm.dismiss();

        //Sweet Alert (Simple Dialog)

        WebElement sweetAlert = driver.findElement(By.id("j_idt88:j_idt95"));
        sweetAlert.click();
//        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement modal = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("[id='j_idt88\\\\:j_idt96']")));

        String title = driver.findElement(By.xpath("//span[@id='j_idt88:j_idt96_title']")).getText();
        String massage = driver.findElement(By.xpath("//div[@id='j_idt88:j_idt96_content']")).getText();
        System.out.println("massage = " + massage);
        System.out.println("title = " + title);

        driver.findElement(By.xpath("//a[@role='button' and @aria-label='Close']/span[@class='ui-icon ui-icon-closethick']")).click();


    }




}
