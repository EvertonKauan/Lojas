package Application;

import java.util.Locale;
import java.util.Scanner;

import Entitie.Client;
import Entitie.ProductPurchase;
import Entitie.ProductSale;
import Entitie.Provider;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
				
		System.out.println("First, you must register the supplier.");
		System.out.println();
		
		System.out.println("Supplier name: ");
		String provName = sc.nextLine();
	
		System.out.println("Supplier city: ");
		String provCity = sc.nextLine();
		
		System.out.println("UF of city: ");
		String provUF = sc.nextLine();
		
		System.out.println("Supplier cellphone number: ");
		String provCell = sc.nextLine();
		
		Provider fornecedor = new Provider(provName, provCity, provUF, provCell);
		
		System.out.println("_______________________________________________");
		System.out.println("Now, you must register the product purchased.");
		System.out.println();
		
		System.out.println("Name product: ");
		String nameProd = sc.nextLine();
		
		System.out.println("Purchase price: ");
		double purchPrice = sc.nextDouble();
		
		System.out.println("Quantity purchase: ");
		int purchQuan = sc.nextInt();
		sc.nextLine();
		
		ProductPurchase prodPurchase = new ProductPurchase(nameProd, purchPrice, purchQuan);
		
		System.out.println("_______________________________________________");
		System.out.println("Now, you must register the client of product.");
		System.out.println();
		
		System.out.println("Client name: ");
		String nameClient = sc.nextLine();
		
		System.out.println("Client city: ");
		String cityClient = sc.nextLine();
		
		Client client = new Client(nameClient, cityClient);
		
		ProductSale prodSale = new ProductSale(purchPrice, nameProd, provName, nameClient);
		System.out.println(prodSale.tooString());
		
		
	
}
}