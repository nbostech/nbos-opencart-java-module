package com.nbos.capi.modules.opencart.v0.models.products;

import java.util.List;

/**
 * Created by vivekkiran on 8/7/16.
 */

public class OptionsListModel {
    String name;
    String type;
    String required;
    String product_option_id;
    String option_id;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getRequired() {
        return required;
    }

    public String getProduct_option_id() {
        return product_option_id;
    }

    public String getOption_id() {
        return option_id;
    }

    public List<OptionValueListModel> getOption_value() {
        return option_value;
    }

    List<OptionValueListModel> option_value;

}
