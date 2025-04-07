import java.io.Serializable;

/*

class clothe
 name, price, stock har lebas
 constructor
 getter va setter

*/

public class Clothes implements Serializable {

    private String Name;
    private int price;
    private int stock;

    public Clothes(String name, int price, int stock) {
        Name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
