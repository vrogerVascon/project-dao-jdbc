package model.dao;

import java.util.List;

import model.endities.Department;
import model.endities.Seller;

public interface SellerDao {
     void isert(Seller oj);
    void upDate(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
    List<Seller> findByDepartment(Department department);
}
