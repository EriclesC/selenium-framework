package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Log;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    private By userNameTextBox = By.id("Email");
    private By passwordTextBox = By.id("Password");
    private By loginButton = By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div/form/div[3]/button");

    public void enterUserName(String username){
        driver.findElement(userNameTextBox).clear();
        driver.findElement(userNameTextBox).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(passwordTextBox).clear();
        driver.findElement(passwordTextBox).sendKeys(password);
    }

    public void clickLogin(){
        Log.info("Clicking login button... ");
        driver.findElement(loginButton).click();
    }
}
