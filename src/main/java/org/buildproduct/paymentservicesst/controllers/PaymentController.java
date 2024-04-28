package org.buildproduct.paymentservicesst.controllers;

import com.razorpay.RazorpayException;
import org.buildproduct.paymentservicesst.dtos.InitiatePaymentRequestDto;
import org.buildproduct.paymentservicesst.services.PaymentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    private PaymentService paymentService;
    PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
    }


    @PostMapping("/initiate")
    public String initiatePayment(@RequestBody InitiatePaymentRequestDto initiatePaymentRequestDto) throws RazorpayException {
        return  paymentService.initiatePayment(
                initiatePaymentRequestDto.getOrderId(),
                initiatePaymentRequestDto.getEmail(),
                initiatePaymentRequestDto.getAmount()
        );


    }

}
