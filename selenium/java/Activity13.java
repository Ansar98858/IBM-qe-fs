/*import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity13 {
    public static void main(String[] args) {
        // Initialize the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/tables");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());

        // Print the number of columns
        List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/thead/tr/th"));
        System.out.println("Number of columns: " + cols.size());
        // Print the number of rows
        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr"));
        System.out.println("Number of rows: " + rows.size());

        // Print the cells values of the third row
        List<WebElement> FourthRow = driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[4]/td"));
        System.out.println("Fourth row cell values: ");
        for(WebElement cell : FourthRow) {
            System.out.println(cell.getText());
        }

        // Print the cell value of the second row and second column
        WebElement cellValue = driver.findElement(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[2]/td[4]"));
        System.out.println("Fourth row, second cell value: " + cellValue.getText());

        // Close the browser
        driver.quit();
    }
}*/
import java.lang.foreign.ValueLayout.OfBoolean;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity13 {
    public static void main(String[] args) {
    WebDriver driver = new FirefoxDriver();
    driver.get("https://training-support.net/webelements/tables");
    System.out.println("Page title: " + driver.getTitle());
    List<WebElement> cols = driver.findElements(By.xpath("//table/thead/tr/th"));
System.out.println("Number Of columns:"+ cols.size());
List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
System.out.println("Number Of rows:"+ rows.size());
driver.quit();


    }
    

}