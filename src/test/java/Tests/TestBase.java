package Tests;

import Factory.FactoryInit;
import Factory.FrameWorkConfig;
import com.github.javafaker.Faker;
import com.microsoft.playwright.Page;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.PageBase;

import java.util.Locale;

public class TestBase {

    Page page;
FrameWorkConfig config;
FactoryInit fact;
    Faker faker = new Faker(new Locale("es"));
    String email=faker.internet().safeEmailAddress();
@BeforeTest
    public void setup(){

    config= ConfigFactory.create(FrameWorkConfig.class);
    page=new FactoryInit().init(config.browser());
    new PageBase().setPage(page);

}
@AfterTest
    public void TearDown(){
    page.context().browser().close();
}
}
