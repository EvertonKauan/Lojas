package Application;

import java.util.Locale;
import java.util.Scanner;

import Entitie.ProductPurchase;
import Entitie.Provider;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Provider fornecedor = new Provider();
		ProductPurchase prodPurchase = new ProductPurchase();
		
		System.out.println("First, you must register the supplier.");
		System.out.println();
		
		System.out.println("Supplier name: ");
		fornecedor.providerName = sc.nextLine();
	
		System.out.println("Supplier city: ");
		fornecedor.providerCity = sc.nextLine();
		
		System.out.println("UF of city: ");
		fornecedor.providerUF = sc.nextLine();
		
		System.out.println("Supplier cellphone number: ");
		fornecedor.providerCellphone = sc.nextLine();
		
		System.out.println("_______________________________________________");
		System.out.println("Now, you must register the product purchased.");
		System.out.println();
		
		System.out.println("Name product: ");
		prodPurchase.nameProduct = sc.nextLine();
		
		System.out.println("Purchase price: ");
		prodPurchase.purchasePrice = sc.nextInt();
		
		System.out.println("Quantity purchase: ");
		prodPurchase.purchaseQuantity = sc.nextInt();
		
		
		
		
	
}
}