package com.nbos.capi.modules.opencart.v0.models.cart;

import com.nbos.capi.modules.opencart.v0.models.common.OcRestMessage;

/**
 * Created by vivekkiran on 8/26/16.
 */

public class GetCartResponse extends OcRestMessage {
    public GetCartData getData() {
        return data;
    }

    GetCartData data;
}
