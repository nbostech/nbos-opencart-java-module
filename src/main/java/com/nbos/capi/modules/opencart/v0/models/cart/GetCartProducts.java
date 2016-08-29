package com.nbos.capi.modules.opencart.v0.models.cart;

import java.util.List;

/**
 * Created by vivekkiran on 8/26/16.
 */

public class GetCartProducts {
    String key;
    String thumb;

    public String getName() {
        return name;
    }

    public String getKey() {
        return key;
    }

    public String getThumb() {
        return thumb;
    }

    public String getModel() {
        return model;
    }

    public String getQuantity() {
        return quantity;
    }

    public Boolean getStock() {
        return stock;
    }

    public String getReward() {
        return reward;
    }

    public String getPrice() {
        return price;
    }

    public String getTotal() {
        return total;
    }

    public List<GetCartProductOption> getOption() {
        return option;
    }

    String name;
    String model;
    String quantity;
    Boolean stock;
    String reward;
    String price;
    String total;
    List<GetCartProductOption> option;
}
