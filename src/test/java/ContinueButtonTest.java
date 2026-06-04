import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class ContinueButtonTest extends BaseTest {
    @Test
    @DisplayName("Проверка работы кнопки «Продолжить»")
    public void checkContinueButton() {
        driver.findElement(By.xpath("//section[@class='pay']//input[@id='connection-phone']")).sendKeys("297777777");
        driver.findElement(By.xpath("//section[@class='pay']//input[@id='connection-sum']")).sendKeys("78");
        driver.findElement(By.xpath("//section[@class='pay']//button[@type='submit']")).click();
        assertFalse(driver.getCurrentUrl().equals("https://www.mts.by"));
    }
}
