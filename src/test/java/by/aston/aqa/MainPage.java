package by.aston.aqa;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    WebDriver driver;

    MainPage(WebDriver driver) {
        this.driver = driver;
    }

    // метод добавления товара в корзину
    void addToShoppingCart() throws InterruptedException {
        // ожидание загрузки не менее 5 элементов на главной странице
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[@class=\"product-card__wrapper\"]"), 5));

        // ДОБАВЛЕНИЕ ПЕРВОГО ТОВАРА
        // нажимаем быстрый просмотр
        driver.findElement(By.xpath("(//*[@class='product-card__fast-view hide-mobile j-open-product-popup'])[1]")).click();
        // выбираем размер и кладем в корзину
        try {
            driver.findElement(By.xpath("(//*[@class='sizes-list__item'])[1]")).click();
            driver.findElement(By.xpath("//*[@class='btn-main']")).click();
        } catch (NoSuchElementException ex) {
            // если не нужно выбирать размер - просто кладём в корзину
            System.out.println();
            driver.findElement(By.xpath("//*[@class='btn-main']")).click();
        }
        // нажимаем кнопку Закрыть
        driver.findElement(By.xpath("(//*[@class='j-close popup__close close'])")).click();

        // ДОБАВЛЕНИЕ ВТОРОГО ТОВАРА
        driver.findElement(By.xpath("(//*[@class='product-card__fast-view hide-mobile j-open-product-popup'])[2]")).click();
        try {
            driver.findElement(By.xpath("(//*[@class='sizes-list__item'])[1]")).click();
            driver.findElement(By.xpath("//*[@class='btn-main']")).click();
        } catch (NoSuchElementException ex) {
            System.out.println();
            driver.findElement(By.xpath("//*[@class='btn-main']")).click();
        }
        driver.findElement(By.xpath("(//*[@class='j-close popup__close close'])")).click();

        // ДОБАВЛЕНИЕ ТРЕТЬЕГО ТОВАРА
        driver.findElement(By.xpath("(//*[@class='product-card__fast-view hide-mobile j-open-product-popup'])[5]")).click();
        try {
            driver.findElement(By.xpath("(//*[@class='sizes-list__item'])[1]")).click();
            driver.findElement(By.xpath("//*[@class='btn-main']")).click();
        } catch (NoSuchElementException ex) {
            System.out.println();
            driver.findElement(By.xpath("//*[@class='btn-main']")).click();
        }
        // driver.findElement(By.xpath("(//*[@class='j-close popup__close close'])")).click();
    }

    // метод перехода в Корзину
    void goToShoppingCart() {
        driver.findElement(By.xpath("(//*[@class='btn-base j-go-to-basket'])")).click();
    }

    public void open() {
        driver.get("https://www.wildberries.ru/");
    }
}