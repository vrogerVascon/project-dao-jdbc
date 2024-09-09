package application;

import model.dao.DaoFectory;
import model.dao.SellerDao;
import model.endities.Department;
import model.endities.Seller;
import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department obj = new Department(1, "Books");
        Seller seller = new Seller(3, "Bob", "bob@gmail.com", new Date(), 2000.0, obj);  
        

        SellerDao sellerDao = DaoFectory.creatSellerDao();

        System.out.println(seller);
    }

}
