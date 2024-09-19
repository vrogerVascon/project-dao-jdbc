package application;

import model.dao.DaoFectory;
import model.dao.SellerDao;
import java.util.Scanner;

//https://github.com/acenelio/chess-system-java

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SellerDao sellerDao = DaoFectory.createSellerDao();

        System.out.println("\n=== TEST 6: seller update =====");
        System.out.println("Enter with Id for delete: ");
       // int id = sc.nextInt();
        sellerDao.deleteById(6);
        System.out.println("Delete completed");

       sc.close();


		
    }
}
