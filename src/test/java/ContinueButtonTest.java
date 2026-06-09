import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ContinueButtonTest extends BaseTest {
    @Test
    @DisplayName("Проверка работы кнопки «Продолжить»")
    public void checkContinueButton() {
        driver.findElement(By.xpath("//section[@class='pay']//input[@id='connection-phone']")).sendKeys("297777777");
        driver.findElement(By.xpath("//section[@class='pay']//input[@id='connection-sum']")).sendKeys("78");
        driver.findElement(By.xpath("//section[@class='pay']//button[@type='submit']")).click();
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@class='payment-widget-iframe']")));

    }
}
