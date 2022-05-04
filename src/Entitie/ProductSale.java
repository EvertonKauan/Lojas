package Entitie;

public class ProductSale {
	private ProductPurchase prodPurch;
	private Provider prov;
	private Client cliente;
	
	public Integer priceSale;
	
	public ProductSale() {
		
	}

	
	public ProductSale(Integer priceSale) {
		super();
		this.priceSale = priceSale;
	}

	public ProductSale(ProductPurchase prodPurch, Provider prov, Client cliente, Integer priceSale) {
		super();
		this.prodPurch = prodPurch;
		this.prov = prov;
		this.cliente = cliente;
		this.priceSale = priceSale;
	}

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

	public Integer getPriceSale() {
		return priceSale;
	}

	public void setPriceSale(Integer priceSale) {
		this.priceSale = priceSale;
	}
	
	
	
	
}
