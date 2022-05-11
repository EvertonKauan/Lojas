package Entitie;

public class ProductSale {
	private ProductPurchase prodPurch;
	private Provider prov;
	private Client cliente;
	
	private Double priceSale;
	
	public ProductSale(double purchPrice, String nameProduct, String providerName, String nameCliente) {}
	
	//public ProductSale(ProductPurchase prodPurch, Provider providerName, Client nameCliente) {
		//this.prodPurch = prodPurch;
		//this.prov = providerName;
		//this.cliente = nameCliente;
	//}

	public ProductPurchase getProdPurch() {
		return prodPurch;
	}

	public void setProdPurch(ProductPurchase prodPurch) {
		this.prodPurch = prodPurch;
	}

	public Provider getProv() {
		return prov;
	}

	public void setProv(Provider prov) {
		this.prov = prov;
	}

	public Client getCliente() {
		return cliente;
	}

	public void setCliente(Client cliente) {
		this.cliente = cliente;
	}

	public Double getPriceSale(double purchPrice) {
		priceSale = purchPrice * 2;
		return priceSale;
	}

	public void setPriceSale(Double priceSale) {
		this.priceSale = priceSale;
	}
	
	
	public String tooString() {
		return "__Finally__"
				+ "Name product: " + prodPurch
				+ "Supplier: " + prov
				+ "Name client: " + cliente
				+ "Price sale: " + String.format("%.2f", priceSale);
		//return "Lucro: R$" + String.format("%.2f", lucro(prodPurch, priceSale));
	}
	


}
