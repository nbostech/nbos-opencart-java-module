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
    List<OptionValueListModel> option_value;

}
