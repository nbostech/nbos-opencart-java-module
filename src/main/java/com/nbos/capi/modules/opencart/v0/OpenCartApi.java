package com.nbos.capi.modules.opencart.v0;

import com.nbos.capi.api.v0.IdnCallback;
import com.nbos.capi.api.v0.NetworkApi;
import com.nbos.capi.api.v0.models.TokenApiModel;
import com.nbos.capi.modules.opencart.v0.models.cart.AddToCartApiModel;
import com.nbos.capi.modules.opencart.v0.models.cart.AddToCartResponse;
import com.nbos.capi.modules.opencart.v0.models.cart.ConfirmCartResponse;
import com.nbos.capi.modules.opencart.v0.models.cart.GetCartResponse;
import com.nbos.capi.modules.opencart.v0.models.connect.NbosConnectResponse;
import com.nbos.capi.modules.opencart.v0.models.locale.CountriesApiModel;
import com.nbos.capi.modules.opencart.v0.models.locale.ZoneApiModel;
import com.nbos.capi.modules.opencart.v0.models.paymentmethods.PaymentMethodBody;
import com.nbos.capi.modules.opencart.v0.models.paymentmethods.PaymentMethodsApiModel;
import com.nbos.capi.modules.opencart.v0.models.paymentmethods.SetPaymentResponse;
import com.nbos.capi.modules.opencart.v0.models.products.ProductsApiModel;
import com.nbos.capi.modules.opencart.v0.models.token.NbosConnectModel;

