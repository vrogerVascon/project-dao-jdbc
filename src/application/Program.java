package application;

import model.dao.DaoFectory;
import model.dao.SellerDao;
import model.endities.Seller;

public class Program {
    public static void main(String[] args) {
    

        SellerDao sellerDao = DaoFectory.creatSellerDao();
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
    }

}
