
package learningjdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CustomerDAO {
    private Statement statement;
    private ResultSet results;
    private Customer customer;
    private Connection c;

    public CustomerDAO(Connection c) throws SQLException {
        this.c = c;
        statement = c.createStatement();
    }
    
    public void create(Customer customer) throws SQLException{
        statement.executeUpdate("insert into customer values("
                + customer.getID()+", '"
                + customer.getName()+"', '"
                + customer.getLogin()+"', '"
                + customer.getPassword()+"')");
    }
    
    public void update(Customer customer) throws SQLException{
        statement.executeUpdate("update customer set password = '"
                + customer.getPassword()+"', name = '"
                + customer.getName() + "', login = '" 
                + customer.getLogin()+ "' where id = " 
                + customer.getID());
    }
    
    public void delete(int id) throws SQLException{
        statement.executeUpdate("delete from customer where id = " + id);
    }
    
    public ArrayList<Customer> getAll() throws SQLException{
        ArrayList<Customer> customers = new ArrayList<>();
        results = statement.executeQuery("select * from customer");
        while (results.next()){
            int id = results.getInt("id");
            String name = results.getString("name");
            String login = results.getString("login");
            String password = results.getString("password");
            customer = new Customer(id, name, login, password);
            customers.add(customer);
        }
        
        
        return customers;
    }
    
    
    
}
