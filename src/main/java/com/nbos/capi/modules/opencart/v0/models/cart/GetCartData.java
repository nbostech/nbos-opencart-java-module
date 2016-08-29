package com.nbos.capi.modules.opencart.v0.models.cart;

import java.util.List;

/**
 * Created by vivekkiran on 8/26/16.
 */

public class GetCartData {
    String error_warning;
    String attention;
    String weight;
    String coupon_status;
    String coupon;
    String voucher_status;
    String voucher;
    Boolean reward_status;
    String reward;

    public String getError_warning() {
        return error_warning;
    }

    public String getAttention() {
        return attention;
    }

    public String getWeight() {
        return weight;
    }

    public String getCoupon_status() {
        return coupon_status;
    }

    public String getCoupon() {
        return coupon;
    }

    public String getVoucher_status() {
        return voucher_status;
    }

    public String getVoucher() {
        return voucher;
    }

    public Boolean getReward_status() {
        return reward_status;
    }

    public String getReward() {
        return reward;
    }

    public List<CartTotalList> getTotals() {
        return totals;
    }

    public List<GetCartProducts> getProducts() {
        return products;
    }

    List<CartTotalList> totals;
    List<GetCartProducts> products;
}
