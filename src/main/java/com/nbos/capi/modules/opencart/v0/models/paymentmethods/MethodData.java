package com.nbos.capi.modules.opencart.v0.models.paymentmethods;

/**
 * Created by vivekkiran on 8/7/16.
 */

public class MethodData {
    String code;

    public String getTitle() {
        return title;
    }

    public String getCode() {
        return code;
    }

    public String getTerms() {
        return terms;
    }

    public String getSort_order() {
        return sort_order;
    }

    String title;
    String terms;
    String sort_order;
}
