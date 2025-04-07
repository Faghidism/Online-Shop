import java.io.Serializable;
import java.util.ArrayList;


/*

class cystomer
 name, password har moshtari
 constructor
 getter va setter

*/


public class Customer implements Serializable {


    private String name;
    private int password;
    ArrayList<Order> order;

    public Customer(String name, int password) {
        this.name = name;
        this.password = password;
        order = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public ArrayList<Order> getOrder() {
        return order;
    }

    public void setOrder(ArrayList<Order> order) {
        this.order = order;
    }
}