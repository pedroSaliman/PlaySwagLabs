package pages;

public class CheckOutOverView extends PageBase{
    private static final String Tittle="//span[@class='title']";
    private static final String Button="#finish";

    public String Tex(){
        return Text(Tittle);
    }

    public FinishPage clickF(){
        click(Button);
        return new FinishPage();
    }
}
