package com.nbos.capi.modules.opencart.v0.models.cart;

import com.nbos.capi.modules.opencart.v0.models.common.OcRestMessage;

/**
 * Created by vivekkiran on 8/7/16.
 */

public class AddToCartResponse extends OcRestMessage {
    ProductResponseModel product;
    String total;
}
