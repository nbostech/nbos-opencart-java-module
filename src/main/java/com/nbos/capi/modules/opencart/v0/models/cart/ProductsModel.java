package com.nbos.capi.modules.opencart.v0.models.cart;

import java.util.List;

/**
 * Created by vivekkiran on 8/16/16.
 */

public class ProductsModel {
    List<OptionsModel> option;
    String key;
    String product_id;
    String name;
    String model;
    String recurring;

    public String getQuantity() {
        return quantity;
    }

    public List<OptionsModel> getOption() {
        return option;
    }

    public String getKey() {
        return key;
    }

    public String getProduct_id() {
        return product_id;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getRecurring() {
        return recurring;
    }

    public String getSubtract() {
        return subtract;
    }

    public String getPrice() {
        return price;
    }

    public String getTotal() {
        return total;
    }

    public String getHref() {
        return href;
    }

    String quantity;
    String subtract;
    String price;
    String total;
    String href;

}
