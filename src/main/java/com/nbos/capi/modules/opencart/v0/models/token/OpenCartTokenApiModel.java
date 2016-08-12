package com.nbos.capi.modules.opencart.v0.models.token;

/**
 * Created by vivekkiran on 8/7/16.
 */

public class OpenCartTokenApiModel {
    String access_token;

    public String getExpires_in() {
        return expires_in;
    }

    public String getAccess_token() {
        return access_token;
    }

    public String getToken_type() {
        return token_type;
    }

    String expires_in;
    String token_type;
}
