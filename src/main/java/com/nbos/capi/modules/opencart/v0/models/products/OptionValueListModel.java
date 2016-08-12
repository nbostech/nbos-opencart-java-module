package com.nbos.capi.modules.opencart.v0.models.products;

/**
 * Created by vivekkiran on 8/7/16.
 */

public class OptionValueListModel {
    private String image;

    public String getPrice() {
        return price;
    }

    public String getImage() {
        return image;
    }

    public String getPrice_formated() {
        return price_formated;
    }

    public String getPrice_prefix() {
        return price_prefix;
    }

    public String getProduct_option_value_id() {
        return product_option_value_id;
    }

    public String getOption_value_id() {
        return option_value_id;
    }

    public String getName() {
        return name;
    }

    public String getOriginal_name() {
        return original_name;
    }

    public String getProfile_cnt() {
        return profile_cnt;
    }

    public String getHas_preferred_month() {
        return has_preferred_month;
    }

    public String getQuantity() {
        return quantity;
    }

    private String price;
    private String price_formated;
    private String price_prefix;
    private String product_option_value_id;
    private String option_value_id;
    private String name;
    private String original_name;
    private String profile_cnt;
    private String has_preferred_month;
    private String quantity;
}
