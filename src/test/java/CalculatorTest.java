import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CalculatorPage;
import utils.BaseTest;

import java.util.List;

public class CalculatorTest extends BaseTest {

    CalculatorPage calculatorPage = new CalculatorPage();

    @Test
    public void calculatorTest() {
        List<String> expectedHistory = List.of("sqrt(81", "cos(pi", "35*999+(100/4)");

        calculatorPage
                .acceptConsent()
                .number(35).multiply().number(999)
                .plus()
                .leftBracket().number(100).divide().number(4).rightBracket()
                .calculate();
        Assert.assertEquals(34990, calculatorPage.getResult());

        calculatorPage
                .clear()
                .cos().pi().rad()
                .calculate();
        Assert.assertEquals(-1, calculatorPage.getResult());

        calculatorPage
                .clear()
                .sqrt().number(81)
                .calculate();
        Assert.assertEquals(9, calculatorPage.getResult());

        Assert.assertEquals(expectedHistory, calculatorPage.getHistory());
    }
}
