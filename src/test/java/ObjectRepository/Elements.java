package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Elements {

    @FindBy(xpath = "//*[@id='nav-link-accountList']/span/span")
    public static WebElement homePage_signin_btn;

   @FindBy(id = "ap_email")
    public static WebElement email_txt;

    @FindBy(id = "ap_password")
    public static WebElement password_txt;

    @FindBy(id = "continue")
    public static WebElement continue_btn;

    @FindBy(id = "signInSubmit")
    public static WebElement signin_btn;

    @FindBy(xpath="//*[@id='auth-error-message-box']/div/h4")
    public static WebElement error_msg;

    @FindBy(id = "nav-link-accountList-nav-line-1")
    public static WebElement verify_login;

    @FindBy(xpath = "//*[@id='authportal-main-section']/div[2]/div/div[1]/form/div/div/div/div[3]/div/a/span")
    public static WebElement needhelp_link;

    @FindBy(id = "auth-fpp-link-bottom")
    public static WebElement forgotPass_link;

    @FindBy(xpath = "//*[@id='cvf-submit-otp-button']/span/input")
    public static WebElement ContinueOTP_btn;

    @FindBy(xpath = "//*[@id='ap_fpp_password']")
    public static WebElement passchange_btn;

    @FindBy(id = "ap_fpp_password_check")
    public static WebElement passchangeverify_btn;









}
