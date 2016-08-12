package com.nbos.capi.modules.opencart.v0.models.paymentmethods;

/**
 * Created by vivekkiran on 8/7/16.
 */

public class PaymentMethodBody {
    String payment_method;

    public void setAgree(String agree) {
        this.agree = agree;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    String agree;
    String comment;

}
