package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PaymentWindowPage;

import java.time.Duration;
import java.util.List;

public class PaymentWindowSteps {

    private final PaymentWindowPage paymentWindowPage;
    private final WebDriverWait wait;

    public PaymentWindowSteps(WebDriver driver) {
        this.paymentWindowPage = PageFactory.initElements(driver, PaymentWindowPage.class);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    //Услуги связи
    @Step("Заполняем поле для телефона")
    public PaymentWindowSteps fillPhoneField(String phone) {
        paymentWindowPage.getPhoneField().sendKeys(phone);
        return this;
    }
    @Step("Заполняем поле для суммы")
    public PaymentWindowSteps fillSumField(String sum) {
        paymentWindowPage.getSumField().sendKeys(sum);
        return this;
    }
    @Step("Заполняем поле для почты")
    public PaymentWindowSteps fillEmailField(String email) {
        paymentWindowPage.getEmailField().sendKeys(email);
        return this;
    }

    // Продолжить
    @Step("Нажимаем кнопку Продолжить")
    public PaymentWindowSteps clickContinueButton() {
        paymentWindowPage.getContinueButton().click();
        return this;
    }

    // Переключение на окно оплаты
    @Step("Переключаем на модальное окно с оплатой")
    public void switchToPaymentIframe() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(paymentWindowPage.getPaymentIframe()));
    }

    // Верификация полей в окне оплаты
    @Step("Получаем плейсхолдер итоговой суммы пополнения")
    public String getInsertedSumText() {
        WebElement el = wait.until(ExpectedConditions.visibilityOf(paymentWindowPage.getInsertedSum()));
        return el.getText();
    }
    @Step("Получаем плейсхолдер кнопки оплаты")
    public String getSubmitButtonSumText() {
        return paymentWindowPage.getSubmitButtonSum().getText();
    }
    @Step("Получаем плейсхолдер соглашения пользователя")
    public String getAgreementSumText() {
        return paymentWindowPage.getAgreementSum().getText();
    }
    @Step("Получаем плейсхолдер описания платежа")
    public String getPayDescriptionText() {
        return paymentWindowPage.getPayDescriptionText().getText();
    }
    @Step("Получаем плейсхолдер поля Номер карты")
    public String getPayCardNumberText() {
        return paymentWindowPage.getPayCardNumberText().getText();
    }
    @Step("Получаем плейсхолдер поля Срока действия")
    public String getPayCardExpiryText() {
        return paymentWindowPage.getPayCardExpiryText().getText();
    }
    @Step("Получаем плейсхолдер поля CVC")
    public String getPayCardCVCText() {
        return paymentWindowPage.getPayCardCVCText().getText();
    }
    @Step("Получаем плейсхолдер поля персональных данных")
    public String getPayCardPersonalDataText() {
        return paymentWindowPage.getPayCardPersonalDataText().getText();
    }
    // Наличие иконок платёжных систем
    @Step("Получаем платежные логотипы")
    public List<WebElement>  getPaymentLogos() {
        return paymentWindowPage.getPaymentLogos();
    }

}
