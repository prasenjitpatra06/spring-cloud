package com.example.payment.service.paymentService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paymentService")
public class PaymentController {

    @GetMapping("/paynow/{price}")
    public String payNow(@PathVariable int price){
        return "Payment of Rs." + price + " completed";
    }
}
