package by.aston.aqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage {
    private final WebDriver driver;
    By nameFirstProduct = By.xpath("(//*[@id=\"app\"]/div[4]/div/div[1]/form/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div/a/span[1])");
    By nameSecondProduct = By.xpath("(//*[@id=\"app\"]/div[4]/div/div[1]/form/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/a/span[1])");
    By nameThirdProduct = By.xpath("(//*[@id=\"app\"]/div[4]/div/div[1]/form/div[1]/div[1]/div[2]/div/div[2]/div/div/div[3]/div/div[1]/div/a/span[1])");
    By priceFirstProduct = By.xpath("//*[@id=\"app\"]/div[4]/div/div[1]/form/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/div/div[3]/div[1]");
    By priceSecondProduct = By.xpath("//*[@id=\"app\"]/div[4]/div/div[1]/form/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[3]/div[1]");
    By priceThirdProduct = By.xpath("//*[@id=\"app\"]/div[4]/div/div[1]/form/div[1]/div[1]/div[2]/div/div[2]/div/div/div[3]/div/div[3]/div[1]");

    ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
    }

    void getProductNameToShoppingCart() {
        driver.findElement(nameFirstProduct).getText();
        driver.findElement(nameSecondProduct).getText();
        driver.findElement(nameThirdProduct).getText();

    }

    void getProductPriceToShoppingCart() {
        driver.findElement(priceFirstProduct).getText();
        driver.findElement(priceSecondProduct).getText();
        driver.findElement(priceThirdProduct).getText();

    }
}
