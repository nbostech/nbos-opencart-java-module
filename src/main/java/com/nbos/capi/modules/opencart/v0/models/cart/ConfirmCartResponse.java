package com.nbos.capi.modules.opencart.v0.models.cart;

/**
 * Created by vivekkiran on 8/16/16.
 */

public class ConfirmCartResponse {
    public Boolean getSuccess() {
        return success;
    }

    public ConfirmCartData getData() {
        return data;
    }

    private Boolean success;
    private ConfirmCartData data;

    public String getError() {
        return error;
    }

    private String error;
}
