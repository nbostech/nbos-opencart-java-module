package com.nbos.capi.modules.opencart.v0;

import com.nbos.capi.modules.ids.v0.IDS;

/**
 * Created by vivekkiran on 7/29/16.
 */

public class OCIdsRegistry {
    static {
        IDS.register("opencart", OpenCartApi.class);
    }
}
