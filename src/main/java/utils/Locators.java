package utils;

import org.openqa.selenium.By;

import java.io.InputStream;
import java.util.Properties;

public class Locators {
    private static final Properties locators;

    private enum LocatorType{
        ID, NAME, CSS, XPATH, TAG, LINK_TEXT, PART_TEXT
    }

    static {
        locators = new Properties();
        InputStream is = Locators.class.getResourceAsStream("src/main/resources/locators.properties");
        try {
            locators.load(is);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String title(String pageName){
        return locators.getProperty(pageName);
    }

    public static By get(String locatorName){
        String propertyValue = locators.getProperty(locatorName);
        return getLocator(propertyValue);
    }

    public static By get(String locatorName, String parameter){
        String propertyValue = locators.getProperty(locatorName);
        return getLocator(String.format(propertyValue, parameter));
    }

    public static By getLocator(String locator){
        String[] locatorItems = locator.split("=", 2);
        LocatorType locatorType = LocatorType.valueOf(locatorItems[0]);

        switch(locatorType){
            case ID:{
                return By.id(locatorItems[1]);
            }
            case NAME:{
                return By.name(locatorItems[1]);
            }
            case CSS:{
                return By.cssSelector(locatorItems[1]);
            }
            case XPATH:{
                return By.xpath(locatorItems[1]);
            }
            case TAG:{
                return By.tagName(locatorItems[1]);
            }
            case LINK_TEXT:{
                return By.linkText(locatorItems[1]);
            }
            case PART_TEXT:{
                return By.partialLinkText(locatorItems[1]);
            }
            default:{
                throw new IllegalArgumentException("No such locator type: " + locatorItems[0]);
            }
        }
    }
}
