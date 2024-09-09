package model.dao;

import java.util.List;

import model.endities.Department;

public interface DepartmentDao {

    void isert(Department oj);
    void upDate(Department obj);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Department> findAll();
}
