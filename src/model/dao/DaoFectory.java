package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFectory {
    public static SellerDao creatSellerDao(){
        return new SellerDaoJDBC();
    }
}
