package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestDataProperties {
    protected static FileInputStream fileInputStream;
    protected static Properties PROPERTIES;

    static {
        try {
            fileInputStream = new FileInputStream("/src/main/resources/testdata.properties");
            PROPERTIES = new Properties();
            PROPERTIES.load(fileInputStream);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (fileInputStream != null)
                try {
                    fileInputStream.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
    public static String getTestProperty(String key){
        return PROPERTIES.getProperty(key);
    }
}
