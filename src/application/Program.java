package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(21, "Bob", "bob@bob", new Date(), 3000.00, obj);
		
		/*this way the program doesn't know the implementation
		only the interface: */
		SellerDao sellerDao = DaoFactory.createSellerdao();
		
		System.out.println(seller);

	}

}
