import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/webelements/dynamic-controls");
        System.out.println("Page title: " + driver.getTitle());

        WebElement textbox = driver.findElement(By.id("textInput"));
        System.out.println("Input field is enabled: " + textbox.isEnabled());

        // Click the "Enable Input" button
        driver.findElement(By.id("textInputButton")).click();

        // Wait briefly
        try { Thread.sleep(2000); } catch (InterruptedException e) {}

        System.out.println("Input field is enabled after click: " + textbox.isEnabled());

        if (textbox.isEnabled()) {
            textbox.sendKeys("Example text");
            System.out.println("Typed: " + textbox.getAttribute("value"));
        }

        driver.quit();
    }
}
