package IEbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.util.concurrent.TimeUnit;

public class NopCommerce {

    public static void main(String[] args) {

        String baseUrl = "https://www.nopcommerce.com/demo";
        System.setProperty("webdriver.ie.driver","driver/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();

        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        String title = driver.getTitle();
        System.out.println(title);
        System.out.println(title.length());

        boolean verifytitle = title.equals("Store Demo - nopCommerce");
        boolean verifyContains = title.contains("Demo");
        System.out.println(verifyContains);
        System.out.println(verifytitle);

        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        driver.close();
    }
}
