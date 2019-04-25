package model;

/**
 *
 * @author cero
 */
public class Agreement {
    
    private String name;
    private float discount;

    public Agreement(String name, float discount) {
        this.name = name;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }
}