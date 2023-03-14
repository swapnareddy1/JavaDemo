package BuilderPattern;

public class UserShopping {

	public static void main(String[] args) 
	{
		
		EcomApplication e=new EcomApplication();
		
		e.login("swapna","jambula")
		  .doSearch("tshirt")
		   .addToCart("tshirt")
		    .doSearch("skirt", 500,"ck")
		     .addToCart("skirt")
		      .doPayment(123456,876)
		       .generateOrder()
		        .logout();
		
		

	}

}
