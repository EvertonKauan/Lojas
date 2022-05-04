package Entitie;

public class Provider {
	public String providerName;
	public String providerCity;
	public String providerUF;
	public String providerCellphone;
	
	public Provider(String providerName) {
		super();
		this.providerName = providerName;
	}
	
	public Provider() {
		
	}

	
	public Provider(String providerName, String providerUF, String providerCity, String providerCellphone) {
		super();
		this.providerName = providerName;
		this.providerCity = providerCity;
		this.providerUF = providerUF;
		this.providerCellphone = providerCellphone;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public String getProviderCity() {
		return providerCity;
	}

	public void setProviderCity(String providerCity) {
		this.providerCity = providerCity;
	}

	public String getProviderCellphone() {
		return providerCellphone;
	}

	public void setProviderCellphone(String providerCellphone) {
		this.providerCellphone = providerCellphone;
	}

	
}
