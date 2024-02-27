/*Необходимо написать автотесты для сайта mts.by.
Суть тестов заключается в проверке блока «Онлайн пополнение без комиссии»:
Проверить название указанного блока;
Проверить наличие логотипов платёжных систем;
Проверить работу ссылки «Подробнее о сервисе»;
Заполнить поля и проверить работу кнопки «Продолжить» (проверяем только вариант «Услуги связи», номер для теста 297777777)*/
package by.aston.aqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MyTest {
    @Test
    public void TestText() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://mts.by");

        WebElement acceptButton = driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]"));
        acceptButton.click();

        WebElement element = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/h2"));
        String text = element.getText();
        Assertions.assertEquals("Онлайн пополнение\nбез комиссии", text);
        driver.quit();
    }

    @Test
    public void TestLogo1() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://mts.by");

        WebElement acceptButton = driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]"));
        acceptButton.click();

        WebElement elementLogoVisa = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[1]/img"));
        Assertions.assertTrue(elementLogoVisa.isDisplayed());
        driver.quit();
    }

    @Test
    public void TestLogo2() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://mts.by");

        WebElement acceptButton = driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]"));
        acceptButton.click();

        WebElement elementLogoVerifiedByVisa = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[2]/img"));
        Assertions.assertTrue(elementLogoVerifiedByVisa.isDisplayed());
        driver.quit();
    }

    @Test
    public void TestLogo3() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://mts.by");

        WebElement acceptButton = driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]"));
        acceptButton.click();

        WebElement elementLogoMasterCard = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[3]/img"));
        Assertions.assertTrue(elementLogoMasterCard.isDisplayed());
        driver.quit();
    }

    @Test
    public void TestLogo4() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://mts.by");

        WebElement acceptButton = driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]"));
        acceptButton.click();

        WebElement elementLogoMasterCardSecureCode = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[4]/img"));
        Assertions.assertTrue(elementLogoMasterCardSecureCode.isDisplayed());
        driver.quit();
    }

    @Test
    public void TestLogo5() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://mts.by");

        WebElement acceptButton = driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]"));
        acceptButton.click();

        WebElement elementLogoBelCard = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[5]/img"));
        Assertions.assertTrue(elementLogoBelCard.isDisplayed());
        driver.quit();
    }

    @Test
    public void TestLogo6() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://mts.by");

        WebElement acceptButton = driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]"));
        acceptButton.click();

        WebElement elementLogoMir = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[6]/img"));
        Assertions.assertTrue(elementLogoMir.isDisplayed());
        driver.quit();
    }

    @Test
    public void TestLink() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://mts.by");

        WebElement acceptButton = driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]"));
        acceptButton.click();

        WebElement elementLink = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/a[text()='Подробнее о сервисе']"));
        elementLink.click();
    }

    @Test
    public void TestFields() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://mts.by");

        WebElement acceptButton = driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]"));
        acceptButton.click();

        WebElement phoneInputField = driver.findElement(By.xpath("//*[@id=\"connection-phone\"]"));
        phoneInputField.click();
        phoneInputField.sendKeys("297777777");

        WebElement amountInputField = driver.findElement(By.xpath("//*[@id=\"connection-sum\"]"));
        amountInputField.click();
        amountInputField.sendKeys("10");

        WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button"));
        continueButton.click();
    }
}