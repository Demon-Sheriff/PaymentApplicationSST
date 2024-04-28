package org.buildproduct.paymentservicesst.services;

import com.razorpay.RazorpayException;
import org.buildproduct.paymentservicesst.paymentGateway.PaymentGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private PaymentGateway paymentGateway;

    PaymentService(PaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }
    public String initiatePayment(Long orderId, String email, Integer amount) throws RazorpayException {

        System.out.println("Initiating payment");
        return paymentGateway.generatePaymentLink(orderId, email, amount);
    }



}
