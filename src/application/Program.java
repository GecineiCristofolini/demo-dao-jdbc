package application;



import java.util.Date;
import java.util.List;

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
    
    System.out.println("=== Teste 2 seller findByDepartment =====");
    Department department = new Department(2, null);
    List<Seller> list = sellerDao.findByDepartment(department);
    
    for (Seller obj : list) {
    	
    	System.out.println(obj);	
    	
    }
    
    
    
   
   
     list = sellerDao.findAll();
    
    for (Seller obj : list) {
    	
    	System.out.println(obj);	
    	
    }
    
    System.out.println("=== Teste 4 seller INSERT =====" );
    
    Seller newseller = new Seller(null, "Greg","greg@gmail.com",new Date(), 4000.0, department);
    sellerDao.insert(newseller);
    System.out.println("Inserted! New ID="+ newseller.getId() );
	}

}
