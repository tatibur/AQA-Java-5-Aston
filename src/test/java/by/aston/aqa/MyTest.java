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
    public void TestCommunicationServices() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://mts.by");
        WebElement acceptButton = driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]"));
        acceptButton.click();

        WebElement inputPhone = driver.findElement(By.id("connection-phone"));
        Assertions.assertTrue(inputPhone.isDisplayed());
        String placeholderPhone = inputPhone.getAttribute("placeholder");
        System.out.println(placeholderPhone);


        WebElement inputSum = driver.findElement(By.id("connection-sum"));
        Assertions.assertTrue(inputSum.isDisplayed());
        String placeholderSum = inputSum.getAttribute("placeholder");
        System.out.println(placeholderSum);

        driver.quit();
    }

    @Test
    public void TestHomeInternet() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://mts.by");
        WebElement acceptButton = driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]"));
        acceptButton.click();


        WebElement selectButton = driver.findElement(By.className("select__header"));
        selectButton.click();

        WebElement elementInternetHome = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[2]/p"));
        elementInternetHome.click();

        WebElement inputInternetPhone = driver.findElement(By.id("internet-phone"));
        Assertions.assertTrue(inputInternetPhone.isDisplayed());
        String placeholderInternetPhone = inputInternetPhone.getAttribute("placeholder");
        System.out.println(placeholderInternetPhone);


        WebElement inputInternetSum = driver.findElement(By.id("internet-sum"));
        Assertions.assertTrue(inputInternetSum.isDisplayed());
        String placeholderInternetSum = inputInternetSum.getAttribute("placeholder");
        System.out.println(placeholderInternetSum);

        driver.quit();
    }

    @Test
    public void TestInstallmentPlan() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://mts.by");
        WebElement acceptButton = driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]"));
        acceptButton.click();


        WebElement selectButton = driver.findElement(By.className("select__header"));
        selectButton.click();

        WebElement elementInstallmentPlan = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[3]/p"));
        elementInstallmentPlan.click();

        WebElement inputAccountNumber44 = driver.findElement(By.id("score-instalment"));
        Assertions.assertTrue(inputAccountNumber44.isDisplayed());
        String placeholderAccountNumber = inputAccountNumber44.getAttribute("placeholder");
        System.out.println(placeholderAccountNumber);


        WebElement inputInstallPlanSum = driver.findElement(By.id("instalment-sum"));
        Assertions.assertTrue(inputInstallPlanSum.isDisplayed());
        String placeholderInstallPlanSum = inputInstallPlanSum.getAttribute("placeholder");
        System.out.println(placeholderInstallPlanSum);

        driver.quit();
    }

    @Test
    public void TestDebt() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://mts.by");
        WebElement acceptButton = driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]"));
        acceptButton.click();


        WebElement selectButton = driver.findElement(By.className("select__header"));
        selectButton.click();

        WebElement elementDebt = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[4]/p"));
        elementDebt.click();

        WebElement inputAccountNumber2073 = driver.findElement(By.id("score-arrears"));
        Assertions.assertTrue(inputAccountNumber2073.isDisplayed());
        String placeholderAccountNumber2073 = inputAccountNumber2073.getAttribute("placeholder");
        System.out.println(placeholderAccountNumber2073);


        WebElement inputDebtSum = driver.findElement(By.id("arrears-sum"));
        Assertions.assertTrue(inputDebtSum.isDisplayed());
        String placeholderDebtSum = inputDebtSum.getAttribute("placeholder");
        System.out.println(placeholderDebtSum);

        driver.quit();
    }

    @Test
    public void TestFields() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://mts.by");
        WebElement acceptButton = driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]"));
        acceptButton.click();

        WebElement inputPhone = driver.findElement(By.xpath("//*[@id=\"connection-phone\"]"));
        inputPhone.click();
        inputPhone.sendKeys("297777777");

        WebElement inputSum = driver.findElement(By.xpath("//*[@id=\"connection-sum\"]"));
        inputSum.click();
        inputSum.sendKeys("10");

        WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button"));
        continueButton.click();

        WebElement iframe = driver.findElement(By.className("bepaid-iframe"));
        driver.switchTo().frame(iframe);

        WebElement inputCardNumber = driver.findElement(By.xpath("/html/body/app-root/div/div/app-payment-container/section/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[1]/label"));
        String labelCardNumber = inputCardNumber.getText();
        System.out.println(labelCardNumber);
        Assertions.assertEquals("Номер карты", labelCardNumber);

        WebElement inputCardValidity = driver.findElement(By.xpath("/html/body/app-root/div/div/app-payment-container/section/app-card-page/div/div[1]/app-card-input/form/div[1]/div[2]/div[1]/app-input/div/div/div[1]/label"));
        String labelCardValidity = inputCardValidity.getText();
        System.out.println(labelCardValidity);
        Assertions.assertEquals("Срок действия", labelCardValidity);

        WebElement inputCardCVC = driver.findElement(By.xpath("/html/body/app-root/div/div/app-payment-container/section/app-card-page/div/div[1]/app-card-input/form/div[1]/div[2]/div[3]/app-input/div/div/div[1]/label"));
        String labelCardCVC = inputCardCVC.getText();
        System.out.println(labelCardCVC);
        Assertions.assertEquals("CVC", labelCardCVC);

        WebElement inputCardNameOwner = driver.findElement(By.xpath("/html/body/app-root/div/div/app-payment-container/section/app-card-page/div/div[1]/app-card-input/form/div[1]/div[3]/app-input/div/div/div[1]/label"));
        String labelCardNameOwner = inputCardNameOwner.getText();
        System.out.println(labelCardNameOwner);
        Assertions.assertEquals("Имя держателя (как на карте)", labelCardNameOwner);

        WebElement logoMasterCard = driver.findElement(By.xpath("/html/body/app-root/div/div/app-payment-container/section/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/img[1]"));
        Assertions.assertTrue(logoMasterCard.isDisplayed());

        WebElement logoVisa = driver.findElement(By.xpath("/html/body/app-root/div/div/app-payment-container/section/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/img[2]"));
        Assertions.assertTrue(logoVisa.isDisplayed());

        WebElement logoBelCard = driver.findElement(By.xpath("/html/body/app-root/div/div/app-payment-container/section/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/img[3]"));
        Assertions.assertTrue(logoBelCard.isDisplayed());

      /*  WebElement logoMir = driver.findElement(By.xpath("/html/body/app-root/div/div/app-payment-container/section/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/div/img[2]"));
        Assertions.assertTrue(logoMir.isDisplayed());*/
    }
}