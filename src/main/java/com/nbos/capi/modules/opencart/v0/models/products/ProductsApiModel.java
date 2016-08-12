package com.nbos.capi.modules.opencart.v0.models.products;

/**
 * Created by vivekkiran on 8/6/16.
 */

public class ProductsApiModel {
    public Boolean getSuccess() {
        return success;
    }

    public ProductsData getData() {
        return data;
    }

    Boolean success;
    ProductsData data;
}
