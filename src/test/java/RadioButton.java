import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButton {


    WebDriver driver;
    @BeforeMethod
    public void RadioButton(){
        driver=new ChromeDriver();

        driver.manage().window().maximize();
    }
    @Test
    public void RadioTest(){
        driver.get("https://www.leafground.com/radio.xhtml");
        boolean chormOption = driver.findElement(By.id("j_idt87:console2:0")).isSelected();
        boolean FirefoxOption = driver.findElement(By.id("j_idt87:console2:1")).isSelected();
        boolean SafariOption = driver.findElement(By.id("j_idt87:console2:2")).isSelected();
        boolean EdgeOption = driver.findElement(By.id("j_idt87:console2:3")).isSelected();

        if (chormOption){
            WebElement chorm = driver.findElement(By.xpath("//*[@id=j_idt87:console2]/tbody/tr/td[1]/label"));
            System.out.println("defult select val = " + chorm);
        } else if (FirefoxOption) {
            WebElement Firefox = driver.findElement(By.xpath("//*[@id=j_idt87:console2]/tbody/tr/td[2]/label"));
            System.out.println("defult select val = " + Firefox);
        } else if (SafariOption) {
            WebElement Safari = driver.findElement(By.xpath("//*[@id=j_idt87:console2]/tbody/tr/td[3]/label"));
            System.out.println("defult select val = " + Safari);
        }else if (EdgeOption) {
            WebElement Edge = driver.findElement(By.xpath("//*[@id=j_idt87:console2]/tbody/tr/td[4]/label"));
            System.out.println("defult select val = " + Edge);
        }

    }

}
