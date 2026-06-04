import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class MoreLinkTest extends BaseTest {
    @Test
    @DisplayName("Проверка работы ссылки «Подробнее о сервисе» ")
    public void checkMoreLink(){
        driver.findElement(By.xpath("//section[@class='pay']//a[@href='/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/']")).click();
        assertFalse(driver.getCurrentUrl().equals("https://www.mts.by"));
    }
}