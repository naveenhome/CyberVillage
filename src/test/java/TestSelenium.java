import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium {
	@Test
    public void swTestAcademyTitleTest() {
        WebDriver driver = new FirefoxDriver();
        //driver.get("https://www.wikipedia.org/");
        driver.navigate().to("https://www.wikipedia.org/");
        WebElement element = driver.findElement(By.id("searchInput")); 
        element.clear();
        element.sendKeys("Naveen");
        element.submit();
        assertEquals("Wikipedi", driver.findElement(By.id("searchInput")).getAttribute("value"));
        //driver.close();
        //driver.quit();
    }

}
