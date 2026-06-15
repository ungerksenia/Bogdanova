import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.PaymentWindowSteps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MobileServicePaymentWindowTests extends BaseTest {

    private PaymentWindowSteps paymentWindowSteps;

    @Test
    @DisplayName("Проверка корректности отображения данных в окне оплаты услуг варианта Услуги связи")
    public void checkCommunicationServicesPaymentWindow() {
        paymentWindowSteps = new PaymentWindowSteps(driver);

        paymentWindowSteps.fillPhoneField("297777777")
                          .fillSumField("78")
                          .fillEmailField("test@gmail.com")
                          .clickContinueButton()
                          .switchToPaymentIframe();

        assertEquals("78.00 BYN", paymentWindowSteps.getInsertedSumText());
        assertEquals("Оплатить 78.00 BYN", paymentWindowSteps.getSubmitButtonSumText());
        assertEquals("Нажимая на кнопку «Оплатить 78.00 BYN», " +
                "вы соглашаетесь с условиями Платежного соглашения об инициировании платежа.", paymentWindowSteps.getAgreementSumText());
        assertEquals("Оплата: Услуги связи " +
                "Номер:375297777777", paymentWindowSteps.getPayDescriptionText());
        assertEquals("Номер карты", paymentWindowSteps.getPayCardNumberText());
        assertEquals("Срок действия", paymentWindowSteps.getPayCardExpiryText());
        assertEquals("CVC", paymentWindowSteps.getPayCardCVCText());
        assertEquals("Имя и фамилия на карте", paymentWindowSteps.getPayCardPersonalDataText());
        assertFalse(paymentWindowSteps.getPaymentLogos().isEmpty(), "Иконки платёжных систем не отображаются");

        driver.switchTo().defaultContent();
    }
}
