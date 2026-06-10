import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PaymentLogosTest extends BaseTest {
    @Test
    @DisplayName("Проверка наличия логотипов платежных систем")
    public void checkPaymentsLogo() {
        List<String> logos = List.of("Visa", "Verified By Visa", "MasterCard", "MasterCard Secure Code",
                "Белкарт");
        List<WebElement> icons = driver.findElements(By.xpath("//section[@class='pay']//ul//li//img"));
        List<String> altList = new ArrayList<>();
        for (WebElement icon :icons) {
            altList.add(icon.getAttribute("alt"));
        }
        assertTrue(altList.containsAll(logos), "Не все ожидаемые логотипы найдены. Отсутствуют: " +
                logos.stream().filter(l -> !altList.contains(l)).toList());
    }
}