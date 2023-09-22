package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

			
		/*this way the program doesn't know the implementation
		only the interface: */
		SellerDao sellerDao = DaoFactory.createSellerdao();
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);

	}

}
