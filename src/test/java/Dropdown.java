import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Dropdown {

    WebDriver driver;
    @BeforeMethod
    public void Dropdown(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/select.xhtml");
    }

    @Test
    public void TestDropdown() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
        Select select = new Select(element);
        select.selectByIndex(2);
        Thread.sleep(3000);
        select.selectByVisibleText("Cypress");
        Thread.sleep(3000);

        // get Number of dropdown option
        List<WebElement> options = select.getOptions();
        int size = options.size();
        System.out.println("size = " + size);

       for(WebElement op:options){
           System.out.println("option"+op.getText());
       }

       //using sendingkey slect dropdown
        element.sendKeys("Cypress");

       //custom dropdown
        WebElement dropdown1 = driver.findElement(By.xpath("//label[@id='j_idt87:country_label']"));
        dropdown1.click();
        List<WebElement> element1 = driver.findElements(By.xpath("//li[@id='j_idt87:country_4']"));
        for(WebElement e1:element1){
            String text = e1.getText();
            if (text.equals("USA")){
                e1.click();
                break;
            }

        }


    }
}
