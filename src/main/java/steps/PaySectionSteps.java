package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PaySectionPage;

import java.time.Duration;

public class PaySectionSteps {

    private final PaySectionPage paySectionPage;
    private final WebDriverWait wait;

    public PaySectionSteps(WebDriver driver) {
        this.paySectionPage = PageFactory.initElements(driver, PaySectionPage.class );
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    @Step("Разворачиваем список услуг для оплаты")
    public void clickSelectWrapperButton() {
        wait.until(ExpectedConditions.elementToBeClickable(paySectionPage.getSelectWrapperButton())).click();
        wait.until(ExpectedConditions.attributeContains(
                By.xpath("//div[contains(@class,'select__wrapper')]"), "class", "opened"));    }

    //Услуги связи
    @Step("Выбираем Услуги связи для пополнения")
    public void clickCommunicationServices() {
        wait.until(ExpectedConditions.elementToBeClickable(paySectionPage.getCommunicationServices())).click();
    }
    @Step("Получаем плейсхолдер окна для номера телефона")
    public String getConnectionPhoneText() {
        return paySectionPage.getConnectionPhoneText().getAttribute("placeholder");
    }
    @Step("Получаем плейсхолдер окна для суммы")
    public  String getConnectionSumText() {
        return paySectionPage.getConnectionSumText().getAttribute("placeholder");
    }
    @Step("Получаем плейсхолдер окна для почты")
    public String getConnectionEmailText() {
        return paySectionPage.getConnectionEmailText().getAttribute("placeholder");
    }

    //Домашний интернет
    @Step("Выбираем Домашний интернет для пополнения")
    public void clickHomeInternet() {
        wait.until(ExpectedConditions.elementToBeClickable(paySectionPage.getHomeInternet())).click();
    }
    @Step("Получаем плейсхолдер окна для номера телефона")
    public String getInternetPhoneText() {
        return paySectionPage.getInternetPhoneText().getAttribute("placeholder");
    }
    @Step("Получаем плейсхолдер окна для суммы")
    public String getInternetSumText() {
        return paySectionPage.getInternetSumText().getAttribute("placeholder");
    }
    @Step("Получаем плейсхолдер окна для почты")
    public String getInternetEmailText() {
        return paySectionPage.getInternetEmailText().getAttribute("placeholder");
    }

    //Рассрочка
    @Step("Выбираем Рассрочку для пополнения")
    public void clickInstalment() {
        wait.until(ExpectedConditions.elementToBeClickable(paySectionPage.getInstalment())).click();
    }
    @Step("Получаем плейсхолдер окна для номера телефона")
    public  String getScoreInstalmentText() {
        return paySectionPage.getScoreInstalmentText().getAttribute("placeholder");
    }
    @Step("Получаем плейсхолдер окна для суммы")
    public String getScoreInstalmentSumText() {
        return paySectionPage.getInstalmentSumText().getAttribute("placeholder");
    }
    @Step("Получаем плейсхолдер окна для почты")
    public String getScoreInstalmentEmailText() {
        return paySectionPage.getInstalmentEmailText().getAttribute("placeholder");
    }

    //Задолженность
    @Step("Выбираем Задолженность для пополнения")
    public void clickArrears() {
        wait.until(ExpectedConditions.elementToBeClickable(paySectionPage.getArrears())).click();
    }
    @Step("Получаем плейсхолдер окна для номера телефона")
    public  String getScoreArrearsText() {
        return paySectionPage.getScoreArrearsText().getAttribute("placeholder");
    }
    @Step("Получаем плейсхолдер окна для суммы")
    public String getScoreArrearsSumText() {
        return paySectionPage.getArrearsSumText().getAttribute("placeholder");
    }
    @Step("Получаем плейсхолдер окна для почты")
    public String getScoreArrearsEmailText() {
        return paySectionPage.getArrearsEmailText().getAttribute("placeholder");
    }
}
