package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import utils.PageUtils;

import javax.swing.event.DocumentEvent;

import java.util.List;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.*;

public class CalculatorPage extends PageUtils {

    private final static String button = "Btn%s";
    private final static SelenideElement buttonPlus = $(byId("BtnPlus"));
    private final static SelenideElement buttonMultiply = $(byId("BtnMult"));
    private final static SelenideElement buttonDivide = $(byId("BtnDiv"));
    private final static SelenideElement buttonCalculate = $(byId("BtnCalc"));
    private final static SelenideElement buttonBracketLeft = $(byId("BtnParanL"));
    private final static SelenideElement buttonBracketRight = $(byId("BtnParanR"));
    private final static SelenideElement fieldResult = $(byId("input"));
    private final static SelenideElement buttonConsent = $x("//button[@class='fc-button fc-cta-consent fc-primary-button']//p");
    private final static SelenideElement buttonClear = $(byId("BtnClear"));
    private final static SelenideElement buttonCos = $(byId("BtnCos"));
    private final static SelenideElement buttonPi = $(byId("BtnPi"));
    private final static SelenideElement buttonRad = $(byId("trigorad"));
    private final static SelenideElement buttonSqrt = $(byId("BtnSqrt"));
    private final static SelenideElement buttonHistory = $(byId("hist"));
    private final static ElementsCollection historyElements = $$x("//ul/li/p[@data-inp]");

    public CalculatorPage number(Integer number) {
        String numberString = Integer.toString(number);
        for (int i = 0; i < numberString.length(); i++) {
            clickOnElement($(byId(String.format(button, numberString.charAt(i)))));
        }
        return this;
    }

    public CalculatorPage plus() {
        clickOnElement(buttonPlus);
        return this;
    }

    public CalculatorPage multiply() {
        clickOnElement(buttonMultiply);
        return this;
    }

    public CalculatorPage divide() {
        clickOnElement(buttonDivide);
        return this;
    }

    public CalculatorPage calculate() {
        clickOnElement(buttonCalculate);
        return this;
    }

    public CalculatorPage leftBracket() {
        clickOnElement(buttonBracketLeft);
        return this;
    }

    public CalculatorPage rightBracket() {
        clickOnElement(buttonBracketRight);
        return this;
    }

    public int getResult() {
        return Integer.parseInt(getTextFromElement(fieldResult));
    }

    public CalculatorPage acceptConsent() {
        clickOnElement(buttonConsent);
        return this;
    }

    public CalculatorPage clear() {
        clickOnElement(buttonClear);
        return this;
    }

    public CalculatorPage cos() {
        clickOnElement(buttonCos);
        return this;
    }

    public CalculatorPage pi() {
        clickOnElement(buttonPi);
        return this;
    }

    public CalculatorPage rad() {
        clickOnElement(buttonRad);
        return this;
    }

    public CalculatorPage sqrt() {
        clickOnElement(buttonSqrt);
        return this;
    }

    public List<String> getHistory() {
        clickOnElement(buttonHistory);
        return getTextFromElements(historyElements);
    }
}
