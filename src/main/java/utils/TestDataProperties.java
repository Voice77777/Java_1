package utils;

import java.io.InputStream;
import java.util.Properties;

public class TestDataProperties {
    private static final Properties testData;

    static {
        testData = new Properties();
        InputStream is = TestDataProperties.class.getResourceAsStream("/src/main/resources/testdata.properties");
        try {
            testData.load(is);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static String getTestProperty(String key){
        return testData.getProperty(key);
    }
}
