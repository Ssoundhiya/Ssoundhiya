package demopractice.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BaseClass {

    public static Properties prop = null;
    public WebDriver driver;
    Logger log= LogManager.getLogger(BaseClass.class);
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
              log.info("Browser is opened......");
              log.warn("warn......");
              log.fatal("fatal.....");
        }else if(browserName.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
             driver = new FirefoxDriver();
        }else if(browserName.equalsIgnoreCase("edge")){
            WebDriverManager.edgedriver().setup();
             driver = new EdgeDriver();
        }
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        return driver;
    }

    public void closeDriver(){
        driver.close();
    }
}
