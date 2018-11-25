package utils;

import java.io.InputStream;
import java.util.Properties;

public class TestDataProperties {
    private static final Properties testdata;

    static {
        testdata = new Properties();
        InputStream is = TestDataProperties.class.getResourceAsStream("/src/main/resources/testdata.properties");
        try {
            testdata.load(is);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String getTestProperty(String key){
        return testdata.getProperty(key);
    }
}
