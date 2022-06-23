package association.onetoonefactory.driver;

import association.onetoonefactory.CustShopCartFactory;
import association.onetoonefactory.Customer;
import association.onetoonefactory.Item;

public class Main {

	public static void main(String[] args) {

		//Create new customer
		Customer cust = CustShopCartFactory.createCustomer("Bob");
		cust.getCart().addItem(new Item("Shirt"));


		System.out.println(cust.getCart().getItems());

		//Cannot create Customer or ShoppingCart directly from Main
		//Customer c = new Customer("Bob") //compiler error
		//ShoppingCart s = new ShoppingCart();  //compiler error


	}

}
