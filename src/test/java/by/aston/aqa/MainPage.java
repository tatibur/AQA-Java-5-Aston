package by.aston.aqa;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    private final WebDriver driver;
    By firstProduct = By.xpath("(//*[@class='product-card__fast-view hide-mobile j-open-product-popup'])[1]");
    By secondProduct = By.xpath("(//*[@class='product-card__fast-view hide-mobile j-open-product-popup'])[2]");
    By thirdProduct = By.xpath("(//*[@class='product-card__fast-view hide-mobile j-open-product-popup'])[5]");
    By closeButton = By.xpath("(//*[@class='j-close popup__close close'])");
    By shoppingCart = By.xpath("(//*[@class='btn-base j-go-to-basket'])");
    By nameFirstProduct = By.xpath("(//*[@id=\"app\"]/div[2]/div/div[2]/div/article[1]/div/div[2]/h2/span[2]");
    By nameSecondProduct = By.xpath("(//*[@id=\"app\"]/div[2]/div/div[2]/div/article[2]/div/div[2]/h2/span[2]");
    By nameThirdProduct = By.xpath("(//*[@id=\"app\"]/div[2]/div/div[2]/div/article[5]/div/div[2]/h2/span[2]");
    String url = "https://www.wildberries.ru/";

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    void addToShoppingCart() {
        // ожидание загрузки не менее 5 элементов на главной странице
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[@class=\"product-card__wrapper\"]"), 5));

        // добавление первого товара
        driver.findElement(firstProduct).click();
        try {
            driver.findElement(By.xpath("(//*[@class='sizes-list__item'])[1]")).click();
            driver.findElement(By.xpath("//*[@class='btn-main']")).click();
        } catch (NoSuchElementException ex) {
            // System.out.println();
            driver.findElement(By.xpath("//*[@class='btn-main']")).click();
        }
        driver.findElement(closeButton).click();

        // добавление второго товара
        driver.findElement(secondProduct).click();
        try {
            driver.findElement(By.xpath("(//*[@class='sizes-list__item'])[1]")).click();
            driver.findElement(By.xpath("//*[@class='btn-main']")).click();
        } catch (NoSuchElementException ex) {
            System.out.println();
            driver.findElement(By.xpath("//*[@class='btn-main']")).click();
        }
        driver.findElement(closeButton).click();

        // добавление третьего товара
        driver.findElement(thirdProduct).click();
        try {
            driver.findElement(By.xpath("(//*[@class='sizes-list__item'])[1]")).click();
            driver.findElement(By.xpath("//*[@class='btn-main']")).click();
        } catch (NoSuchElementException ex) {
            System.out.println();
            driver.findElement(By.xpath("//*[@class='btn-main']")).click();
        }
    }

    void goToShoppingCart() {
        driver.findElement(shoppingCart).click();
    }

    public void open() {
        driver.get(url);
    }

    void getProductNameToMainPage() {
        driver.findElement(nameFirstProduct).getText();
        driver.findElement(nameSecondProduct).getText();
        driver.findElement(nameThirdProduct).getText();
    }
}
