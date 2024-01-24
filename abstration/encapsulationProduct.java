package abstration;

public class encapsulationProduct {
	private int productId;
	private String productName;
	private double price;
	
	//setter method = to set/change a value
	public void setProductId(int productId) {
		this.productId = productId;
	}
	//Getter method = to get/access a value
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public static void main(String[] args) {
		encapsulationProduct product = new encapsulationProduct();
		product.setProductId(101);
		product.setProductName("Laptop");
		product.setPrice(32000);
		
		System.out.println("Product Id: " +product.getProductId());
		System.out.println("Prodcut Name: " +product.getProductName());
		System.out.println("Product Price: " +product.getPrice());
		
	}
	

}
