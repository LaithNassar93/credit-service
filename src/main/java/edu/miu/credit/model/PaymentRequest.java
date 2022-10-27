package edu.miu.credit.model;

import lombok.Data;

@Data
public class PaymentRequest {
    private double price;
    private String cardNumber;
}