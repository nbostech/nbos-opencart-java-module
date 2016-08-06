package com.nbos.capi.modules.opencart.v0;

import com.nbos.capi.api.v0.IdnCallback;
import com.nbos.capi.api.v0.NetworkApi;
import com.nbos.capi.api.v0.TokenApiModel;
import com.nbos.capi.modules.opencart.v0.models.cart.AddToCartApiModel;
import com.nbos.capi.modules.opencart.v0.models.cart.AddToCartResponse;
import com.nbos.capi.modules.opencart.v0.models.connect.ConnectApiModel;
import com.nbos.capi.modules.opencart.v0.models.locale.CountriesApiModel;
import com.nbos.capi.modules.opencart.v0.models.locale.ZoneApiModel;
import com.nbos.capi.modules.opencart.v0.models.paymentmethods.PaymentMethodsApiModel;
import com.nbos.capi.modules.opencart.v0.models.products.ProductsApiModel;
import com.nbos.capi.modules.opencart.v0.models.token.NbosConnectModel;
import com.nbos.capi.modules.opencart.v0.models.token.OpenCartTokenApiModel;

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

    public OpenCartTokenApiModel getGuestToken(final IdnCallback<OpenCartTokenApiModel> callback) {
        OCRemoteApi ocRemoteApi = getRemoteApi();
        TokenApiModel tokenApiModel = apiContext.getClientToken();
        Call<OpenCartTokenApiModel> call = ocRemoteApi.getGuestToken("Bearer " + tokenApiModel.getAccess_token());

        OpenCartTokenApiModel token = null;
        call.enqueue(new Callback<OpenCartTokenApiModel>() {
            @Override
            public void onResponse(Call<OpenCartTokenApiModel> call, Response<OpenCartTokenApiModel> response) {
                if (response.code() == 200) {
                    callback.onResponse(response);
                } else{
                    System.out.println(response);
                }
            }

            @Override
            public void onFailure(Call<OpenCartTokenApiModel> call, Throwable t) {
                callback.onFailure(t);
            }
        });
        return token;
    }
    public PaymentMethodsApiModel getPaymentMethods(final IdnCallback<PaymentMethodsApiModel> callback) {
        OCRemoteApi ocRemoteApi = getRemoteApi();
        TokenApiModel tokenApiModel = apiContext.getClientToken();
        Call<PaymentMethodsApiModel> call = ocRemoteApi.getPaymentMethods("Bearer " + tokenApiModel.getAccess_token());

        PaymentMethodsApiModel paymentMethodsApiModel = null;
        call.enqueue(new Callback<PaymentMethodsApiModel>() {
            @Override
            public void onResponse(Call<PaymentMethodsApiModel> call, Response<PaymentMethodsApiModel> response) {
                if (response.code() == 200) {
                    callback.onResponse(response);
                } else{
                    System.out.println(response);
                }
            }

            @Override
            public void onFailure(Call<PaymentMethodsApiModel> call, Throwable t) {
                callback.onFailure(t);
            }
        });
        return paymentMethodsApiModel;
    }

    public ProductsApiModel getProductsById(String merchantLanguage, String productId,final IdnCallback<ProductsApiModel> callback) {
        OCRemoteApi ocRemoteApi = getRemoteApi();
        TokenApiModel tokenApiModel = apiContext.getClientToken();
        Call<ProductsApiModel> call = ocRemoteApi.getProductsById("Bearer " + tokenApiModel.getAccess_token(),merchantLanguage,productId);

        ProductsApiModel products = null;
        call.enqueue(new Callback<ProductsApiModel>() {
            @Override
            public void onResponse(Call<ProductsApiModel> call, Response<ProductsApiModel> response) {
                if (response.code() == 200) {
                    callback.onResponse(response);
                } else{
                    System.out.println(response);
                }
            }

            @Override
            public void onFailure(Call<ProductsApiModel> call, Throwable t) {
                callback.onFailure(t);
            }
        });
        return products;
    }
    public ConnectApiModel connectToNbos(NbosConnectModel nbosConnectModel, final IdnCallback<ConnectApiModel> callback) {
        OCRemoteApi ocRemoteApi = getRemoteApi();
        TokenApiModel tokenApiModel = apiContext.getClientToken();
        Call<ConnectApiModel> call = ocRemoteApi.connectToNbos("Bearer " + tokenApiModel.getAccess_token(),nbosConnectModel);

        ConnectApiModel connectApiModel = null;
        call.enqueue(new Callback<ConnectApiModel>() {
            @Override
            public void onResponse(Call<ConnectApiModel> call, Response<ConnectApiModel> response) {
                if (response.code() == 200) {
                    callback.onResponse(response);
                } else{
                    System.out.println(response);
                }
            }

            @Override
            public void onFailure(Call<ConnectApiModel> call, Throwable t) {
                callback.onFailure(t);
            }
        });
        return connectApiModel;
    }
    public AddToCartResponse addToCart(String currency, AddToCartApiModel addToCartApiModel, final IdnCallback<AddToCartResponse> callback) {
        OCRemoteApi ocRemoteApi = getRemoteApi();
        TokenApiModel tokenApiModel = apiContext.getClientToken();
        Call<AddToCartResponse> call = ocRemoteApi.addToCart("Bearer " + tokenApiModel.getAccess_token(),currency,addToCartApiModel);

        AddToCartResponse addToCartResponse = null;
        call.enqueue(new Callback<AddToCartResponse>() {
            @Override
            public void onResponse(Call<AddToCartResponse> call, Response<AddToCartResponse> response) {
                if (response.code() == 200) {
                    callback.onResponse(response);
                } else{
                    System.out.println(response);
                }
            }

            @Override
            public void onFailure(Call<AddToCartResponse> call, Throwable t) {
                callback.onFailure(t);
            }
        });
        return addToCartResponse;
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
