package com.nbos.capi.modules.opencart.v0.models.cart;

import java.util.Map;

/**
 * Created by vivekkiran on 8/7/16.
 */

public class AddToCartApiModel {
    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setOption(Map<String, String> option) {
        this.option = option;
    }

    String product_id;
    String quantity;
    Map<String, String> option;
}
