package com.nbos.capi.modules.opencart.v0.models.locale;

import java.util.List;

/**
 * Created by vineelanalla on 18/04/16.
 */
public class CountriesApiModel {
    public boolean isSuccess() {
        return success;
    }

    public List<CountriesDataList> getData() {
        return data;
    }

    private boolean success;
    private List<CountriesDataList> data;
}
