package pages;


public class Home extends PageBase {



///////////////////////////////////////////////////////
    private static final     String products ="//span[@class='title']";
    private static final String AddtoCart="//button[@id='add-to-cart-sauce-labs-backpack']";
    private static final String carCart="//a[@class='shopping_cart_link']";

public String Message(){
    return Text(products);
}
public CartPage clickToCart(){
    click(AddtoCart);
    click(carCart);
    return new CartPage();
}






}
