package Entitie;

public class ProductPurchase {

	public String nameProduct;
	public double purchasePrice;
	public Integer purchaseQuantity;
	
	public ProductPurchase(String nameProduct, double purchasePrice, Integer purchaseQuantity) {
		this.nameProduct = nameProduct;
		this.purchasePrice = purchasePrice;
		this.purchaseQuantity = purchaseQuantity;
	}

	public ProductPurchase() {
		
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Integer getPurchaseQuantity() {
		return purchaseQuantity;
	}

	public void setPurchaseQuantity(Integer purchaseQuantity) {
		this.purchaseQuantity = purchaseQuantity;
	}
	
	
	
}
