package application;







import model.dao.DaoFectory;
import model.dao.SellerDao;
import model.endities.Seller;

//https://github.com/acenelio/chess-system-java

public class Program {
    public static void main(String[] args) {
    
        SellerDao sellerDao = DaoFectory.createSellerDao();


        System.out.println("\n=== TEST 5: seller update =====");
        
        
        Seller seller = sellerDao.findById(1);
        seller.setName("Martha Weine");
        sellerDao.upDate(seller);
        System.out.println("Update completed");
       


		
    }
}
