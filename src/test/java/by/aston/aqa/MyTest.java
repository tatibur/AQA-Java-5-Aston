package by.aston.aqa;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
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
    static WebDriver driver = new ChromeDriver();

    @BeforeEach
    public void initialize() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://mts.by");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='cookie-agree']")).click();
    }

    @AfterAll
    public static void exitSite() {
        driver.quit();
    }

    @Test
    public void TestCommunicationServices() {
        WebElement inputPhone = driver.findElement(By.id("connection-phone"));
        Assertions.assertTrue(inputPhone.isDisplayed());
        String placeholderPhone = inputPhone.getAttribute("placeholder");
        System.out.println(placeholderPhone);

        WebElement inputSum = driver.findElement(By.id("connection-sum"));
        Assertions.assertTrue(inputSum.isDisplayed());
        String placeholderSum = inputSum.getAttribute("placeholder");
        System.out.println(placeholderSum);

    }

    @Test
    public void TestHomeInternet() {
        WebElement selectButton = driver.findElement(By.className("select__header"));
        selectButton.click();

        WebElement elementInternetHome = driver.findElement(By.xpath("//div[@class='select__wrapper opened']//li[2]//p"));
        elementInternetHome.click();

        WebElement inputInternetPhone = driver.findElement(By.id("internet-phone"));
        Assertions.assertTrue(inputInternetPhone.isDisplayed());
        String placeholderInternetPhone = inputInternetPhone.getAttribute("placeholder");
        System.out.println(placeholderInternetPhone);

        WebElement inputInternetSum = driver.findElement(By.id("internet-sum"));
        Assertions.assertTrue(inputInternetSum.isDisplayed());
        String placeholderInternetSum = inputInternetSum.getAttribute("placeholder");
        System.out.println(placeholderInternetSum);
    }

    @Test
    public void TestInstallmentPlan() {
        WebElement selectButton = driver.findElement(By.className("select__header"));
        selectButton.click();

        driver.findElement(By.xpath("//div[@class='select__wrapper opened']//li[3]//p")).click();

        WebElement inputAccountNumber44 = driver.findElement(By.id("score-instalment"));
        Assertions.assertTrue(inputAccountNumber44.isDisplayed());
        String placeholderAccountNumber = inputAccountNumber44.getAttribute("placeholder");
        System.out.println(placeholderAccountNumber);

        WebElement inputInstallPlanSum = driver.findElement(By.id("instalment-sum"));
        Assertions.assertTrue(inputInstallPlanSum.isDisplayed());
        String placeholderInstallPlanSum = inputInstallPlanSum.getAttribute("placeholder");
        System.out.println(placeholderInstallPlanSum);
    }

    @Test
    public void TestDebt() {
        driver.findElement(By.className("select__header")).click();
        driver.findElement(By.xpath("//div[@class='select__wrapper opened']//li[4]//p")).click();

        WebElement inputAccountNumber2073 = driver.findElement(By.id("score-arrears"));
        Assertions.assertTrue(inputAccountNumber2073.isDisplayed());
        String placeholderAccountNumber2073 = inputAccountNumber2073.getAttribute("placeholder");
        System.out.println(placeholderAccountNumber2073);

        WebElement inputDebtSum = driver.findElement(By.id("arrears-sum"));
        Assertions.assertTrue(inputDebtSum.isDisplayed());
        String placeholderDebtSum = inputDebtSum.getAttribute("placeholder");
        System.out.println(placeholderDebtSum);
    }

    @Test
    public void TestFieldsSum() {
        WebElement inputPhone = driver.findElement(By.xpath("//*[@id='connection-phone']"));
        inputPhone.click();
        inputPhone.sendKeys(testTel);

        WebElement inputSum = driver.findElement(By.xpath("//*[@id='connection-sum']"));
        inputSum.click();
        inputSum.sendKeys(testSum);

        WebElement continueButton = driver.findElement(By.xpath("//*[@id='pay-connection']/button"));
        continueButton.click();

        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("bepaid-iframe")));

        WebElement sum = driver.findElement(By.xpath("//div[@class='header__payment-amount']//span"));
        String valueSum = sum.getText().replaceAll("[^0-9.]", "");
        Assertions.assertEquals(testSum, valueSum);

        WebElement sumButton = driver.findElement(By.xpath("//div[@class='card-page__card']//button"));
        String valueSum1 = sumButton.getText().replaceAll("[^0-9.]", "");
        Assertions.assertEquals(testSum, valueSum1);
    }

    @Test
    public void TestFieldsTel() throws InterruptedException {
        WebElement inputPhone = driver.findElement(By.xpath("//*[@id='connection-phone']"));
        inputPhone.click();
        inputPhone.sendKeys(testTel);

        WebElement inputSum = driver.findElement(By.xpath("//*[@id='connection-sum']"));
        inputSum.click();
        inputSum.sendKeys(testSum);

        WebElement continueButton = driver.findElement(By.xpath("//*[@id='pay-connection']/button"));
        continueButton.click();

        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("bepaid-iframe")));

        Thread.sleep(5000);

        WebElement tel = driver.findElement(By.className("header__payment-info"));
        String valueTel = tel.getText().replaceAll("[^0-9]", "").substring(3);
        Assertions.assertEquals(testTel, valueTel);
    }

    @Test
    public void TestFields() throws InterruptedException {
        WebElement inputPhone = driver.findElement(By.xpath("//*[@id='connection-phone']"));
        inputPhone.click();
        inputPhone.sendKeys(testTel);

        WebElement inputSum = driver.findElement(By.xpath("//*[@id='connection-sum']"));
        inputSum.click();
        inputSum.sendKeys(testSum);

        WebElement continueButton = driver.findElement(By.xpath("//*[@id='pay-connection']/button"));
        continueButton.click();

        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("bepaid-iframe")));

        Thread.sleep(5000);

        WebElement inputCardNumber = driver.findElement(By.xpath("//div[@class='content ng-tns-c47-1']//label"));
        String labelCardNumber = inputCardNumber.getText();
        Assertions.assertEquals("Номер карты", labelCardNumber);

        WebElement inputCardValidity = driver.findElement(By.xpath("//div[@class='content ng-tns-c47-4']//label"));
        String labelCardValidity = inputCardValidity.getText();
        Assertions.assertEquals("Срок действия", labelCardValidity);

        WebElement inputCardCVC = driver.findElement(By.xpath("//div[@class='content ng-tns-c47-5']//label"));
        String labelCardCVC = inputCardCVC.getText();
        Assertions.assertEquals("CVC", labelCardCVC);

        WebElement inputCardNameOwner = driver.findElement(By.xpath("//div[@class='content ng-tns-c47-3']//label"));
        String labelCardNameOwner = inputCardNameOwner.getText();
        Assertions.assertEquals("Имя держателя (как на карте)", labelCardNameOwner);

        WebElement logoMasterCard = driver.findElement(By.xpath("//img[@class='ng-tns-c53-0 ng-star-inserted']"));
        Assertions.assertTrue(logoMasterCard.isDisplayed());

        WebElement logoVisa = driver.findElement(By.xpath("//img[@class='ng-tns-c53-0 ng-star-inserted'][2]"));
        Assertions.assertTrue(logoVisa.isDisplayed());

        WebElement logoBelCard = driver.findElement(By.xpath("//img[@class='ng-tns-c53-0 ng-star-inserted'][3]"));
        Assertions.assertTrue(logoBelCard.isDisplayed());

        WebElement logoMir = driver.findElement(By.xpath("//div[@class='cards-brands cards-brands_random ng-tns-c53-0 ng-star-inserted']"));
        Assertions.assertTrue(logoMir.isDisplayed());
    }
}