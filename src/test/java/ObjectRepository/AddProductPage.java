package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddProductPage {

    @FindBy(id = "twotabsearchtextbox")
    public static WebElement search_txt;

    @FindBy(id = "nav-search-submit-button")
    public static WebElement search_button;

    @FindBy(xpath = "//*[text()='Mokobara Backpack Pro 16\" Inch Laptop Backpack For Men And Women (21 litre )']")
    public static WebElement laptop_link;

    @FindBy(id="add-to-cart-button")
    public static WebElement Add_to_cart_btn;

    @FindBy(id = "//*[@id='search']//following::a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']")
    public static WebElement product_link;

    @FindBy(xpath = "//*[text()= 'Add to Cart']")
    public static WebElement addtocart_Hp_btn;

    @FindBy(xpath = "//*[@id='nav-cart']")
    public static WebElement add_cart_btn;

    @FindBy(name = "proceedToRetailCheckout")
    public static WebElement Proceed_buy_btn;


}

