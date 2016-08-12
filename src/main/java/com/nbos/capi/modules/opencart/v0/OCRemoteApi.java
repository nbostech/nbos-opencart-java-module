package com.nbos.capi.modules.opencart.v0;

import com.nbos.capi.modules.opencart.v0.models.cart.AddToCartResponse;
import com.nbos.capi.modules.opencart.v0.models.cart.AddToCartApiModel;
import com.nbos.capi.modules.opencart.v0.models.connect.NbosConnectResponse;
import com.nbos.capi.modules.opencart.v0.models.locale.CountriesApiModel;
import com.nbos.capi.modules.opencart.v0.models.locale.ZoneApiModel;
import com.nbos.capi.modules.opencart.v0.models.paymentmethods.PaymentMethodsApiModel;
import com.nbos.capi.modules.opencart.v0.models.products.ProductsApiModel;
import com.nbos.capi.modules.opencart.v0.models.token.NbosConnectModel;
import com.nbos.capi.modules.opencart.v0.models.token.OpenCartTokenApiModel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by vivekkiran on 7/29/16.
 */

public interface OCRemoteApi {

    String nbosConnect = "/index.php?route=rest/nbos/connect";
    String ocToken =  "/api/rest/oauth2/token/client_credentials";
    String productById = "/api/rest/products/{product_id}";
    String countriesUrl = "/api/rest/countries";
    String zoneIdUrl = "/api/rest/countries/{country_id}";
    String paymentMethods = "/api/rest/paymentmethods";
    String cartUrl = "/api/rest/cart/";
    //    String uploadUrl = "/index.php?route=myoc/copu/upload&type=product&type_id=51&product_option_id=232&copu_product_id=1";
    String updatePasswordUrl = "/api/rest/account/password";
    String loginUrl = "/api/rest/login";
    String forgotUrl = "/api/rest/forgotten";
    String logoutUrl = "/api/rest/logout";
    String registerUrl = "/api/rest/register";
    String profileUrl = "/api/rest/account";
    String couponUrl = "/api/rest/coupon";
    String customerOrdersUrl = "/api/rest/customerorders";
    String customerOrderView = "api/rest/customerorders/{orderId}";
    String addressUrl = "/api/rest/account/address";
    String couponsUrl = "/api/rest/custom/coupons/";
    String cartConfirm = "/api/rest/confirm";
    String cartPay = "/api/rest/pay";

    @POST(nbosConnect)
    Call<NbosConnectResponse> connectToNbos(@Header("Authorization") String authorization, @Body NbosConnectModel nbosConnectModel);

    @POST(cartUrl)
    Call<AddToCartResponse> addToCart(@Header("Authorization") String authorization, @Header("X-Oc-Currency") String currency, @Body AddToCartApiModel addToCartApiModel);

    @GET(paymentMethods)
    Call<PaymentMethodsApiModel> getPaymentMethods(@Header("Authorization") String authorization);

    @GET(countriesUrl)
    Call<CountriesApiModel> getCountries(@Header("Authorization") String authorization);

    @GET(zoneIdUrl)
    Call<ZoneApiModel> getZones(@Header("Authorization") String authorization, @Path("country_id") String countryId);

    @GET(productById)
    Call<ProductsApiModel> getProductsById(@Header("Authorization") String authorization, @Header("X-Oc-Merchant-Language")String merchantLanguage,@Path("product_id") String productId);

    @POST(ocToken)
    Call<OpenCartTokenApiModel> getGuestToken(@Header("Authorization") String authorization);
    //@Multipart
//    @POST(uploadUrl)
//    Call<UploadResponse> upload(@Header("Authorization") String authorization, @PartMap Map<String, RequestBody> params);
//    @POST(cartUrl)
//    Call<CartResponse> postCart(@Header("Authorization") String authorization, @Body CartBody CartBody);
//    @POST(cartUrl)
//    Call<DeleteCartResponse> deleteCart(@Header("Authorization") String authorization, @Body Delete deleteCartBody);
//    @GET(cartUrl)
//    Call<GetCartResponse> getCart(@Header("Authorization") String authorization);
//    @GET(ordersUrl)
//    Call<OrdersResponse> getOrders(@Header("Authorization") String authorization);
//     @GET(addressUrl)
//    Call<AddressResponse> getAddresses(@Header("Authorization") String authorization);
//    @POST(addressUrl)
//    Call<AddressSuccessResponse> addAddress(@Header("Authorization") String authorization, @Body AddressBody addressBody);
//    @GET(couponsUrl)
//    Call<GetCouponResponse> getCoupons(@Header("Authorization") String authorization);
//    @POST(profileUrl)
//    Call<ProfileUpdateResponse> updateProfile(@Header("Authorization") String authorization, @Body ProfileDataModel profileDataModel);
//   @POST(couponUrl)
//    Call<CouponResponse> coupon(@Header("Authorization") String authorization, @Body CouponBody couponBody);

}
