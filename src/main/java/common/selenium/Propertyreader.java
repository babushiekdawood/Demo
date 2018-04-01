package common.selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by in.Babushaik on 8/7/2017.
 */
public class Propertyreader {
    Properties properties = new Properties();
    InputStream inputStream = null;

    public Propertyreader() {
        loadProperties();
    }

    private void loadProperties() {
        try {
            inputStream = new FileInputStream("src/main/java/Util/config");
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readProperty(String key) {
        return properties.getProperty(key);
    }
}

