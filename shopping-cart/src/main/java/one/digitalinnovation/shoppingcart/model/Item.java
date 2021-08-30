package one.digitalinnovation.shoppingcart.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("item")
public class Item {

    private Integer productID;
    private Integer amount;


    public Integer getProductID () {
        return productID;
    }

    public void setProductID (Integer productID) {
        this.productID = productID;
    }

    public Integer getAmount () {
        return amount;
    }

    public void setAmount (Integer amount) {
        this.amount = amount;
    }
}
