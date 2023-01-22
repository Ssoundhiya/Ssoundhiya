package assign12.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BassClass {

    public static Properties prop = null;
    public WebDriver driver;

    public WebDriver getDriver(){
        return driver;
    }

    @BeforeSuite
    public Properties readProperties() throws IOException {
        String projectPath = System.getProperty("user.dir");
        File file = new File(projectPath +"\\src\\test\\resources\\config.properties");
        FileInputStream fin = new FileInputStream(file);
        prop = new Properties();
        prop.load(fin);
        return prop;
    }

    public WebDriver initBrowser(String browserName){
        if(browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
              driver = new ChromeDriver();
        }else if(browserName.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
             driver = new FirefoxDriver();
        }else if(browserName.equalsIgnoreCase("edge")){
            WebDriverManager.edgedriver().setup();
             driver = new EdgeDriver();
        }
        driver.get(prop.getProperty("base.url"));
        driver.manage().window().maximize();
        return driver;
    }
}
