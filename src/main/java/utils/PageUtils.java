package utils;

import com.codeborne.selenide.SelenideElement;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PageUtils {

    protected void clickOnElement(SelenideElement target) {
        target.click();
        log.info("Clicked on element: " + target);
    }

    protected String getTextFromElement(SelenideElement target) {
        String result = target.getValue();
        log.info("Get text: '" + result + "' from element: " + target);
        return result;
    }
}
