package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFectory {
    public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}

    public static SellerDao getConnection() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getConnection'");
    }

   
}
