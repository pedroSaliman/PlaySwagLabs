package pages;

public class CartPage extends PageBase{
    private static final String Price="//div[@class='inventory_item_price']";
    private static final String CheckOut="#checkout";

    public CheckOutPage checkclick(){
        click(CheckOut);
        return new CheckOutPage();
    }
    public String ThePrice(){
        return Text(Price);
    }
}
