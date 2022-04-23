package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class CalculatorPage {

    private final static SelenideElement button0 = $(byId("Btn0"));
    private final static SelenideElement button1 = $(byId("Btn1"));
    private final static SelenideElement button3 = $(byId("Btn3"));
    private final static SelenideElement button4 = $(byId("Btn4"));
    private final static SelenideElement button5 = $(byId("Btn5"));
    private final static SelenideElement button9 = $(byId("Btn9"));
    private final static SelenideElement buttonPlus = $(byId("BtnPlus"));
    private final static SelenideElement buttonMultiply = $(byId("BtnMult"));
    private final static SelenideElement buttonDivide = $(byId("BtnDiv"));
    private final static SelenideElement buttonCalculate = $(byId("BtnCalc"));

    public CalculatorPage pressNull() {
        button0.click();
        return this;
    }

    public CalculatorPage pressOne() {
        button1.click();
        return this;
    }

    public CalculatorPage pressThree() {
        button3.click();
        return this;
    }

    public CalculatorPage pressFour() {
        button4.click();
        return this;
    }

    public CalculatorPage pressFive() {
        button5.click();
        return this;
    }

    public CalculatorPage pressNine() {
        button9.click();
        return this;
    }

    public CalculatorPage pressPlus() {
        buttonPlus.click();
        return this;
    }

}
