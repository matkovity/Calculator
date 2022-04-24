package utils;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    private static final String urlToProperties = "src/main/resources/browserProperties.properties";

    @BeforeMethod
    public void before() {
        Configuration.browser = loadProperty().getProperty("browser");
        open("https://web2.0calc.com/");
    }

    private Properties loadProperty() {
        Properties prop = new Properties();
        try (InputStream input = new FileInputStream(urlToProperties)) {
            prop.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return prop;
    }

}
