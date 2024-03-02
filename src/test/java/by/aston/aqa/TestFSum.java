package by.aston.aqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestFSum {
    final String testTel = "297777777";
    final String testSum = "10.00";

    @Test
    public void TestFieldsSum() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://mts.by");

        WebElement acceptButton = driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]"));
        acceptButton.click();

        WebElement inputPhone = driver.findElement(By.xpath("//*[@id=\"connection-phone\"]"));
        inputPhone.click();
        inputPhone.sendKeys(testTel);

        WebElement inputSum = driver.findElement(By.xpath("//*[@id=\"connection-sum\"]"));
        inputSum.click();
        inputSum.sendKeys(testSum);

        WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button"));
        continueButton.click();

        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("bepaid-iframe")));

        WebElement tel = driver.findElement(By.xpath("/html/body/app-root/div/div/app-payment-container/app-header/header/div/div/div/span[1]"));
        String valueTel = tel.getText().replace(" BYN", "");
        Assertions.assertEquals(testSum, valueTel);

        WebElement telButton = driver.findElement(By.xpath("/html/body/app-root/div/div/app-payment-container/section/app-card-page/div/div[1]/button"));
        String valueSum = telButton.getText().replaceAll("[^0-9.]", "");
        Assertions.assertEquals(testSum, valueSum);
        driver.quit();
    }

}