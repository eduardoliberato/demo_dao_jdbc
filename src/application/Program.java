package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

			
		/*this way the program doesn't know the implementation
		only the interface: */
		SellerDao sellerDao = DaoFactory.createSellerdao();
		
		System.out.println("==== TEST 1: seller findById ====");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);

	}

}
