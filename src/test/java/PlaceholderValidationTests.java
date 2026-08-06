import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.PaySectionSteps;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlaceholderValidationTests extends BaseTest {

    private PaySectionSteps paySectionSteps;

    @Test
    @DisplayName("Проверка надписей в незаполненных полях каждого варианта оплаты услуг")
    public void checkPlaceholderValidation() {
        paySectionSteps= new PaySectionSteps(driver);

        //Услуги связи
        paySectionSteps.clickSelectWrapperButton();
        paySectionSteps.clickCommunicationServices();

        assertEquals("Номер телефона", paySectionSteps.getConnectionPhoneText());
        assertEquals("Сумма", paySectionSteps.getConnectionSumText());
        assertEquals("E-mail для отправки чека", paySectionSteps.getConnectionEmailText());

        //Домашний интернет
        paySectionSteps.clickSelectWrapperButton();
        paySectionSteps.clickHomeInternet();

        assertEquals("Номер абонента", paySectionSteps.getInternetPhoneText());
        assertEquals("Сумма", paySectionSteps.getInternetSumText());
        assertEquals("E-mail для отправки чека", paySectionSteps.getInternetEmailText());

        //Рассрочка
        paySectionSteps.clickSelectWrapperButton();
        paySectionSteps.clickInstalment();

        assertEquals("Номер счета на 44", paySectionSteps.getScoreInstalmentText());
        assertEquals("Сумма", paySectionSteps.getScoreInstalmentSumText());
        assertEquals("E-mail для отправки чека", paySectionSteps.getScoreInstalmentEmailText());

        //Задолженность
        paySectionSteps.clickSelectWrapperButton();
        paySectionSteps.clickArrears();

        assertEquals("Номер счета на 2073", paySectionSteps.getScoreArrearsText());
        assertEquals("Сумма", paySectionSteps.getScoreArrearsSumText());
        assertEquals("E-mail для отправки чека", paySectionSteps.getScoreArrearsEmailText());
    }

}
