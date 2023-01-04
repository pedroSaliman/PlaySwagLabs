package pages;

public class CheckOutPage extends PageBase{
    private static final String Tittle="//span[@class='title']";
    private static final String fname="#first-name";
    private static final String lastname="#last-name";
    private static final String zibcode="#postal-code";
    private static final String Button="#continue";
    public String message(){
        return Text(Tittle);

    }
public void info(String First,String Last,String Zib){
        type(fname,First);
        type(lastname,Last);
        type(zibcode,Zib);
        click(Button);
}
}
