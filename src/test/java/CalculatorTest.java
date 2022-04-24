import org.junit.Assert;
import org.junit.Test;
import pages.CalculatorPage;
import utils.BaseTest;

public class CalculatorTest extends BaseTest {

    CalculatorPage calculatorPage = new CalculatorPage();

    @Test
    public void simpleMathTest() {
        calculatorPage
                .acceptConsent()
                .number(35).multiply().number(999)
                .plus()
                .leftBracket().number(100).divide().number(4).rightBracket()
                .calculate();

        Assert.assertEquals(34990, calculatorPage.getResult());

        calculatorPage
                .clear();

    }
}
