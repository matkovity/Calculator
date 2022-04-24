package utils;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class PageUtils {

    private static final Logger logger = Logger.getLogger(PageUtils.class.getName());

    protected void clickOnElement(SelenideElement target) {
        target.click();
        logger.info("Clicked on element: " + target);
    }

    protected String getTextFromElement(SelenideElement target) {
        String result = target.getValue();
        logger.info("Get text: '" + result + "' from element: " + target);
        return result;
    }

    protected List<String> getTextFromElements(ElementsCollection targets) {
        List<String> result = new ArrayList<>();
        for (SelenideElement singleElement : targets) {
            result.add(singleElement.getText());
        }
        logger.info("Get texts: '" + result + "' from elements: " + targets);
        return result;
    }


}
