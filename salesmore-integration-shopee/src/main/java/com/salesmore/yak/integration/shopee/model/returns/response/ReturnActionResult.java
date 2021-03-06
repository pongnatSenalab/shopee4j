package com.salesmore.yak.integration.shopee.model.returns.response;

import com.salesmore.yak.integration.core.model.ModelEntity;
import com.salesmore.yak.integration.shopee.model.ErrorResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ReturnActionResult extends ErrorResponse implements ModelEntity {

    public static final long serialVersionUID = 1L;


    /**
     * The serial number of return.
     */
    private String returnsn;

    /**
     * Action Result Message
     */
    private String msg;
}
