package browser;

import org.openqa.selenium.WebDriver;

public class DriverManager { //Quản lý phiên làm việc của driver

    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>(); //Khai báo biến driver = threadlocal chỉ chứa các luồng webdriver

    private DriverManager(){
    }
    public static WebDriver getDriver() {
        return driver.get();
    }
    public static void setDriver(WebDriver driver){
        DriverManager.driver.set(driver);
    }
    public static void quit(){
        DriverManager.driver.get().quit();
        driver.remove();
    }
}
