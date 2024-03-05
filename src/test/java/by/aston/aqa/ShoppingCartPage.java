package by.aston.aqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShoppingCartPage {
    WebDriver driver;

    ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
    }

    String getProductNameToShoppingCart() {
        return driver.findElement(By.xpath("(//*[@class='good-info__good-name'])")).getText();
    }

    void getProductPriceToShoppingCart() {
        String priceFirstProduct = driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div/div[1]/form/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/div/div[3]/div[1]")).getText();
        System.out.println(priceFirstProduct);
        String priceSecondProduct = driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div/div[1]/form/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[3]/div[1]")).getText();
        System.out.println(priceSecondProduct);
        String priceThirdProduct = driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div/div[1]/form/div[1]/div[1]/div[2]/div/div[2]/div/div/div[3]/div/div[3]/div[1]")).getText();
        System.out.println(priceThirdProduct);
    }
}
