package com.nbos.capi.modules.opencart.v0;

import com.nbos.capi.modules.opencart.v0.models.locale.CountriesApiModel;
import com.nbos.capi.modules.opencart.v0.models.locale.ZoneApiModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

/**
 * Created by vivekkiran on 7/29/16.
 */

public interface OCRemoteApi {

    String uploadUrl = "/index.php?route=myoc/copu/upload&type=product&type_id=51&product_option_id=232&copu_product_id=1";
    String cartUrl = "/api/rest/cart/";
    String tokenUrl = "/api/rest/oauth2/token/client_credentials";
    String updatePasswordUrl = "/api/rest/account/password";
    String loginUrl = "/api/rest/login";
    String forgotUrl = "/api/rest/forgotten";
    String logoutUrl = "/api/rest/logout";
    String registerUrl = "/api/rest/register";
    String profileUrl = "/api/rest/account";
    String couponUrl = "/api/rest/coupon";
    String ordersUrl = "/api/rest/customerorders";
    String addressUrl = "/api/rest/account/address";
    String couponsUrl = "/api/rest/custom/coupons/";
    String countriesUrl = "/api/rest/countries";
    String zoneIdUrl = "/api/rest/countries/{country_id}";


    @GET(countriesUrl)
    Call<CountriesApiModel> getCountries(@Header("Authorization") String authorization);
    @GET(zoneIdUrl)
    Call<ZoneApiModel> getZones(@Header("Authorization") String authorization, @Path("country_id") String countryId);
//
//    @Multipart
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
