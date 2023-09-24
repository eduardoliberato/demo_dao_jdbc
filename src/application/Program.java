package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

			
		/*this way the program doesn't know the implementation
		only the interface: */
		SellerDao sellerDao = DaoFactory.createSellerdao();
		
		System.out.println("==== TEST 1: seller findById ====");
		Seller seller = sellerDao.findById(3);		
		System.out.println(seller);

		System.out.println("\n==== TEST 2: seller findByDepartment ====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\n==== TEST 3: seller findAll ====");
		List<Seller> list2 = sellerDao.findAll();
		for(Seller obj: list2) {
			System.out.println(obj);
		}
	}

}
