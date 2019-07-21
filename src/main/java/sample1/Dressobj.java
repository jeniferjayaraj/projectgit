package sample1;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Dressobj extends BasePage1 {
	public Dressobj() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement dressestab;
	
	public WebElement getdresses() {
		return dressestab;
}
public void clickDress() {
	dressestab.click();
}
    @FindBy(xpath = "//*[@id=\"categories_block_left\"]/div/ul/li[1]/a")
     private WebElement casualdress;

    public WebElement getcasual() {
	return casualdress;
}
    public void clickDress1() {
casualdress.click();
}
    
      @FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[1]/label/a")
       private WebElement smallsize;
 
      public WebElement getSmall() {
    		return smallsize;
      }
      
      @FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[2]/label/a")
      private WebElement mediumsize;

     public WebElement getMedium() {
   		return mediumsize;
     }
     
     @FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[3]/label/a")
     private WebElement largesize;

    public WebElement getLarge() {
  		return largesize;
    }
      
    @FindBy(xpath = "//*[@id=\"center_column\"]/h1/span[2]")
    private WebElement headcount;

   public int getheadcount(){
	   String text = headcount.getText();
	   String arr[] = text.split(" ");
	   String textnum = arr[2];
	   int totalcount = Integer.parseInt(textnum);
 		return totalcount;
   }
   @FindBys(@FindBy(xpath = "//*[@id=\"center_column\"]/ul"))
   private List <WebElement> prodcount;
   
   public int getprodcount() {
 		return prodcount.size();
}  
   @FindBy(id = "newsletter-input")
   private WebElement newsletter;
   
   @FindBy(xpath = "//button[@name='submitNewsletter']")
   private WebElement submit;
   
   public WebElement getSubmit() {
	   return submit;
   }
    
    
   public void getsubscription()
   {
	   int random = new Random().nextInt(50000000);
	   System.out.println(random);
	   setText(newsletter,"Automation" + random +"@gmail.com");
	   submit.click();
   }
  @FindBy(xpath ="//p[@class='alert alert-success']")
  private WebElement check;
   
   public String getsubscriptionMessage() {
	   return check.getText();
	   
	  
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
      
}     
      
      
      
      
      
      
      
   





