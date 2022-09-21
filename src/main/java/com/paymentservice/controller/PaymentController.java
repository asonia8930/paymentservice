package com.paymentservice.controller;

import com.paymentservice.entity.Payment;
import com.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
@CrossOrigin(origins = "*")
public class PaymentController {

    @Autowired
    PaymentService service;


    @PostMapping(value = "/doPayment")
    public Payment doPayment(@RequestBody Payment payment) {
        return service.doPayment(payment);
    }

    @GetMapping("/{orderId}")
    public Payment findPaymentHistoryByOrderId(@PathVariable int orderId) {
        return service.findPaymentHistoryByOrderId(orderId);
    }



}
