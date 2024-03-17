import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EndToEndFlow {
    WebDriver driver;

    @BeforeMethod
    public void before() {
        driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com");
    }

    @Test
    public void logIn() {
        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");


        WebElement password = driver.findElement(By.id("password"));
        userName.sendKeys("secret_sauce");

        WebElement logInButton = driver.findElement(By.id("login-button"));
        logInButton.click();
    }


    @Test
    public void selectingItems() {

        /*Selecting a specific item*/
        WebElement addToCartButton = driver.findElement(By.cssSelector("button#add-to-cart-sauce-labs-bike-light"));
        addToCartButton.click();

        /*Selecting the last item*/
        WebElement userName = driver.findElement(By.cssSelector("div.inventory_list>div:last-child>.inventory_item_img"));
        userName.click();
        WebElement singleItemAdd = driver.findElement(By.cssSelector("button.btn_inventory"));
        singleItemAdd.click();
        WebElement goBack = driver.findElement(By.cssSelector("button.back"));
        goBack.click();

    }

//    @Test
//    public void checkingOut() {
//        /*Go to cart*/
//        WebElement toCart = driver.findElement(By.cssSelector(".shopping_cart_link"));
//        toCart.click();
//
//        /*Remove item form cart*/
//        WebElement removeFromCart = driver.findElement(By.cssSelector("#remove-test.allthethings()-t-shirt-(red)"));
//        removeFromCart.click();
//
//        /*Checkout*/
//        WebElement checkout = driver.findElement(By.cssSelector("#checkout"));
//        checkout.click();
//
//        /*Checkout details*/
//        WebElement firstName = driver.findElement(By.cssSelector("#first-name"));
//        firstName.sendKeys("Georgi");
//
//        WebElement lastName = driver.findElement(By.cssSelector("#last-name"));
//        lastName.sendKeys("Dimitrov");
//
//        WebElement postalCode = driver.findElement(By.cssSelector("#postal-code"));
//        postalCode.sendKeys("9000");
//
//        WebElement continueButton = driver.findElement(By.cssSelector("input#continue"));
//        continueButton.click();
//
//        WebElement finishButton = driver.findElement(By.cssSelector("button#finish"));
//        finishButton.click();
//
//        /*Back to Home*/
//        WebElement toHomeButton = driver.findElement(By.cssSelector("button#back-to-products"));
//        toHomeButton.click();
//
//    }


}