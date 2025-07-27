import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class LinkExample {

    WebDriver driver;
    @BeforeMethod
    public void LinkTest(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/link.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");
    }

    @Test
    public void TestLink(){
        //Take me to dashboard
        WebElement goToDashboard = driver.findElement(By.linkText("Go to Dashboard"));
        goToDashboard.click();
        driver.navigate().back();

        //find my destination

        WebElement findTheUrl = driver.findElement(By.partialLinkText("Find the URL"));
        String href = findTheUrl.getAttribute("href");
        System.out.println("find the url  = " + href);

        //am i broken link
        WebElement element = driver.findElement(By.linkText("Broken?"));
        element.click();

        String title = driver.getTitle();
        if (title.contains("404")){
            System.out.println("Link is broken");
        }else {
            System.out.println("Link is ont broken ");
        }

        driver.navigate().back();


        //Duplicate Link

        WebElement goToDashboard1 = driver.findElement(By.linkText("Go to Dashboard"));
        goToDashboard1.click();
        driver.navigate().back();

        //Link count

        List<WebElement> count  = driver.findElements(By.tagName("a"));
        int size = count.size();
        System.out.println("size = " + size);



    }
}
