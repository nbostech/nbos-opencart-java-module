package com.nbos.capi.modules.opencart.v0.models.cart;

import java.util.List;

/**
 * Created by vivekkiran on 8/16/16.
 */

public class ConfirmCartData {
    Long order_id;
    String payment;
    List<TotalsModel> totals;

    public List<VouchersModel> getVouchers() {
        return vouchers;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public String getPayment() {
        return payment;
    }

    public List<TotalsModel> getTotals() {
        return totals;
    }

    public List<ProductsModel> getProducts() {
        return products;
    }

    List<VouchersModel> vouchers;
    List<ProductsModel> products;

}
