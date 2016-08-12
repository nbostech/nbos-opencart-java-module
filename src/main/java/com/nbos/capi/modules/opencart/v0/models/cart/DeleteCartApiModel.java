package com.nbos.capi.modules.opencart.v0.models.cart;

/**
 * Created by vivekkiran on 8/12/16.
 */

public class DeleteCartApiModel {
    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public void setProduct_option_id(String product_option_id) {
        this.product_option_id = product_option_id;
    }

    public void setProduct_option_value_id(String product_option_value_id) {
        this.product_option_value_id = product_option_value_id;
    }

    String product_id;
    String product_option_id;
    String product_option_value_id;
}
