package com.example.amazon.shopping.shoppingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/amazonshopping")
public class ShoppingController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/pay/{price}")
    public String pay(@PathVariable int price){
        String url = "http://PAYMENT-SERVICE/paymentService/paynow/"+price;
        return restTemplate.getForObject(url, String.class);
    }
}
