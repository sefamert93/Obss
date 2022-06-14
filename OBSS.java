// Generated by Selenium IDE

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.HashMap;
import java.util.Map;

public class OBSS {
  private WebDriver driver;
  private Map<String, Object> vars;

  private final String Base_URL= "https://obss.com.tr/";
  JavascriptExecutor js;
  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver","src/test/resource/drivers/chromedriver.exe");
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    //driver.quit();
  }
  @Test
  public void ilkotomasyontesti() {
    driver.get(Base_URL);
    driver.findElement(By.id("cookieAcceptance")).click();
    driver.manage().window().setSize(new Dimension(1920, 1080));
    driver.findElement(By.id("search-icon")).click();
    driver.findElement(By.id("search-box")).click();
    driver.findElement(By.id("search-box")).sendKeys("Automation");
    driver.findElement(By.id("search-box")).sendKeys(Keys.ENTER);
    String searchKontrol = driver.findElement(By.xpath("//article[1]/h2/a")).getText();
    Assert.assertTrue(searchKontrol.contains("Testing & Automation"));
    driver.findElement(By.xpath("//article[1]/h2/a")).click();
    String otomasyonKontrol = driver.findElement(By.xpath("//*[@id=\"intro-industries\"]/div/div/div/h1")).getText();
    Assert.assertTrue(otomasyonKontrol.contains("Testing & Automation"));
    JavascriptExecutor js = (JavascriptExecutor) driver;
    WebElement Element = driver.findElement(By.xpath("/html/body/div[4]/div/div/footer/div/div[6]/div[2]/img"));
    js.executeScript("arguments[0].scrollIntoView();", Element);
  }
}
