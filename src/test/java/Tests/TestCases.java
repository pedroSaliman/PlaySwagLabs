package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class TestCases extends TestBase{
@Test
    public void Login(){
    new LoginPage().LoginProcess(config.username(),config.password());
    Assert.assertEquals("Products",new Home().Message());
}
@Test(dependsOnMethods = {"Login"})
    public void Cart(){
    new Home().clickToCart();
    Assert.assertEquals("$29.99",new CartPage().ThePrice());
}
@Test(dependsOnMethods = {"Cart"})
    public void checkout(){
    new CartPage().checkclick();
    Assert.assertEquals("Checkout: Your Information",new CheckOutPage().message());
    new CheckOutPage().info(config.fname(),config.lname(),config.zib());
    Assert.assertEquals("Checkout: Overview",new CheckOutOverView().Tex());
}
@Test(dependsOnMethods = {"checkout"})
    public void Finish(){
    new CheckOutOverView().clickF();
    Assert.assertEquals("THANK YOU FOR YOUR ORDER",new FinishPage().Message());
}
}
