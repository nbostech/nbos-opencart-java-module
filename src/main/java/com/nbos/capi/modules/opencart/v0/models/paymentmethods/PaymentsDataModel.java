package com.nbos.capi.modules.opencart.v0.models.paymentmethods;

import java.util.Map;

/**
 * Created by vivekkiran on 8/7/16.
 */

public class PaymentsDataModel {
    String error_warning;
    String code;
    String comment;
    String agree;
    Map<Object,MethodData> payment_methods;

}
