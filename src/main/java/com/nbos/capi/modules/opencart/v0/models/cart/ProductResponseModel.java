package com.nbos.capi.modules.opencart.v0.models.cart;

/**
 * Created by vivekkiran on 8/7/16.
 */

public class ProductResponseModel {
    String product_id;
    String name;

    public String getQuantity() {
        return quantity;
    }

    public String getProduct_id() {
        return product_id;
    }

    public String getName() {
        return name;
    }

    String quantity;
}
