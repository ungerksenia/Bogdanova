package steps;

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
    public PaymentWindowSteps fillPhoneField(String phone) {
        paymentWindowPage.getPhoneField().sendKeys(phone);
        return this;
    }
    public PaymentWindowSteps fillSumField(String sum) {
        paymentWindowPage.getSumField().sendKeys(sum);
        return this;
    }
    public PaymentWindowSteps fillEmailField(String email) {
        paymentWindowPage.getEmailField().sendKeys(email);
        return this;
    }

    // Продолжить
    public PaymentWindowSteps clickContinueButton() {
        paymentWindowPage.getContinueButton().click();
        return this;
    }

    // Переключение на окно оплаты
    public void switchToPaymentIframe() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(paymentWindowPage.getPaymentIframe()));
    }

    // Верификация полей в окне оплаты
    public String getInsertedSumText() {
        WebElement el = wait.until(ExpectedConditions.visibilityOf(paymentWindowPage.getInsertedSum()));
        return el.getText();
    }
    public String getSubmitButtonSumText() {
        return paymentWindowPage.getSubmitButtonSum().getText();
    }
    public String getAgreementSumText() {
        return paymentWindowPage.getAgreementSum().getText();
    }
    public String getPayDescriptionText() {
        return paymentWindowPage.getPayDescriptionText().getText();
    }
    public String getPayCardNumberText() {
        return paymentWindowPage.getPayCardNumberText().getText();
    }
    public String getPayCardExpiryText() {
        return paymentWindowPage.getPayCardExpiryText().getText();
    }
    public String getPayCardCVCText() {
        return paymentWindowPage.getPayCardCVCText().getText();
    }
    public String getPayCardPersonalDataText() {
        return paymentWindowPage.getPayCardPersonalDataText().getText();
    }
    // Наличие иконок платёжных систем
    public List<WebElement>  getPaymentLogos() {
        return paymentWindowPage.getPaymentLogos();
    }

}
