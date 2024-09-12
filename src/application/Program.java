package application;

import java.util.List;

import model.dao.DaoFectory;
import model.dao.SellerDao;
import model.endities.Department;
import model.endities.Seller;

public class Program {
    public static void main(String[] args) {
    
        System.out.println("-----Test 1: seller findById----");
        SellerDao sellerDao = DaoFectory.creatSellerDao();
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== TEST 2: seller findByDepartment =====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
            
        }
    }

}
