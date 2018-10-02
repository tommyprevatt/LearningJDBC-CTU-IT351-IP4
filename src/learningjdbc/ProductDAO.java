
package learningjdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ProductDAO {
    Statement statement;
    ResultSet results;
    Product product;
    private Connection c;
    
    
    public ProductDAO(Connection c) throws SQLException {
        this.c = c;
        statement = c.createStatement();
        
    }
    
    public void create(Product p) throws SQLException{
        statement.executeUpdate("insert into product  values("+p.getID()+", '"
                +p.getName()+"', '"+p.getDescription()+"', "+p.getPrice()+")");
    }
    
    public void update(Product p) throws SQLException{
        statement.executeUpdate("update product set price = "+ p.getPrice()+", name = '"
                + p.getName() + "', description = '" + p.getDescription() + 
                "' where id = " + p.getID());
    }
    
    public void delete(int id) throws SQLException{
        statement.executeUpdate("delete from product where id = " + id);
    }
    
    public ArrayList<Product> getAll() throws SQLException{
        ArrayList<Product> products = new ArrayList<>();
        results = statement.executeQuery("select * from product");
        while (results.next()){
            int id = results.getInt("id");
            String name = results.getString("name");
            String description = results.getString("description");
            double price = results.getDouble("price");
            product = new Product(id, name, description, price);
            products.add(product);
        }
        
        
        return products;
    }
    
}
