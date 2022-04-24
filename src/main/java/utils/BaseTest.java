package utils;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @BeforeMethod
    public void before() {
        Configuration.browser = loadProperty().getProperty("browser");
        open("https://web2.0calc.com/");
    }

    private Properties loadProperty() {
        Properties prop = new Properties();
        try (InputStream input = new FileInputStream("src/main/resources/browserProperties.properties")) {
            prop.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return prop;
    }

}
