
public class Product {

	private String name;
	private int stockLevel;
	private double price;
	
	public Product (String pName, int pStockLevel, double pPrice) {
		name = pName;
		stockLevel = pStockLevel;
		price = pPrice;
		
	} 
	
	public void reStock (int pNew) {
		stockLevel = stockLevel + pNew;
		
	}
	
	public double sell (int pNumberSold) {
		stockLevel = stockLevel - pNumberSold;
		return pNumberSold*price;
	}
	
	public void setPrice (double pPrice) {
		price = pPrice;
	}
	
	public String getName () {
		return name;
	}
	
	public int getStockLevel () {
		return stockLevel;
	}
	
	public double getPrice () {
		return price;
	}
	
	
	
	
}
