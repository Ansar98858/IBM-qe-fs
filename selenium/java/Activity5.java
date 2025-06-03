import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {
    public static void main(String[] args) {
        // Set path to geckodriver if needed
        // System.setProperty("webdriver.gecko.driver", "/path/to/geckodriver");

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // 1. Open the URL
        driver.get("https://training-support.net/webelements/target-practice");

        // 2. Get and print the page title
        String title = driver.getTitle();
        System.out.println("Page title: " + title);

        // 3. Find the 3rd header (h3 tag) using XPath and print its text
        WebElement thirdHeader = driver.findElement(By.xpath("//h3"));
        System.out.println("Third header text: " + thirdHeader.getText());

        // 4. Find the 5th header (h5 tag) using XPath and print its color
        WebElement fifthHeader = driver.findElement(By.xpath("//h5"));
        String color = fifthHeader.getCssValue("color");
        System.out.println("Fifth header color: " + color);
        WebElement purpleButton = driver.findElement(By.xpath("//button[contains(@class, 'purple')]"));
        String purpleClasses = purpleButton.getAttribute("class");
        System.out.println("Purple button classes: " + purpleClasses);

        // Find the slate button using XPath and print its text
        WebElement slateButton = driver.findElement(By.xpath("//button[contains(@class, 'slate')]"));
        String slateText = slateButton.getText();
        System.out.println("Slate button text: " + slateText);
        

        // 7. Close the browser
        driver.quit();
    }
}
/* import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class Activity4 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/target-practice");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());

        // Find the 3rd header and print its text
        String thirdHeaderText = driver.findElement(By.xpath("//h3[contains(text(), '#3')]")).getText();
        System.out.println(thirdHeaderText);
        // Find the 5th header and print its color
        Color fifthHeaderColor = Color.fromString(driver.findElement(By.xpath("//h5[contains(text(), '#5')]")).getCssValue("color"));
        System.out.println("Color as RGB: " + fifthHeaderColor.asRgb());
        System.out.println("Color as hexcode: " + fifthHeaderColor.asHex());

        // Find the violet button and print its classes
        String purpleButtonClass = driver.findElement(By.xpath("//button[text()='Purple']")).getDomAttribute("class");
        System.out.println(purpleButtonClass);
        // Find the grey button and print its text
        String slateButtonText = driver.findElement(By.xpath("//button[contains(@class, 'slate')]")).getText();
        System.out.println(slateButtonText);

        // Close the browser
        driver.quit();
    }
}*/
