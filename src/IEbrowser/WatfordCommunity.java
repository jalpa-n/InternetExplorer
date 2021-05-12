package IEbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class WatfordCommunity {

    public static void main(String[] args) {

        String baseUrl = "https://www.wcht.org.uk";
        System.setProperty("webdriver.ie.driver","driver/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();

        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        String title = driver.getTitle();
        System.out.println(title);
        System.out.println(title.length());

        boolean verifytitle = title.equals("Watford Community Housing homepage | Watford Community Housing");
        boolean verifyContains = title.contains("Communitypage");
        System.out.println(verifytitle);
        System.out.println(verifyContains);

        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        driver.close();
    }



}
