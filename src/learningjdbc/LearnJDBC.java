package learningjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

public class LearnJDBC {
    //this is the test class. 
    //some of the code in this class no longer works since the code has been changed to intrduce updates. 
    /*public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sales?verifyServerCertificate=false";
        Properties p = new Properties();
        p.setProperty("user", "ctuonline");
        p.setProperty("password", "student");
        p.setProperty("useSSL", "true");
        p.setProperty("autoReconnect", "true");
        Connection c = DriverManager.getConnection(url, p);
        
        ProductDAO dao = new ProductDAO(c);
        
        List<Product> products = dao.getAll();
        
        int pSize = products.size();
        for (int i = 0; i<pSize; i++){
            System.out.println(products.get(i));
        }
        System.out.println();
        
        Product prod = new Product(99, "Learn Java", "Java Lessons", 22.99);
        dao.create(prod);
        
        products = dao.getAll();
        pSize = products.size();
        for (int i = 0; i<pSize; i++){
            System.out.println(products.get(i));
        }
        System.out.println();
        
        prod.setName("Silly Class");
        prod.setDescription("Have Fun Here");
        prod.setPrice(42);
        dao.update(prod);
        
        products = dao.getAll();
        pSize = products.size();
        for (int i = 0; i<pSize; i++){
            System.out.println(products.get(i));
        }
        System.out.println();
        
        dao.delete(prod);
        
        products = dao.getAll();
        pSize = products.size();
        for (int i = 0; i<pSize; i++){
            System.out.println(products.get(i));
        }
        System.out.println();
        
        CustomerDAO cDAO = new CustomerDAO(c);
        for (Customer cust : cDAO.getAll()){
            System.out.println(cust);
        }
        System.out.println();
        
        Customer customer = new Customer(44, "Bart", "bart", "l33t");
        cDAO.create(customer);
        for (Customer cust : cDAO.getAll()){
            System.out.println(cust);
        }
        System.out.println();
        
        customer.setLogin("simpson");
        customer.setName("Lisa");
        customer.setPassword("sax");
        cDAO.update(customer);
        for (Customer cust : cDAO.getAll()){
            System.out.println(cust);
        }
        System.out.println();
        
        cDAO.delete(customer);
        for (Customer cust : cDAO.getAll()){
            System.out.println(cust);
        }
        System.out.println();
    } */
}