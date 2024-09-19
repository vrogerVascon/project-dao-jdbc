package application;

import model.dao.DaoFectory;
import model.dao.DepartmentDao;
import model.endities.Department;
import java.util.ArrayList;

public class program2 {

    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFectory.createDepartmentDao();
       
        /* 
        System.out.println("=== TEST 1: findById =======");
        Department dep = departmentDao.findById(1);
        System.out.println(dep);
        */
       
       

       System.out.println("\n=== TEST 2: findAll =======");
      
       for (Department object : departmentDao.findAll()) {
        System.out.println(object);
        
       }

        /* 
        System.out.println("\n=== TEST 3: insert =======");
		Department newDepartment = new Department(null, "Music");
		departmentDao.isert(newDepartment);
		System.out.println("Inserted! New id: " + newDepartment.getId());
        */

         /* 
        System.out.println("\n=== TEST 4: update =======");
		Department dep2 = departmentDao.findById(1);
		dep2.setName("Food");
		departmentDao. upDate(dep2);
		System.out.println("Update completed");
        */

         /* 
        System.out.println("\n=== TEST 5: delete =======");
		departmentDao.deleteById(5);
		System.out.println("Delete completed");
       */

    }
}
