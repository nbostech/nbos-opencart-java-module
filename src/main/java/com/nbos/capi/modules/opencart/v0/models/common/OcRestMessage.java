package com.nbos.capi.modules.opencart.v0.models.common;

/**
 * Created by vivekkiran on 8/7/16.
 */

public class OcRestMessage {
    Boolean success;

    public Object getError() {
        return error;
    }

    public Boolean getSuccess() {
        return success;
    }

    Object error;
}