import java.io.IOException;

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

    public TokenApiModel getGuestToken(String authorization,final IdnCallback<TokenApiModel> callback) {

        OCRemoteApi ocRemoteApi = getRemoteApi();
        Call<TokenApiModel> call = ocRemoteApi.getGuestToken("Basic " + authorization);

        TokenApiModel openCartTokenApiModel = null;
        try {
            Response<TokenApiModel> response = call.execute();
            openCartTokenApiModel = response.body();
            System.out.println("token:" + openCartTokenApiModel.getAccess_token());
            apiContext.setUserToken("opencart",openCartTokenApiModel);
            callback.onResponse(response);
            return openCartTokenApiModel;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return openCartTokenApiModel;
    }
    public NbosConnectResponse connectToNbos(final IdnCallback<NbosConnectResponse> callback) {
        OCRemoteApi ocRemoteApi = getRemoteApi();
        TokenApiModel tokenApiModel;
        if(apiContext.getUserToken("identity") != null){
            tokenApiModel = apiContext.getUserToken("identity");
        } else {
            tokenApiModel = apiContext.getClientToken();
        }
        NbosConnectModel nbosConnectModel = new NbosConnectModel();
        nbosConnectModel.setNbos_token(tokenApiModel.getAccess_token());
        if(apiContext.getUserToken("opencart") != null){
            tokenApiModel = apiContext.getUserToken("opencart");
        }
        Call<NbosConnectResponse> call = ocRemoteApi.connectToNbos("Bearer " + tokenApiModel.getAccess_token(),nbosConnectModel);

        NbosConnectResponse connectApiModel = null;
        call.enqueue(new Callback<NbosConnectResponse>() {
            @Override
            public void onResponse(Call<NbosConnectResponse> call, Response<NbosConnectResponse> response) {
                if (response.code() == 200) {
                    callback.onResponse(response);
                } else{
                    System.out.println(response);
                }
            }

            @Override
            public void onFailure(Call<NbosConnectResponse> call, Throwable t) {
                callback.onFailure(t);
            }
        });
        return connectApiModel;
    }
    public PaymentMethodsApiModel getPaymentMethods(final IdnCallback<PaymentMethodsApiModel> callback) {
        OCRemoteApi ocRemoteApi = getRemoteApi();
        TokenApiModel tokenApiModel;
        if(apiContext.getUserToken("opencart") != null){
            tokenApiModel = apiContext.getUserToken("opencart");
        }else {
            tokenApiModel = apiContext.getClientToken();
        }
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
    public SetPaymentResponse setPaymentMethod(PaymentMethodBody paymentMethodBody,final IdnCallback<SetPaymentResponse> callback) {
        OCRemoteApi ocRemoteApi = getRemoteApi();
        TokenApiModel tokenApiModel;
        if(apiContext.getUserToken("opencart") != null){
            tokenApiModel = apiContext.getUserToken("opencart");
        }else {
            tokenApiModel = apiContext.getClientToken();
        }
        Call<SetPaymentResponse> call = ocRemoteApi.setPaymentMethod("Bearer " + tokenApiModel.getAccess_token(),paymentMethodBody);

        SetPaymentResponse setPaymentResponse = null;
        call.enqueue(new Callback<SetPaymentResponse>() {
            @Override
            public void onResponse(Call<SetPaymentResponse> call, Response<SetPaymentResponse> response) {
                if (response.code() == 200) {
                    callback.onResponse(response);
                } else{
                    System.out.println(response);
                }
            }

            @Override
            public void onFailure(Call<SetPaymentResponse> call, Throwable t) {
                callback.onFailure(t);
            }
        });
        return setPaymentResponse;
    }


    public ProductsApiModel getProductsById(String merchantLanguage, String productId,final IdnCallback<ProductsApiModel> callback) {
        OCRemoteApi ocRemoteApi = getRemoteApi();
        TokenApiModel tokenApiModel;
        if(apiContext.getUserToken("opencart") != null){
            tokenApiModel = apiContext.getUserToken("opencart");
        }else {
            tokenApiModel = apiContext.getClientToken();
        }
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

    public AddToCartResponse addToCart(String currency, AddToCartApiModel addToCartApiModel, final IdnCallback<AddToCartResponse> callback) {
        OCRemoteApi ocRemoteApi = getRemoteApi();
        TokenApiModel tokenApiModel = apiContext.getClientToken();
        if(apiContext.getUserToken("opencart") != null){
            tokenApiModel = apiContext.getUserToken("opencart");
        }
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


    public ConfirmCartResponse confirmCart(final IdnCallback<ConfirmCartResponse> callback) {
        OCRemoteApi ocRemoteApi = getRemoteApi();
        TokenApiModel tokenApiModel = apiContext.getClientToken();
        if(apiContext.getUserToken("opencart") != null){
            tokenApiModel = apiContext.getUserToken("opencart");
        }
        Call<ConfirmCartResponse> call = ocRemoteApi.confirmCart("Bearer " + tokenApiModel.getAccess_token());

        ConfirmCartResponse confirmCartResponse = null;
        call.enqueue(new Callback<ConfirmCartResponse>() {
            @Override
            public void onResponse(Call<ConfirmCartResponse> call, Response<ConfirmCartResponse> response) {
                if (response.code() == 200) {
                    callback.onResponse(response);
                } else{
                    System.out.println(response);
                }
            }

            @Override
            public void onFailure(Call<ConfirmCartResponse> call, Throwable t) {
                callback.onFailure(t);
            }
        });
        return confirmCartResponse;
    }

    public GetCartResponse getCart(final IdnCallback<GetCartResponse> callback){
        OCRemoteApi ocRemoteApi = getRemoteApi();
        TokenApiModel tokenApiModel = apiContext.getClientToken();
        if(apiContext.getUserToken("opencart") != null){
            tokenApiModel = apiContext.getUserToken("opencart");
        }
        GetCartResponse getCartResponse = null;

        Call<GetCartResponse> call = ocRemoteApi.getCart("Bearer " + tokenApiModel.getAccess_token(), "INR");
        Response<GetCartResponse> response = null;
        try {
            response = call.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        callback.onResponse(response);
        return getCartResponse;

//        call.enqueue(new Callback<GetCartResponse>() {
//            @Override
//            public void onResponse(Call<GetCartResponse> call, Response<GetCartResponse> response) {
//                if (response.code() == 200) {
//                    callback.onResponse(response);
//                } else{
//                    System.out.println(response);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<GetCartResponse> call, Throwable t) {
//                callback.onFailure(t);
//
//            }
//        });
       // return getCartResponse;
    }
}
