package com.nbos.capi.modules.opencart.v0.models.locale;

/**
 * Created by vineelanalla on 18/04/16.
 */
public class CountriesDataList {
    private String country_id;
    private String name;
    private String iso_code_2;
    private String iso_code_3;
    private String address_format;
    private String postcode_required;

    public String getCountry_id() {
        return country_id;
    }

    public String getName() {
        return name;
    }

    public String getIso_code_2() {
        return iso_code_2;
    }

    public String getIso_code_3() {
        return iso_code_3;
    }

    public String getAddress_format() {
        return address_format;
    }

    public String getPostcode_required() {
        return postcode_required;
    }

    public String getStatus() {
        return status;
    }

    private String status;
}
