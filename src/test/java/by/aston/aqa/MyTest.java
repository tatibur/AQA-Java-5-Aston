/*Продолжим работу над блоком «Онлайн пополнение без комиссии» сайта mts.by.
Проверить надписи в незаполненных полях каждого варианта оплаты услуг:
услуги связи, домашний интернет, рассрочка, задолженность;
Для варианта «Услуги связи» заполнить поля в соответствии с пререквизитами из предыдущей темы,
нажать кнопку «Продолжить» и в появившемся окне проверить корректность отображения суммы (в том числе на кнопке),
номера телефона, а также надписей в незаполненных полях для ввода реквизитов карты, наличие иконок платёжных систем.*/
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

public class MyTest {
    final String testTel = "297777777";
    final String testSum = "10.50";

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

        WebElement sum = driver.findElement(By.xpath("/html/body/app-root/div/div/app-payment-container/app-header/header/div/div/div/span[1]"));
        String valueSum = sum.getText().replaceAll("[^0-9.]", "");
        Assertions.assertEquals(testSum, valueSum);

        WebElement sumButton = driver.findElement(By.xpath("/html/body/app-root/div/div/app-payment-container/section/app-card-page/div/div[1]/button"));
        String valueSum1 = sumButton.getText().replaceAll("[^0-9.]", "");
        Assertions.assertEquals(testSum, valueSum1);

        driver.quit();
    }

    @Test
    public void TestFieldsTel() {
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

        WebElement tel = driver.findElement(By.className("header__payment-info"));
        String valueTel = tel.getText().replaceAll("[^0-9]", "").substring(3);
        Assertions.assertEquals(testTel, valueTel);
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
        inputPhone.sendKeys(testTel);

        WebElement inputSum = driver.findElement(By.xpath("//*[@id=\"connection-sum\"]"));
        inputSum.click();
        inputSum.sendKeys(testSum);

        WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button"));
        continueButton.click();

        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("bepaid-iframe")));

        WebElement inputCardNumber = driver.findElement(By.xpath("//input[@formcontrolname=\"creditCard\"]/following-sibling::label"));
        String labelCardNumber = inputCardNumber.getText();
        Assertions.assertEquals("Номер карты", labelCardNumber);

        WebElement inputCardValidity = driver.findElement(By.xpath("//input[@formcontrolname=\"expirationDate\"]/following-sibling::label"));
        String labelCardValidity = inputCardValidity.getText();
        Assertions.assertEquals("Срок действия", labelCardValidity);

        WebElement inputCardCVC = driver.findElement(By.xpath("//input[@formcontrolname=\"cvc\"]/following-sibling::label"));
        String labelCardCVC = inputCardCVC.getText();
        Assertions.assertEquals("CVC", labelCardCVC);

        WebElement inputCardNameOwner = driver.findElement(By.xpath("//input[@formcontrolname=\"holder\"]/following-sibling::label"));
        String labelCardNameOwner = inputCardNameOwner.getText();
        Assertions.assertEquals("Имя держателя (как на карте)", labelCardNameOwner);

        WebElement logoMasterCard = driver.findElement(By.xpath("/html/body/app-root/div/div/app-payment-container/section/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/img[1]"));
        Assertions.assertTrue(logoMasterCard.isDisplayed());

        WebElement logoVisa = driver.findElement(By.xpath("/html/body/app-root/div/div/app-payment-container/section/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/img[2]"));
        Assertions.assertTrue(logoVisa.isDisplayed());

        WebElement logoBelCard = driver.findElement(By.xpath("/html/body/app-root/div/div/app-payment-container/section/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/img[3]"));
        Assertions.assertTrue(logoBelCard.isDisplayed());

        WebElement logoMir = driver.findElement(By.xpath("/html/body/app-root/div/div/app-payment-container/section/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/div"));
        Assertions.assertTrue(logoMir.isDisplayed());
    }
}