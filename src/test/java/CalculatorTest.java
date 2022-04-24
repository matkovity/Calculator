import org.junit.Assert;
import org.junit.Test;
import pages.CalculatorPage;
import utils.BaseTest;

public class CalculatorTest extends BaseTest {

    CalculatorPage calculatorPage = new CalculatorPage();

    @Test
    public void calculatorTest() {
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


    }
}
