import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CalculatorPage;
import utils.BaseTest;
import utils.DataProvider;

public class CalculatorTest extends BaseTest {

    CalculatorPage calculatorPage = new CalculatorPage();

    @Test()
    public void calculatorTest() {

        calculatorPage
                .acceptConsent()
                .number(35).multiply().number(999)
                .plus()
                .leftBracket().number(100).divide().number(4).rightBracket()
                .calculate();
        Assert.assertEquals(calculatorPage.getResult(), 34990);

        calculatorPage
                .clear()
                .cos().pi().rad()
                .calculate();
        Assert.assertEquals(-1, calculatorPage.getResult());

        calculatorPage
                .clear()
                .sqrt().number(81)
                .calculate();
        Assert.assertEquals(calculatorPage.getResult(), 9);

        Assert.assertEquals(DataProvider.getExpectedHistory(), calculatorPage.getHistory());
    }
}
