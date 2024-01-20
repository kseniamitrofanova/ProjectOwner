package ru.vipksundra;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {
    @Test
    public void testGithub(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com");
        String title = driver.getTitle();
        assertEquals (title,"");
    }
}
