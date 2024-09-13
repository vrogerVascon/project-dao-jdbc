package application;

import java.util.List;

import model.dao.DaoFectory;
import model.dao.SellerDao;
import model.endities.Seller;

public class Program {
    public static void main(String[] args) {
    
        SellerDao sellerDao = DaoFectory.creatSellerDao();

        System.out.println("\n=== TEST 3: seller findAll =====");
		List<Seller> list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
            System.out.println();
            
        }
    }

}
