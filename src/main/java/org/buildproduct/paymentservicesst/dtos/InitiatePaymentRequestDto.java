package org.buildproduct.paymentservicesst.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InitiatePaymentRequestDto {
    private Long orderId;
    private String email;
    private Integer amount;

}
