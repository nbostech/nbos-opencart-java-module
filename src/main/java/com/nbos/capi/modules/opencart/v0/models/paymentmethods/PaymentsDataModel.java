package com.nbos.capi.modules.opencart.v0.models.paymentmethods;

import java.util.Map;

/**
 * Created by vivekkiran on 8/7/16.
 */

public class PaymentsDataModel {
    String error_warning;
    String code;

    public String getComment() {
        return comment;
    }

    public String getError_warning() {
        return error_warning;
    }

    public String getCode() {
        return code;
    }

    public String getAgree() {
        return agree;
    }

    public Map<Object, MethodData> getPayment_methods() {
        return payment_methods;
    }

    String comment;
    String agree;
    Map<Object,MethodData> payment_methods;

}
