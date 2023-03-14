package BuilderPattern;

public class EcomApplication {
 
public EcomApplication login()
{
	System.out.println("login");
	return this;
	}
public EcomApplication login(String username,String pswd)
{
	System.out.println("login with username :"+username+" "+"password : "+pswd);
	return this;
}

public EcomApplication doSearch(String productname)
{
	System.out.println("search "+productname);
	return this;
}
public EcomApplication doSearch(String productname,int price)
{
	System.out.println("search "+productname+"  "+price);
	return this;
}
public EcomApplication doSearch(String productname,int price,String brand)
{
	System.out.println("search "+productname+"  "+brand+"  "+price);
	return this;
}
public EcomApplication addToCart(String productname)
{
	System.out.println("add "+productname+" tocart");
	return this;
}
public EcomApplication doPayment(int cc,int cvv) 
{
	System.out.println("pay with card "+cc+" "+"cvv"+cvv);
	return this;
}
public EcomApplication doPayment(String paypal,String pswd) 
{
	System.out.println("pay with paypal id"+paypal+" "+pswd);
	return this;
}
public EcomApplication generateOrder()
{
	System.out.println("generate order");
	return this;
}
public void logout()
{
	System.out.println("logout");
}
}
