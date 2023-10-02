package application;



import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

    
    
    SellerDao sellerDao = DaoFactory.creatSellerDao();
    
    
    System.out.println("=== Teste 1 seller findbyd =====");
    Seller seller = sellerDao.findByID(3);

   
    System.out.println(seller);
	}

}
