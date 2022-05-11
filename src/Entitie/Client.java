package Entitie;

public class Client {
	public String nameCliente;
	public String clientCity;
	
	public Client() {
		
	}

	public Client(String nameCliente, String clientCity) {
		super();
		this.nameCliente = nameCliente;
		this.clientCity = clientCity;
	}

	public String getNameCliente() {
		return nameCliente;
	}

	public void setNameCliente(String nameCliente) {
		this.nameCliente = nameCliente;
	}

	public String getClientCity() {
		return clientCity;
	}

	public void setClientCity(String clientCity) {
		this.clientCity = clientCity;
	}
	
	
}
