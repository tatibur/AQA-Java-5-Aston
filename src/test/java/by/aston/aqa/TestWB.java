package by.aston.aqa;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestWB {
    @Test
    public void setMainPage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.addToShoppingCart();
        mainPage.goToShoppingCart();


        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.getProductPriceToShoppingCart();
    }
}