/*
$Tommy Prevatt
 */
package learningjdbc;

/**
 *
 * @author Windows
 */
public class Customer {
    private int id;
    private String name;
    private String login;
    private String password;

    public Customer(int id, String name, String login, String password) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.password = password;
    }
    
    public Customer(){
        
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", login=" + login + ", password=" + password + '}';
    }
}
