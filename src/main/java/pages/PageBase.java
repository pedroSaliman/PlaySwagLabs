package pages;

import com.microsoft.playwright.Page;

public class PageBase {
    public static Page page;
    public  void setPage(Page page) {
        PageBase.page = page;
    }




    protected void type(String locator,String val){
        page.isVisible(locator);
        page.fill(locator,val);
    }
    protected void click(String locator){
        page.isVisible(locator);
        page.click(locator);
    }
    protected String Text(String locator){
        page.isVisible(locator);
        String theText=page.textContent(locator);
        System.out.println("The Text is "+ theText);
        return theText;
    }
}
