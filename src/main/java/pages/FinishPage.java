package pages;

public class FinishPage extends PageBase{
    private static final String Order=".complete-header";


    public String Message(){
        return Text(Order);
    }
}
