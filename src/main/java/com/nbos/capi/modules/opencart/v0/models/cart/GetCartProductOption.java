package com.nbos.capi.modules.opencart.v0.models.cart;

/**
 * Created by vivekkiran on 8/26/16.
 */

public class GetCartProductOption {
    String product_option_id;
    String product_option_value_id;

    public String getName() {
        return name;
    }

    public String getProduct_option_id() {
        return product_option_id;
    }

    public String getProduct_option_value_id() {
        return product_option_value_id;
    }

    public String getPrice() {
        return price;
    }

    public String getValue() {
        return value;
    }

    String name;
    String price;
    String value;
}
