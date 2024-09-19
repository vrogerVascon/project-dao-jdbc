package application;







import model.dao.DaoFectory;
import model.dao.SellerDao;
import model.endities.Department;
import model.endities.Seller;
import java.util.Date;

//https://github.com/acenelio/chess-system-java

public class Program {
    public static void main(String[] args) {
    
        SellerDao sellerDao = DaoFectory.createSellerDao();

        Department dep = new Department(2, null);

        System.out.println("\n=== TEST 4: seller insert =====");

        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, dep);
        sellerDao.isert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());


		
    }
}
