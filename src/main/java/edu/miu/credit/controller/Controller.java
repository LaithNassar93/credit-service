package edu.miu.credit.controller;

import edu.miu.credit.model.PaymentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/credit")
public class Controller {

    @PostMapping("/payment")
    public String payment(@RequestBody PaymentRequest paymentRequest){
        return "Successfully Transferred $"+paymentRequest.getPrice()+" From your Credit";
    }
}
