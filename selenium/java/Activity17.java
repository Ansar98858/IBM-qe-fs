import java.awt.desktop.QuitEvent;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity17 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/selects");
        // Print the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        // Find the dropdown
        WebElement dropdown = driver.findElement(By.cssSelector("select.h-80"));
        Select multiSelect = new Select(dropdown);
        multiSelect.selectByVisibleText("HTML");
       multiSelect.selectByIndex(4);
       System.out.println("fourth option: " + multiSelect.getFirstSelectedOption().getText());
multiSelect.selectByIndex(5);

System.out.println("fifthoption: " + multiSelect.getFirstSelectedOption().getText());

multiSelect.selectByIndex(6);
System.out.println("sixth option: " + multiSelect.getFirstSelectedOption().getText());

multiSelect.selectByValue("nodejs");
List<WebElement> selectedOptions = multiSelect.getAllSelectedOptions();
System.out.println("Selected options are: ");
        for (WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }

        
        multiSelect.deselectByIndex(4);
       
        selectedOptions = multiSelect.getAllSelectedOptions();
        System.out.println("Selected options are: ");
        for (WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }


        driver.quit();
        }
    
}