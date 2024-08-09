package AmazonAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // Set the path for the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/Users/kesri/Downloads/chromedriver-mac-arm64/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Set implicit wait timeout
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        try {
            // Navigate to the Amazon sign-in page
            driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Faw%2Fd%2FB0CHX2WQLX%2F%3F_encoding%3DUTF8%26pd_rd_plhdr%3Dt%26aaxitk%3D69c382013700199a3fc322dc4f40afc7%26hsa_cr_id%3D0%26qid%3D1717321226%26sr%3D1-2-e0fa1fdd-d857-4087-adda-5bd576b25987%26ref_%3Dnav_ya_signin%26pd_rd_w%3DnAv0I%26content-id%3Damzn1.sym.df9fe057-524b-4172-ac34-9a1b3c4e647d%253Aamzn1.sym.df9fe057-524b-4172-ac34-9a1b3c4e647d%26pf_rd_p%3Ddf9fe057-524b-4172-ac34-9a1b3c4e647d%26pf_rd_r%3DHQWBK1ZR4FR5FGKKM75S%26pd_rd_wg%3DcA2cd%26pd_rd_r%3Dbed4f1c9-8274-49da-8add-f90933398fd9&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

            // Enter email/phone number
            WebElement email = driver.findElement(By.id("ap_email"));
            email.sendKeys("8601045120");

            // Click on the continue button
            WebElement continueButton = driver.findElement(By.id("continue"));
            continueButton.click();

            // Enter password
            WebElement password = driver.findElement(By.id("ap_password"));
            password.sendKeys("amazon@kesri1");

            // Click on the login button
            WebElement loginButton = driver.findElement(By.id("signInSubmit"));
            loginButton.click();

            // Wait for the search box to be visible and enter the search term
            WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.sendKeys("iPhone 15");

            // Submit the search form
            WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
            searchButton.click();

            // Click on the specific product link
            WebElement productLink = driver.findElement(By.linkText("Apple iPhone 15 (256 GB) - Black"));
            productLink.click();

            // Click on the buy now button
            WebElement buyNowButton = driver.findElement(By.id("buy-now-button"));
            buyNowButton.click();


            // Wait for at least 10 seconds before quitting
            Thread.sleep(10000);
        } catch (Exception e) {
            // Handle any exceptions that occur during the process
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}