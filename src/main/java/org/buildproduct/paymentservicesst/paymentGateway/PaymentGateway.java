package org.buildproduct.paymentservicesst.paymentGateway;

import com.razorpay.RazorpayException;
import org.springframework.stereotype.Component;


public interface PaymentGateway {
    public String generatePaymentLink(Long orderId, String email, Integer amount) throws RazorpayException;

}
