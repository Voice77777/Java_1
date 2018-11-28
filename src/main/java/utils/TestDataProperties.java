package utils;

        import java.io.FileInputStream;
        import java.io.IOException;
        import java.util.Properties;

public class TestDataProperties {
    protected static  FileInputStream fileInputStream;
    protected static  Properties testdata;

    static {
        try {
            fileInputStream = new FileInputStream("src/main/resources/testdata.properties");
            testdata = new Properties();
            testdata.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null)
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    public static String getTestProperty(String key) {
        return testdata.getProperty(key);
    }
}
