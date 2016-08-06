package com.nbos.capi.modules.opencart.v0.models.locale;

/**
 * Created by vineelanalla on 18/04/16.
 */
public class ZoneDataList {
    private String zone_id;

    public String getCountry_id() {
        return country_id;
    }

    public String getZone_id() {
        return zone_id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getStatus() {
        return status;
    }

    private String country_id;
    private String name;
    private String code;
    private String status;
}
