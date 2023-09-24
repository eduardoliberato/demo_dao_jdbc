package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
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
		
		System.out.println("\n==== TEST 4: seller Insert ====");
		Seller newSeller = new Seller(null, "Jorge", "jorge@jorge", new Date(), 70000.00, department );
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("\n==== TEST 5: seller Update ====");
		Seller sellerUp = sellerDao.findById(1);
		sellerUp.setName("Robin Wood");
		sellerDao.update(sellerUp);
		System.out.println("Updated! New content = " + sellerUp);
		
		System.out.println("\n==== TEST 6: seller Delete ====");
		System.out.println("Enter the id to delete the field: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();
		
	}

}
