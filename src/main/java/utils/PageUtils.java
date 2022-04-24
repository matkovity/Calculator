package utils;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class PageUtils {

    protected void clickOnElement(SelenideElement target) {
        target.click();
        log.debug("Clicked on element: " + target);
    }

    protected String getTextFromElement(SelenideElement target) {
        String result = target.getValue();
        log.debug("Get text: '" + result + "' from element: " + target);
        return result;
    }

    protected List<String> getTextFromElements(ElementsCollection targets) {
        List<String> result = new ArrayList<>();
        for (SelenideElement singleElement : targets) {
            result.add(singleElement.getText());
        }
        return result;
    }


}
