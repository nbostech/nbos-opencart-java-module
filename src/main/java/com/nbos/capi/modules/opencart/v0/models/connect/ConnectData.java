package com.nbos.capi.modules.opencart.v0.models.connect;

import com.google.gson.annotations.SerializedName;
import com.nbos.capi.modules.opencart.v0.models.common.OcRestMessage;

/**
 * Created by vivekkiran on 8/7/16.
 */

public class ConnectData {
    private String session_id;

    private String fax;

    private String email;

    private String company;

    @SerializedName("return")
    private Boolean returns;

    private String lastname;

    private String firstname;

    private String nbos;

    private String telephone;
}
