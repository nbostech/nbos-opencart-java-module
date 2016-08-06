package com.nbos.capi.modules.opencart.v0;

import com.nbos.capi.api.v0.IdnCallback;
import com.nbos.capi.api.v0.NetworkApi;
import com.nbos.capi.api.v0.TokenApiModel;
import com.nbos.capi.modules.opencart.v0.models.locale.CountriesApiModel;
import com.nbos.capi.modules.opencart.v0.models.locale.ZoneApiModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by vivekkiran on 7/29/16.
 */

public class OpenCartApi extends NetworkApi{
    public OpenCartApi() {
        super();
        setModuleName("opencart");
        setRemoteApiClass(OCRemoteApi.class);
    }
    public CountriesApiModel getCountries(final IdnCallback<CountriesApiModel> callback) {
        OCRemoteApi ocRemoteApi = getRemoteApi();
        TokenApiModel tokenApiModel = apiContext.getClientToken();
        Call<CountriesApiModel> call = ocRemoteApi.getCountries("Bearer " + tokenApiModel.getAccess_token());

        CountriesApiModel countries = null;
        call.enqueue(new Callback<CountriesApiModel>() {
            @Override
            public void onResponse(Call<CountriesApiModel> call, Response<CountriesApiModel> response) {
                if (response.code() == 200) {
                    callback.onResponse(response);
                } else{
                    System.out.println(response);
                }
            }

            @Override
            public void onFailure(Call<CountriesApiModel> call, Throwable t) {
                callback.onFailure(t);
            }
        });
        return countries;
    }

    public ZoneApiModel getZones(String country_id, final IdnCallback<ZoneApiModel> callback) {
        OCRemoteApi ocRemoteApi = getRemoteApi();
        TokenApiModel tokenApiModel = apiContext.getUserToken(moduleName);
        Call<ZoneApiModel> call = ocRemoteApi.getZones("Bearer " + tokenApiModel.getAccess_token(),country_id);

        ZoneApiModel zones = null;
        call.enqueue(new Callback<ZoneApiModel>() {
            @Override
            public void onResponse(Call<ZoneApiModel> call, Response<ZoneApiModel> response) {
                if (response.code() == 200) {
                    callback.onResponse(response);
                }
            }

            @Override
            public void onFailure(Call<ZoneApiModel> call, Throwable t) {
                callback.onFailure(t);
            }
        });
        return zones;
    }
}
