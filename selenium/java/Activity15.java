import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity15 {
    public static void main(String[] args) {
        // Initialize the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get(" https://training-support.net/webelements/dynamic-attributes");
        System.out.println("Page title: " + driver.getTitle());
        WebElement fullName = driver.findElement(By.xpath("// input[starts-with(@id, 'Full-name-')]"));
        WebElement email = driver.findElement(By.xpath("// input[contains(@id, '-email')]"));
        WebElement eventDAte= driver.findElement(By.xpath("// input[contains(@name, '-event-')]"));
        WebElement Fullname = driver.findElement(By.xpath("// textarea[contains(@id, '-additional-details-')]"));
        fullName.sendKeys("Ansar");
        email.sendKeys()
        
        
        

    
    
    
    
    
    
    
    
    driver.quit();
    
    }
    
    




}

/*
*/