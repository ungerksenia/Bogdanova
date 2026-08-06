package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
public class PaymentWindowPage {
    // Услуги связи
    @FindBy(xpath = "//section[@class='pay']//input[@id='connection-phone']")
    private WebElement phoneField;
    @FindBy(xpath = "//section[@class='pay']//input[@id='connection-sum']")
    private WebElement sumField;
    @FindBy(xpath = "//input[@id='connection-email']")
    private WebElement emailField;
    // Продолжить
    @FindBy(xpath = "//section[@class='pay']//button[@type='submit']")
    private WebElement continueButton;
    // Переключение на окно оплаты
    @FindBy(xpath = "//iframe[@class='payment-widget-iframe']")
    private  WebElement paymentIframe;
    // Верификация полей в окне оплаты
    @FindBy(xpath = "//span[@class='ng-star-inserted']")
    private WebElement insertedSum;
    @FindBy(xpath = "//button[@type='submit']//span")
    private WebElement submitButtonSum;
    @FindBy(xpath = "//div[@class='card-page__agreement ng-star-inserted']//span")
    private WebElement agreementSum;
    @FindBy(xpath = "//div[@class='pay-description__text']//span")
    private WebElement payDescriptionText;
    @FindBy(xpath = "//label[@class='ng-tns-c2312288139-2 ng-star-inserted']")
    private WebElement payCardNumberText;
    @FindBy(xpath = "//label[@class='ng-tns-c2312288139-4 ng-star-inserted']")
    private WebElement payCardExpiryText;
    @FindBy(xpath = "//label[@class='ng-tns-c2312288139-5 ng-star-inserted']")
    private WebElement payCardCVCText;
    @FindBy(xpath = "//label[@class='ng-tns-c2312288139-3 ng-star-inserted']")
    private WebElement payCardPersonalDataText;
    @FindBy(xpath = "//div[@class='cards-brands ng-tns-c2312288139-2']//div//img")
    private List<WebElement> paymentLogos;
}
