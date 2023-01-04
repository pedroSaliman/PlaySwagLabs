package pages;

public class LoginPage extends PageBase {




    private static final String Email="//input[@id='user-name']";
    private static final String Password="#password";
    private static final String Button="#login-button";


    //////////////////////////////////////////////

    public Home LoginProcess(String email,String password){
        type(Email,email);
        type(Password,password);
        click(Button);
        return new Home();


    }

}
